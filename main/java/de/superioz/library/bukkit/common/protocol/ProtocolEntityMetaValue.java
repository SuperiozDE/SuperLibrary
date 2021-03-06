package de.superioz.library.bukkit.common.protocol;

import lombok.Getter;

/**
 * Created on 01.04.2016.
 */
@Getter
public enum ProtocolEntityMetaValue {

	ENTITY_ON_FIRE(0x01),
	ENTITY_CROUCHED(0x02),
	ENTITY_SPRINTING(0x08),
	ENTITY_EATING_DRINKING_BLOCKING(0x10),
	ENTITY_INVISIBLE(0x20),
	ENTITY_GLOWING_EFFECT(0x40),
	ENTITY_FLYING_ELYTRA(0x80),
	ARMOR_STAND_IS_SMALL(0x01),
	ARMOR_STAND_HAS_GRAVITY(0x02),
	ARMOR_STAND_HAS_ARMS(0x04),
	ARMOR_STAND_NO_BASEPLATE(0x08),
	ARMOR_STAND_SET_MARKER(0x10),
	INSENTIENT_NO_AI(0x01),
	INSENTIENT_LEFT_HANDED(0x02),
	HORSE_IS_TAME(0x02),
	HORSE_UNKNOWN(0x04),
	HORSE_HAS_CHEST(0x08),
	HORSE_UNKNOWN_2(0x10),
	HORSE_EATING(0x20),
	HORSE_PUT_ON_HIND_LEGS(0x40),
	HORSE_MOUTH_OPEN(0x80),
	TAMEABLE_ANIMAL_SITTING(0x01),
	TAMEABLE_ANIMAL_TAMED(0x04),
	SNOWMAN_NO_PUMPKIN(0x10),
	GUARDIAN_RETRACTING_SPIKES(0x02),
	GUARDIAN_ELDERLY(0x04);

	private byte bitMask;

	ProtocolEntityMetaValue(int bitMask){
		this.bitMask = (byte) bitMask;
	}

}
