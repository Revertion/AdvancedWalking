package com.revertslayer.walking;


import org.powerbot.script.Condition;
import org.powerbot.script.rt6.Hud;

import com.revertslayer.RevertSlayer;
import com.revertslayer.api.ClientContext;
import com.revertslayer.support.Equipment;

public enum EquipmentTeleport implements Teleport {

	AMULET_OF_GLORY_EDGEVILLE(new int[] { 1712, 1710, 1708, 1706 },
			"Edgeville", Equipment.NECK), AMULET_OF_GLORY_AL_KHARID(new int[] {
			1712, 1710, 1708, 1706 }, "kharid", Equipment.NECK);

	public int[] id;
	public String action;
	public Equipment slot;

	EquipmentTeleport(int[] id, String action, Equipment slot) {
		this.id = id;
		this.action = action;
		this.slot = slot;
	}

	@Override
	public void teleport(ClientContext ctx) {
		if (!ctx.hud.opened(Hud.Window.WORN_EQUIPMENT)) {
			RevertSlayer.status = "Opening Equipment tab";
			ctx.hud.open(Hud.Window.WORN_EQUIPMENT);
		}
		RevertSlayer.status = "Teleporting using equipment";
		slot.interact(ctx, action);
		Condition.sleep(3000);
		while (ctx.players.local().animation() != -1) {
			Condition.sleep(50);
		}

	}

	@Override
	public boolean canUse(ClientContext ctx) {
		if (action.equals("Edgeville")) {
			return ctx.players.local().inCombat();
		}
		return arrayHasInt(id, slot.getIndex());
	}

	@Override
	public int[] getID() {
		return id;
	}

	public Equipment getSlot() {
		return slot;
	}

	public static boolean arrayHasInt(int[] array, int i) {
		for (int k : array) {
			if (k == i) {
				return true;
			}
		}
		return false;
	}

}
