package net.tearpelato.falldrop_backport.init;

import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.core.Registry;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.tearpelato.falldrop_backport.Constants;

public class ModParticleTypes {
    public static final SimpleParticleType RED_POPLAR_LEAVES =
            registerParticle("red_poplar_leaves", FabricParticleTypes.simple());

    public static final SimpleParticleType ORANGE_POPLAR_LEAVES =
            registerParticle("orange_poplar_leaves", FabricParticleTypes.simple());

    public static final SimpleParticleType YELLOW_POPLAR_LEAVES =
            registerParticle("yellow_poplar_leaves", FabricParticleTypes.simple());


    private static SimpleParticleType registerParticle(String name, SimpleParticleType particleType) {
        return Registry.register(BuiltInRegistries.PARTICLE_TYPE, Constants.vanilla(name), particleType);
    }


    public static void registerParticles() {
        Constants.LOGGER.info("Registering Particles for " + Constants.MOD_ID);
    }
}