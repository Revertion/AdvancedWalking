package com.revertslayer.walking;

import org.powerbot.script.Tile;

public enum PathObjects {

	EDGEVILLE_SLAYER_MASTER(new PathObject[] {
			new PathObject("Open", new Tile(3096, 3468, 0), 26933),
			new PathObject("Open", new Tile(3102, 9910, 0), 29315),
			new PathObject("Climb-down", new Tile(3096, 3468, 0), 26934) }),

	LUMBRIDGE_COWS(new PathObject[] { new PathObject("Open", new Tile(3251,
			3267, 0), 45210) }),

	BASILISKS(new PathObject[] {
			new PathObject("Enter", new Tile(2795, 3616, 0), 34395),
			new PathObject("Enter", new Tile(2794, 3615, 0), 34395) }),

	DOGS(new PathObject[] { new PathObject("Squeeze", new Tile(2661, 3500, 0),
			51) }),

	VAMPYRES(new PathObject[] {
			new PathObject("Open", new Tile(3319, 3468, 0), 24369),
			new PathObject("Open", new Tile(3405, 3505, 0), 30571),
			new PathObject("down", new Tile(3405, 3505, 0), 30572),
			new PathObject("down", new Tile(3405, 3506, 0), 30572),
			new PathObject("Open", new Tile(3405, 9895, 0), 3444),
			new PathObject("Open", new Tile(3405, 9896, 0), 3444),
			new PathObject("Open", new Tile(3431, 9897, 0), 3445),
			new PathObject("Open", new Tile(3430, 9898, 0), 3445),
			new PathObject("through", new Tile(3440, 9888, 0), 3443),
			new PathObject("through", new Tile(3440, 9887, 0), 3443) }),

	BLOODVELDS(new PathObject[] {
			new PathObject("Open", new Tile(3319, 3468, 0), 24369),
			new PathObject("Open", new Tile(3405, 3505, 0), 30571),
			new PathObject("down", new Tile(3405, 3505, 0), 30572),
			new PathObject("down", new Tile(3405, 3506, 0), 30572),
			new PathObject("Open", new Tile(3405, 9895, 0), 3444),
			new PathObject("Open", new Tile(3405, 9896, 0), 3444),
			new PathObject("Open", new Tile(3406, 9896, 0), 3444),
			new PathObject("Open", new Tile(3431, 9897, 0), 3445),
			new PathObject("Open", new Tile(3430, 9898, 0), 3445),
			new PathObject("through", new Tile(3440, 9888, 0), 3443),
			new PathObject("through", new Tile(3440, 9887, 0), 3443),
			new PathObject("Open", new Tile(3428, 3535, 0), 4487),
			new PathObject("Climb", new Tile(3438, 3537, 0), 4493),
			new PathObject("Climb", new Tile(3438, 3538, 0), 4493) }),

	ICE_WARRIORS(new PathObject[] {
			new PathObject("down", new Tile(3008, 3154, 0), 9472),
			new PathObject("down", new Tile(3009, 3150, 0), 9472) }),

	SHADES(new PathObject[] {
			new PathObject("down", new Tile(3081, 3421, 0), 16154),
			new PathObject("down", new Tile(3080, 3421, 0), 16154),
			new PathObject("Enter", new Tile(1863, 5239, 0), 16150),
			new PathObject("Enter", new Tile(1863, 5240, 0), 16150),
			new PathObject("down", new Tile(1903, 5222, 0), 16149),
			new PathObject("down", new Tile(1903, 5223, 0), 16149),
			new PathObject("down", new Tile(1902, 5223, 0), 16149),
			new PathObject("Enter", new Tile(2040, 5241, 0), 16082),
			new PathObject("Enter", new Tile(2041, 5242, 0), 16082),
			new PathObject("down", new Tile(2026, 5217, 0), 16081),
			new PathObject("down", new Tile(2025, 5218, 0), 16081),
			new PathObject("Enter", new Tile(2120, 5257, 0), 16116),
			new PathObject("down", new Tile(2147, 5284, 0), 16115),
			new PathObject("down", new Tile(2147, 5285, 0), 16115)

	}),

	GROTWORMS(new PathObject[] {
			new PathObject("Enter", new Tile(2990, 3237, 0), 70792),
			new PathObject("Enter", new Tile(2990, 3238, 0), 70792) }),

	BANSHEES(new PathObject[] {
			new PathObject("Open", new Tile(3319, 3468, 0), 24369),
			new PathObject("Open", new Tile(3405, 3505, 0), 30571),
			new PathObject("down", new Tile(3405, 3505, 0), 30572),
			new PathObject("down", new Tile(3405, 3506, 0), 30572),
			new PathObject("Open", new Tile(3405, 9895, 0), 3444),
			new PathObject("Open", new Tile(3405, 9896, 0), 3444),
			new PathObject("Open", new Tile(3406, 9896, 0), 3444),
			new PathObject("Open", new Tile(3431, 9897, 0), 3445),
			new PathObject("Open", new Tile(3430, 9898, 0), 3445),
			new PathObject("through", new Tile(3440, 9888, 0), 3443),
			new PathObject("through", new Tile(3440, 9887, 0), 3443),
			new PathObject("Open", new Tile(3428, 3535, 0), 4487) }),

	MINOTAURS(new PathObject[] {
			new PathObject("down", new Tile(3081, 3421, 0), 16154),
			new PathObject("Open", new Tile(1859, 5239, 0), 16123),
			new PathObject("Open", new Tile(1859, 5236, 0), 16123),

	}),

	SCORPIONS(new PathObject[] {
			new PathObject("Open", new Tile(3061, 3374, 0), 11714),
			new PathObject("Down", new Tile(3061, 3376, 0), 35921) }),

	HILL_GIANTS(new PathObject[] {
			new PathObject("Open", new Tile(3096, 3468, 0), 26933),
			new PathObject("Open", new Tile(3102, 9910, 0), 29315),
			new PathObject("Climb-down", new Tile(3096, 3468, 0), 26934),
			new PathObject("Open", new Tile(3146, 9871, 0), 29315) }),

	INFERNAL_MAGES(new PathObject[] {
			new PathObject("Open", new Tile(3319, 3468, 0), 24369),
			new PathObject("Open", new Tile(3405, 3505, 0), 30571),
			new PathObject("down", new Tile(3405, 3505, 0), 30572),
			new PathObject("down", new Tile(3405, 3506, 0), 30572),
			new PathObject("Open", new Tile(3405, 9895, 0), 3444),
			new PathObject("Open", new Tile(3405, 9896, 0), 3444),
			new PathObject("Open", new Tile(3406, 9896, 0), 3444),
			new PathObject("Open", new Tile(3431, 9897, 0), 3445),
			new PathObject("Open", new Tile(3430, 9898, 0), 3445),
			new PathObject("through", new Tile(3440, 9888, 0), 3443),
			new PathObject("through", new Tile(3440, 9887, 0), 3443),
			new PathObject("Open", new Tile(3428, 3535, 0), 4487),
			new PathObject("Climb", new Tile(3438, 3537, 0), 4493),
			new PathObject("Climb", new Tile(3438, 3538, 0), 4493), }),

	CAVE_SLIME(new PathObject[] {
			new PathObject("Climb", new Tile(3168,3171,0), 5947)
	}),

	ANKOU(new PathObject[] {
			new PathObject("Climb", new Tile(3081, 3421, 0), 16154),
			new PathObject("Enter", new Tile(1863, 5239, 0), 16150),
			new PathObject("Climb", new Tile(1903, 5222, 0), 16149),
			new PathObject("Enter", new Tile(2040, 5241, 0), 16082),
			new PathObject("Climb", new Tile(2025, 5218, 0), 16081),
			new PathObject("Enter", new Tile(2121, 5257, 0), 16116),
			new PathObject("Climb", new Tile(2146, 5287, 0), 16115),
			new PathObject("Open", new Tile(2365, 5218, 0), 16044),
			new PathObject("Open", new Tile(2365, 5221, 0), 16044) }),

	BIRDS(new PathObject[] { new PathObject("Open", new Tile(3237, 3295, 0),
			45208) }),

	ZOMBIES(new PathObject[] {
			new PathObject("Climb-down", new Tile(3096, 3468, 0), 26934),
			new PathObject("Open", new Tile(3103, 9909, 0), 29316) }),

	GEL_ABO(new PathObject[] { new PathObject("Enter", new Tile(2927, 3406, 0),
			67043) }),

	BATS(new PathObject[] {
			new PathObject("Open", new Tile(2888, 9831, 0), 31844),
			new PathObject("Open", new Tile(2897, 9831, 0), 31827) }), NONE(
			new PathObject[] { null }),
			
	CAVE_BUG(new PathObject[] {
			new PathObject("Climb", new Tile(3168,3171,0), 5947)
	});

	public PathObject[] objects;

	PathObjects(PathObject[] objects) {
		this.objects = objects;
	}

	public PathObject[] getPathObjects() {
		return objects;
	}
}
