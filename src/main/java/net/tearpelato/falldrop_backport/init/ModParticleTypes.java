package net.tearpelato.falldrop_backport.init;

import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.tearpelato.falldrop_backport.Constants;

import java.util.function.Supplier;

public class ModParticleTypes {
    public static final DeferredRegister<ParticleType<?>> PARTICLE_TYPES =
            DeferredRegister.create(BuiltInRegistries.PARTICLE_TYPE, Constants.NAMESPACE);

    public static final Supplier<SimpleParticleType> RED_POPLAR_LEAVES =
            PARTICLE_TYPES.register("red_poplar_leaves", () -> new SimpleParticleType(false));

    public static final Supplier<SimpleParticleType> ORANGE_POPLAR_LEAVES =
            PARTICLE_TYPES.register("orange_poplar_leaves", () -> new SimpleParticleType(false));

    public static final Supplier<SimpleParticleType> YELLOW_POPLAR_LEAVES =
            PARTICLE_TYPES.register("yellow_poplar_leaves", () -> new SimpleParticleType(false));

    public static void init(IEventBus eventBus) {
        PARTICLE_TYPES.register(eventBus);
    }
}
