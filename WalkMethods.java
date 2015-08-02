package com.revertslayer.walking;


import org.powerbot.script.Condition;
import org.powerbot.script.Tile;
import org.powerbot.script.rt6.GameObject;
import org.powerbot.script.rt6.Menu;

import com.revertslayer.RevertSlayer;
import com.revertslayer.api.ClientContext;

public class WalkMethods extends org.powerbot.script.ClientAccessor<ClientContext> {

	public WalkMethods(ClientContext ctx) {
		super(ctx);
	}

	private static Tile[] reversePath(Tile tiles[]) {
		Tile r[] = new Tile[tiles.length];
		int i;
		for (i = 0; i < tiles.length; i++) {
			r[i] = tiles[(tiles.length - 1) - i];
		}
		return r;
	}

	public boolean walkReversed(final Tile[] path, Teleport[] teleport,
			InteractableNPC npc, PathObject... objects) {
		return walkPath(reversePath(path), teleport, npc, objects);
	}

	public boolean walkPath(final Tile[] path, Teleport[] teleports,
			InteractableNPC npc, final PathObject... objects) {
		boolean a = false;
		final Tile next = getNext(path);
		final Tile start = getStart(path);
		final Tile dest = ctx.movement.destination();
		final Tile myTile = ctx.players.local().tile();
		final PathObject nextObject = nextPO(objects);
		GameObject object = null;

		if (nextObject != null) {
			object = nextObject.getInstance(ctx);
		}

		if (ctx.movement.energyLevel() > 20 && !ctx.movement.running()) {
			ctx.movement.running(true);
		}
		if (next == null && object == null
				&& (npc == null || npc.getInstance(ctx) == null)) {
			System.out.println("Teleporting");
			Condition.sleep(3500);
			if (getNext(path) == null && nextPO(objects) == null) {
				for (Teleport teleport : teleports) {
					if (teleport.canUse(ctx)) {

						teleport.teleport(ctx);
						break;
					}
				}
			}
		} else if (object != null) {

			RevertSlayer.status = "Interacting with entity";
			if (object.interact(nextObject.getAction())) {
				Condition.sleep(1000);

			}
		} else if (npc != null && npc.getInstance(ctx) != null
				&& ctx.movement.distance(ctx.players.local().tile(), npc.getLocation()) < 2) {
			if (!ctx.players.local().tile().equals(npc.getContinueTile())) {
				if (ctx.movement.reachable(ctx.players.local(), npc.getLocation())) {
					//npc.talk();
				}
			}
		} else {
			System.out.println("Traversing");
			if (myTile == path[path.length - 1]) {
				System.out.println("RETURNED TRUE");
				return true;
			}
			if ((!ctx.players.local().inMotion() || ctx.movement.distance(dest) < 5) && object == null && !object.valid()) {

				if (!ctx.movement.newTilePath(next).traverse()) {
					if (ctx.movement.newTilePath(start).traverse()) {
						Condition.sleep(500);
						a = true;
					} else {
						walkTile(getClosestTileOnMap(next));

						while (ctx.players.local().inMotion()) {

						}
						Condition.sleep(500);
					}
				} else {
					Condition.sleep(500);
					a = true;
				}
			}
		}

		return a;
	}

	public Tile getClosestTileOnMap(final Tile tile) {
		if (ctx.game.loggedIn()) {
			final Tile loc = ctx.players.local().tile();
			final Tile walk = new Tile((loc.x() + tile.x()) / 2,
					(loc.y() + tile.y()) / 2, ctx.game.floor());
			return ctx.movement.distance(loc, walk) < 15 ? walk
					: getClosestTileOnMap(walk);
		}
		return tile;
	}

	public boolean walkTile(final Tile tile) {
		if ((ctx.movement.destination() == null || (ctx.movement.distance(ctx.players.local(), ctx.movement.destination()) < 6
				&& ctx.movement
				.distance(tile, ctx.movement.destination()) > 3))) {
			Condition.sleep(500);
			if (ctx.movement.reachable(ctx.players.local().tile(), tile)) {
				return ctx.movement.step(tile);
			} else if (ctx.movement.distance(ctx.players.local().tile(),
					tile) < 15) {
				return ctx.movement.newTilePath(tile).traverse();
			} else {
				return walkTile(getClosestTileOnMap(tile));
			}
		}
		return false;
	}

	public static Tile getStart(final Tile[] tiles) {
		return tiles[0];
	}

	public Tile getNext(final Tile[] tiles) {
		for (int i = tiles.length - 1; i >= 0; --i) {
			if (ctx.movement.distance(ctx.players.local().tile(),
					tiles[i]) < 15 && tiles[i].floor() == ctx.game.floor()) {
				return tiles[i];
			}
		}
		return null;
	}

	public PathObject nextPO(PathObject[] pathobjects) {
		for (int i = 0; i < pathobjects.length; i++) {

			if (pathobjects[i] != null
					&& pathobjects[i].getInstance(ctx) != null
					&& ctx.movement.reachable(ctx.players.local(), pathobjects[i].getLocation())
					&& ctx.movement.distance(pathobjects[i].getLocation()) < 6) {
				return pathobjects[i];
			}
		}
		return null;
	}

}