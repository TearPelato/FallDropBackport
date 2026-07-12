package net.tearpelato.falldrop_backport.init;

import net.minecraft.core.registries.BuiltInRegistries;
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


    public static final DeferredSoundType SHELF_MUSHROOM = new DeferredSoundType(1.0f, 1.0f,SHELF_MUSHROOM_BREAK, SHELF_MUSHROOM_STEP,SHELF_MUSHROOM_PLACE, EMPTY, SHELF_MUSHROOM_FALL);

    private static Supplier<SoundEvent> registerSoundEvent(String name) {
        Identifier id = Constants.vanilla(name);
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(id));
    }

    public static void init(IEventBus bus) {
        SOUND_EVENTS.register(bus);
    }

}
