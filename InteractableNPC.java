package com.revertslayer.walking;


import org.powerbot.script.Condition;
import org.powerbot.script.Tile;
import org.powerbot.script.rt6.Component;
import org.powerbot.script.rt6.Npc;
import org.powerbot.script.rt6.Widget;

import com.revertslayer.RevertSlayer;
import com.revertslayer.api.ClientContext;

public enum InteractableNPC {

	Shantay(838, "Bribe", new String[] { "Yes", "Offer him" }, new Tile(3304,
			3118, 0), new Tile(3305, 3115, 0));

	private int id;
	private String talkAction;
	private String[] interfaceActions;
	private Tile location, continueTile;

	InteractableNPC(int id, String talkAction, String[] interfaceActions,
			Tile location, Tile continueTile) {
		this.id = id;
		this.talkAction = talkAction;
		this.interfaceActions = interfaceActions;
		this.location = location;
		this.continueTile = continueTile;
	}

	public Tile getLocation() {
		return location;
	}

	/*public void talk(ClientContext ctx) {
		RevertSlayer.status = "Interacting with NPC";
		for (String g : interfaceActions) {
			Component wc = ctx.widgets.widgets(g).peek();
			if (wc != null && wc.valid()) {
				ctx.mouse.click(wc.id());
				Condition.sleep(4000);
			}
		}
		Npc instance = ctx.npcs.select().id(id).nearest().poll();
		if (instance.inViewport()) {
			instance.interact(talkAction);
			Condition.sleep(1250);
		}

	}*/

	public Tile getContinueTile() {
		return continueTile;
	}

	public Npc getInstance(ClientContext ctx) {
		return ctx.npcs.select().id(id).nearest().poll();
	}

	private Component getWidgetChild(ClientContext ctx, String text) {
		for (Component w : ctx.widgets.peek()) {
			for (Component wc : w.components()) {
				if (wc.text().contains(text)) {
					return wc;
				}
			}
		}
		return null;
	}
}
