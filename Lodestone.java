package com.revertslayer.walking;



import org.powerbot.script.Condition;
import org.powerbot.script.rt6.Component;
import org.powerbot.script.rt6.Hud;

import com.revertslayer.RevertSlayer;
import com.revertslayer.api.ClientContext;

public enum Lodestone implements Teleport {

	LUMBRIDGE(47), EDGEVILLE(45), PORT_SARIM(48), YANILLE(52), AL_KHARID(40), FALADOR(
			46), VARROCK(51), BURTHOPE(42), TAVERLY(50), DRAYNOR(44), CATHERBY(
			43), SEERS_VILLAGE(49), ARDOUGNE(41);

	public int widgetchild;
	public int main = 1092;

	public static int interfaceMain = 192;
	public static int interfaceChild = 24;

	public static int interfaceMain2 = 193;
	public static int interfaceChild2 = 48;

	Lodestone(int widgetchild) {
		this.widgetchild = widgetchild;
	}

	public static void openInterface(ClientContext ctx) {
		if (!ctx.hud.opened(Hud.Window.MAGIC_ABILITIES)) {
			RevertSlayer.status = "Opening Magic tab";
			ctx.hud.open(Hud.Window.MAGIC_ABILITIES);
		}

		Component theChild = ctx.widgets.component(interfaceMain, interfaceChild);
		Component theChild2 = ctx.widgets.component(interfaceMain2, interfaceChild2);
		RevertSlayer.status = "Opening interface";
		if (theChild.valid()) {
			theChild.click(true);
			Condition.sleep(1000);
		} else {
			theChild2.click(true);
			Condition.sleep(1000);
		}
	}

	public void click(ClientContext ctx) {
		RevertSlayer.status = "Teleporting using lodestone";
		ctx.widgets.component(main, widgetchild).click(true);
		Condition.sleep(1000);
		ctx.hud.open(Hud.Window.BACKPACK);

	}


	@Override
	public int[] getID() {
		return null;
	}

	@Override
	public boolean canUse(ClientContext ctx) {
		return true;
	}

	

	@Override
	public void teleport(ClientContext ctx) {
		openInterface(ctx);
		Condition.sleep(1000);
		click(ctx);
		Condition.sleep(1000);
		while (ctx.players.local().animation() != -1) {
			Condition.sleep(50);
		}
	}

}
