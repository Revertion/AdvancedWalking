package com.revertslayer.walking;

import org.powerbot.script.rt6.Item;

import com.revertslayer.api.ClientContext;

public enum TeleportTabs implements Teleport {
	VARROCK_TAB(8007), FALADOR_TAB(8009), LUMBRIDGE_TAB(8008), CAMELOT_TAB(8010), ARDOUGNE_TAB(
			8011);

	public int id;

	TeleportTabs(int id) {
		this.id = id;
	}

	public void teleport(ClientContext ctx) {
		ctx.backpack.select().id(id).limit(1).poll().interact("Break");
	}

	public boolean canUse(ClientContext ctx) {
		return ctx.backpack.select().id(id).count() > 0;
	}

	public int[] getID() {
		return new int[] { id };
	}

	public void teleport() {
		// TODO Auto-generated method stub
		
	}

	public boolean canUse() {
		// TODO Auto-generated method stub
		return false;
	}

}
