package com.revertslayer.walking;

import org.powerbot.script.Tile;

import com.revertslayer.api.ClientContext;

public enum AdvancedPath {

	EDGEVILLE_SLAYER_MASTER(Paths.EDGEVILLE_SLAYER_MASTER.getPath(),
			Teleports.EDGEVILLE.getTeleports(), null,
			PathObjects.EDGEVILLE_SLAYER_MASTER.getPathObjects()), LUMBRIDGE_COWS(
			Paths.LUMBRDIGE_COWS.getPath(), Teleports.LUMBRIDGE.getTeleports(),
			null, PathObjects.LUMBRIDGE_COWS.getPathObjects()), EDGEVILLE_BANK(
			Paths.EDGEVILLE_BANK.getPath(), Teleports.EDGEVILLE.getTeleports(),
			null, PathObjects.NONE.getPathObjects()), STRONGHOLD_SHADES(
			Paths.STRONGHOLD_SHADES.getPath(), Teleports.EDGEVILLE
					.getTeleports(), null, PathObjects.SHADES.getPathObjects()), TAVERLY_SLAYER_MASTER(
			Paths.TAVERLY_SLAYER_MASTER.getPath(), Teleports.TAVERLY
					.getTeleports(), null, PathObjects.NONE.getPathObjects()), BASILISKS(
			Paths.BASILISKS.getPath(), Teleports.SEERS_VILLAGE.getTeleports(),
			null, PathObjects.BASILISKS.getPathObjects()), GHOSTS(Paths.GHOSTS
			.getPath(), Teleports.ARDOUGNE.getTeleports(), null,
			PathObjects.NONE.getPathObjects()), DOGS(Paths.DOGS.getPath(),
			Teleports.SEERS_VILLAGE.getTeleports(), null, PathObjects.DOGS
					.getPathObjects()), VAMPYRES(Paths.VAMPYRES.getPath(),
			Teleports.VARROCK.getTeleports(), null, PathObjects.VAMPYRES
					.getPathObjects()), BLOODVELDS(Paths.BLOODVELD.getPath(),
			Teleports.VARROCK.getTeleports(), null, PathObjects.BLOODVELDS
					.getPathObjects()), ICE_WARRIOR(Paths.ICE_WARRIORS
			.getPath(), Teleports.PORT_SARIM.getTeleports(), null,
			PathObjects.ICE_WARRIORS.getPathObjects()), GROTWORM(
			Paths.GROTWORMS.getPath(), Teleports.PORT_SARIM.getTeleports(),
			null, PathObjects.GROTWORMS.getPathObjects()), DWARVE(Paths.DWARVES
			.getPath(), Teleports.FALADOR.getTeleports(), null,
			PathObjects.NONE.getPathObjects()), BANSHEE(Paths.BANSHEES
			.getPath(), Teleports.VARROCK.getTeleports(), null,
			PathObjects.BANSHEES.getPathObjects()), GHOULS(Paths.GHOULS
			.getPath(), Teleports.VARROCK.getTeleports(), null,
			PathObjects.VAMPYRES.getPathObjects()), MINOTAURS(Paths.MINOTAURS
			.getPath(), Teleports.EDGEVILLE.getTeleports(), null,
			PathObjects.MINOTAURS.getPathObjects()), JELLIES(Paths.JELLIES
			.getPath(), Teleports.SEERS_VILLAGE.getTeleports(), null,
			PathObjects.BASILISKS.getPathObjects()), SCORPIONS(Paths.SCORPIONS
			.getPath(), Teleports.FALADOR.getTeleports(), null,
			PathObjects.SCORPIONS.getPathObjects()), HILL_GIANTS(
			Paths.HILL_GIANTS.getPath(), Teleports.EDGEVILLE.getTeleports(),
			null, PathObjects.HILL_GIANTS.getPathObjects()), CRAWLING_HANDS(
			Paths.CRAWLING_HANDS.getPath(), Teleports.VARROCK.getTeleports(),
			null, PathObjects.BANSHEES.getPathObjects()), HOBGOBLINS(
			Paths.HOBGOBLINS.getPath(), Teleports.EDGEVILLE.getTeleports(),
			null, PathObjects.HILL_GIANTS.getPathObjects()), SKELETONS(
			Paths.SKELETONS.getPath(), Teleports.EDGEVILLE.getTeleports(),
			null, PathObjects.EDGEVILLE_SLAYER_MASTER.getPathObjects()), BEARS(
			Paths.BEARS.getPath(), Teleports.ARDOUGNE.getTeleports(), null,
			PathObjects.NONE.getPathObjects()), CROCODILES(Paths.CROCODILES
			.getPath(), Teleports.AL_KHARID.getTeleports(),
			InteractableNPC.Shantay, PathObjects.NONE.getPathObjects()),

	INFERNAL_MAGES(Paths.INFERNAL_MAGES.getPath(), Teleports.VARROCK
			.getTeleports(), null, PathObjects.INFERNAL_MAGES.getPathObjects()), ICEFIENDS(
			Paths.ICEFIENDS.getPath(), Teleports.FALADOR.getTeleports(), null,
			PathObjects.NONE.getPathObjects()),

	CAVE_SLIME(Paths.CAVE_SLIME.getPath(), Teleports.LUMBRIDGE.getTeleports(),
			null, PathObjects.CAVE_SLIME.getPathObjects()), 
	
	ANKOU(Paths.ANKOU
			.getPath(), Teleports.EDGEVILLE.getTeleports(), null,
			PathObjects.ANKOU.getPathObjects()), 

	BIRDS(Paths.BIRDS.getPath(),
			Teleports.LUMBRIDGE.getTeleports(), null, PathObjects.BIRDS
					.getPathObjects()), 
	ICE_GIANTS(Paths.ICE_GIANTS.getPath(),
			Teleports.PORT_SARIM.getTeleports(), null, PathObjects.ICE_WARRIORS
					.getPathObjects()), DESERT_LIZARDS(Paths.DESERT_LIZARDS
			.getPath(), Teleports.AL_KHARID.getTeleports(),
			InteractableNPC.Shantay, PathObjects.NONE.getPathObjects()), ZOMBIE(
			Paths.ZOMBIES.getPath(), Teleports.EDGEVILLE.getTeleports(), null,
			PathObjects.ZOMBIES.getPathObjects()), SPIDER(Paths.SPIDERS
			.getPath(), Teleports.LUMBRIDGE.getTeleports(), null,
			PathObjects.NONE.getPathObjects()), GEL_ABO(Paths.GEL_ABOM
			.getPath(), Teleports.TAVERLY.getTeleports(), null,
			PathObjects.GEL_ABO.getPathObjects()), BATS(Paths.BATS.getPath(),
			Teleports.TAVERLY.getTeleports(), null, PathObjects.BATS
					.getPathObjects()),
					
		CAVE_BUG(Paths.CAVE_BUGS.getPath(), 
				Teleports.LUMBRIDGE.getTeleports(), null,
				PathObjects.CAVE_BUG.getPathObjects()),
				
		GOBLIN(Paths.GOBLINS.getPath(),
				Teleports.LUMBRIDGE.getTeleports(), null,
				PathObjects.NONE.getPathObjects());

	public Tile[] path;
	public PathObject[] objects;
	public Teleport[] teleport;
	public InteractableNPC npc;

	AdvancedPath(Tile[] path, Teleport[] teleport, InteractableNPC npc,
			PathObject... objects) {
		this.path = path;
		this.objects = objects;
		this.teleport = teleport;
		this.npc = npc;
	}

	public boolean walkPath(ClientContext ctx) {
		return ctx.walk.walkPath(path, teleport, npc, objects);
	}
}
