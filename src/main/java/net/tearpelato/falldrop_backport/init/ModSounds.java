package net.tearpelato.falldrop_backport.init;

import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.sounds.SoundEvent;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.util.DeferredSoundType;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.tearpelato.falldrop_backport.Constants;

import java.util.function.Supplier;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(BuiltInRegistries.SOUND_EVENT, Constants.NAMESPACE);

    public static final Supplier<SoundEvent> SHELF_MUSHROOM_BOUNCE = registerSoundEvent("block.shelf_mushroom.bounce");
    public static final Supplier<SoundEvent> SHELF_MUSHROOM_BREAK = registerSoundEvent("block.shelf_mushroom.break");
    public static final Supplier<SoundEvent> SHELF_MUSHROOM_FALL = registerSoundEvent("block.shelf_mushroom.fall");
    public static final Supplier<SoundEvent> SHELF_MUSHROOM_PLACE = registerSoundEvent("block.shelf_mushroom.place");
    public static final Supplier<SoundEvent> SHELF_MUSHROOM_STEP = registerSoundEvent("block.shelf_mushroom.step");
    public static final Supplier<SoundEvent> EMPTY = registerSoundEvent("intentionally_emptys");
    public static final Supplier<SoundEvent> POPLAR_LEAVES_BREAK = registerSoundEvent("block.poplar_leaves.break");
    public static final Supplier<SoundEvent> POPLAR_LEAVES_HIT = registerSoundEvent("block.poplar_leaves.hit");
    public static final Supplier<SoundEvent> POPLAR_LEAVES_FALL = registerSoundEvent("block.poplar_leaves.fall");
    public static final Supplier<SoundEvent> POPLAR_LEAVES_PLACE = registerSoundEvent("block.poplar_leaves.place");
    public static final Supplier<SoundEvent> POPLAR_LEAVES_STEP = registerSoundEvent("block.poplar_leaves.step");
    public static final Supplier<SoundEvent> POPLAR_LEAVES_AMBIENT = registerSoundEvent("block.poplar_leaves.ambient");
    public static final Supplier<SoundEvent> STRAW_BED_BREAK = registerSoundEvent("block.straw_bed.break");
    public static final Supplier<SoundEvent> STRAW_BED_BREAK_LEAVE = registerSoundEvent("block.straw_bed.break_leave");
    public static final Supplier<SoundEvent> STRAW_BED_STEP = registerSoundEvent("block.straw_bed.step");
    public static final Supplier<SoundEvent> STRAW_BED_PLACE = registerSoundEvent("block.straw_bed.place");
    public static final Supplier<SoundEvent> STRAW_BED_HIT = registerSoundEvent("block.straw_bed.hit");
    public static final Supplier<SoundEvent> STRAW_BED_FALL = registerSoundEvent("block.straw_bed.fall");
    public static final Supplier<SoundEvent> RED_SHRUB_BREAK = registerSoundEvent("block.red_shrub.break");
    public static final Supplier<SoundEvent> RED_SHRUB_PLACE = registerSoundEvent("block.red_shrub.place");

    public static final Supplier<SoundEvent> CUSHION_BREAK = registerSoundEvent("entity.cushion.break");
    public static final Supplier<SoundEvent> CUSHION_PLACE = registerSoundEvent("entity.cushion.place");
    public static final Supplier<SoundEvent> CUSHION_SIT = registerSoundEvent("entity.cushion.sit");
    public static final Supplier<SoundEvent> CUSHION_GET_UP = registerSoundEvent("entity.cushion.get_up");


    public static final DeferredSoundType SHELF_MUSHROOM = new DeferredSoundType(1.0f, 1.0f,SHELF_MUSHROOM_BREAK, SHELF_MUSHROOM_STEP,SHELF_MUSHROOM_PLACE, EMPTY, SHELF_MUSHROOM_FALL);
    public static final DeferredSoundType STRAW_BED = new DeferredSoundType(1.0F,1.0F, STRAW_BED_BREAK, STRAW_BED_STEP, STRAW_BED_PLACE,STRAW_BED_HIT, STRAW_BED_FALL);
    public static final DeferredSoundType POPLAR_LEAVES = new DeferredSoundType(1.0F,1.0F, POPLAR_LEAVES_BREAK, POPLAR_LEAVES_STEP, POPLAR_LEAVES_PLACE,POPLAR_LEAVES_HIT, POPLAR_LEAVES_FALL);
    public static final DeferredSoundType RED_SHRUB = new DeferredSoundType(1.0F,1.0F,RED_SHRUB_BREAK, EMPTY, RED_SHRUB_PLACE, EMPTY, EMPTY);

    private static Supplier<SoundEvent> registerSoundEvent(String name) {
        Identifier id = Constants.vanilla(name);
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(id));
    }

    public static void init(IEventBus bus) {
        SOUND_EVENTS.register(bus);
    }

}
