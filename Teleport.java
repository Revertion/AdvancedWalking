package com.revertslayer.walking;

import com.revertslayer.api.ClientContext;

public interface Teleport {

	

	public abstract int[] getID();

	public abstract boolean canUse(ClientContext ctx);

	public abstract void teleport(ClientContext ctx);
}
