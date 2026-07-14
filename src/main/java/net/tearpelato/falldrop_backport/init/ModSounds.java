package net.tearpelato.falldrop_backport.init;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.block.SoundType;
import net.tearpelato.falldrop_backport.Constants;

public class ModSounds {

    public static final SoundEvent SHELF_MUSHROOM_BOUNCE = registerSoundEvent("block.shelf_mushroom.bounce");
    public static final SoundEvent SHELF_MUSHROOM_BREAK = registerSoundEvent("block.shelf_mushroom.break");
    public static final SoundEvent SHELF_MUSHROOM_FALL = registerSoundEvent("block.shelf_mushroom.fall");
    public static final SoundEvent SHELF_MUSHROOM_PLACE = registerSoundEvent("block.shelf_mushroom.place");
    public static final SoundEvent SHELF_MUSHROOM_STEP = registerSoundEvent("block.shelf_mushroom.step");
    public static final SoundEvent EMPTY = registerSoundEvent("intentionally_emptys");
    public static final SoundEvent POPLAR_LEAVES_BREAK = registerSoundEvent("block.poplar_leaves.break");
    public static final SoundEvent POPLAR_LEAVES_HIT = registerSoundEvent("block.poplar_leaves.hit");
    public static final SoundEvent POPLAR_LEAVES_FALL = registerSoundEvent("block.poplar_leaves.fall");
    public static final SoundEvent POPLAR_LEAVES_PLACE = registerSoundEvent("block.poplar_leaves.place");
    public static final SoundEvent POPLAR_LEAVES_STEP = registerSoundEvent("block.poplar_leaves.step");
    public static final SoundEvent STRAW_BED_BREAK = registerSoundEvent("block.straw_bed.break");
    public static final SoundEvent STRAW_BED_BREAK_LEAVE = registerSoundEvent("block.straw_bed.break_leave");
    public static final SoundEvent STRAW_BED_STEP = registerSoundEvent("block.straw_bed.step");
    public static final SoundEvent STRAW_BED_PLACE = registerSoundEvent("block.straw_bed.place");
    public static final SoundEvent STRAW_BED_HIT = registerSoundEvent("block.straw_bed.hit");
    public static final SoundEvent STRAW_BED_FALL = registerSoundEvent("block.straw_bed.fall");
    public static final SoundEvent RED_SHRUB_BREAK = registerSoundEvent("block.red_shrub.break");
    public static final SoundEvent RED_SHRUB_PLACE = registerSoundEvent("block.red_shrub.place");

    public static final SoundEvent CUSHION_BREAK = registerSoundEvent("entity.cushion.break");
    public static final SoundEvent CUSHION_PLACE = registerSoundEvent("entity.cushion.place");
    public static final SoundEvent CUSHION_SIT = registerSoundEvent("entity.cushion.sit");
    public static final SoundEvent CUSHION_GET_UP = registerSoundEvent("entity.cushion.get_up");


    public static final SoundType SHELF_MUSHROOM = new SoundType(1.0f, 1.0f,SHELF_MUSHROOM_BREAK, SHELF_MUSHROOM_STEP,SHELF_MUSHROOM_PLACE, EMPTY, SHELF_MUSHROOM_FALL);
    public static final SoundType STRAW_BED = new SoundType(1.0F,1.0F, STRAW_BED_BREAK, STRAW_BED_STEP, STRAW_BED_PLACE,STRAW_BED_HIT, STRAW_BED_FALL);
    public static final SoundType POPLAR_LEAVES = new SoundType(1.0F,1.0F, POPLAR_LEAVES_BREAK, POPLAR_LEAVES_STEP, POPLAR_LEAVES_PLACE,POPLAR_LEAVES_HIT, POPLAR_LEAVES_FALL);
    public static final SoundType RED_SHRUB = new SoundType(1.0F,1.0F,RED_SHRUB_BREAK, EMPTY, RED_SHRUB_PLACE, EMPTY, EMPTY);

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = Identifier.fromNamespaceAndPath(Constants.NAMESPACE, name);
        return Registry.register(BuiltInRegistries.SOUND_EVENT, id, SoundEvent.createVariableRangeEvent(id));
    }

    public static void registerSounds() {
        Constants.LOGGER.info("Registering Mod Sounds for " + Constants.MOD_ID);
    }
}