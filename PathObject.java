package com.revertslayer.walking;

import org.powerbot.script.Filter;
import org.powerbot.script.Tile;
import org.powerbot.script.rt6.GameObject;

import com.revertslayer.api.ClientContext;

public class PathObject {

	public Tile location;
	public int id;
	public String interact;

	public PathObject(String interact, Tile location, int id) {
		this.id = id;
		this.location = location;
		this.interact = interact;
	}

	public Tile getLocation() {
		return location;
	}

	public GameObject getInstance(ClientContext ctx) {
		return ctx.objects.select(new Filter<GameObject>() {
			@Override
			public boolean accept(GameObject o) {
				return o != null && o.id() == id && o.inViewport();

			}
		}).nearest().poll();
	}

	public int getID() {
		return id;
	}

	public String getAction() {
		return interact;
	}
}
