package com.revertslayer.walking;


import org.powerbot.script.Condition;
import org.powerbot.script.rt6.Hud;

import com.revertslayer.api.ClientContext;

public enum RuneTeleport implements Teleport {

	VARROCK(-1, new int[] { 554, 563, 556 }, new int[] { 1, 1, 3 }), FALADOR(
			-1, new int[] { 555, 563, 556 }, new int[] { 1, 1, 3 });

	public int[] runes;
	public int[] required;
	public int child;
	public int main = -1;

	RuneTeleport(int child, int[] runes, int[] required) {
		this.runes = runes;
		this.child = child;
		this.required = required;
	}

	@Override
	public void teleport(ClientContext ctx) {
		if (!ctx.hud.opened(Hud.Window.MAGIC_ABILITIES)) {
			ctx.hud.open(Hud.Window.MAGIC_ABILITIES);
		}

		ctx.widgets.component(main, child).click(true);
		Condition.sleep(1000);
		while (ctx.players.local().animation() != -1) {
			Condition.sleep(50);
		}

	}

	@Override
	public boolean canUse(ClientContext ctx) {
		for (int i = 0; i < runes.length; i++) {
			if (ctx.backpack.select().id(runes[i]) != null) {
				if (ctx.backpack.select().id(runes[i]).size() >= required[i]) {
					continue;
				} else {
					return false;
				}
			} else {
				return false;
			}
		}
		return true;
	}

	@Override
	public int[] getID() {
		return runes;
	}

	public void teleport() {
		// TODO Auto-generated method stub
		
	}

	public boolean canUse() {
		// TODO Auto-generated method stub
		return false;
	}

}
