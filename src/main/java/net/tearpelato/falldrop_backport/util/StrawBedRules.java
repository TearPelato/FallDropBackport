package net.tearpelato.falldrop_backport.util;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.ComponentSerialization;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

import java.util.Optional;

public record StrawBedRules(StrawBedRules.Rule canSleep, StrawBedRules.Rule canSetSpawn, boolean destroyOnUse, boolean destroyOnLeave, Optional<Component> errorMessage) {
    public static final StrawBedRules CAN_SLEEP_WHEN_DARK;
    public static final StrawBedRules DESTROY_ON_USE;
    public static final StrawBedRules DESTROY_ON_LEAVE;
    public static final Codec<StrawBedRules> CODEC;

    public boolean canSleep(final Level level) {
        return this.canSleep.test(level);
    }

    public boolean canSetSpawn(final Level level) {
        return this.canSetSpawn.test(level);
    }

    public Player.BedSleepingProblem asProblem() {
        return new Player.BedSleepingProblem((Component)this.errorMessage.orElse(null));
    }

    static {
        CAN_SLEEP_WHEN_DARK = new StrawBedRules(StrawBedRules.Rule.WHEN_DARK, StrawBedRules.Rule.ALWAYS, false, false, Optional.of(Component.translatable("block.minecraft.bed.no_sleep")));
        DESTROY_ON_USE = new StrawBedRules(StrawBedRules.Rule.NEVER, StrawBedRules.Rule.NEVER, true, false, Optional.empty());
        DESTROY_ON_LEAVE = new StrawBedRules(StrawBedRules.Rule.WHEN_DARK, StrawBedRules.Rule.NEVER, false, true, Optional.of(Component.translatable("block.minecraft.bed.no_sleep")));
        CODEC = RecordCodecBuilder.create((i) -> i.group(StrawBedRules.Rule.CODEC.fieldOf("can_sleep").forGetter(StrawBedRules::canSleep), StrawBedRules.Rule.CODEC.fieldOf("can_set_spawn").forGetter(StrawBedRules::canSetSpawn), Codec.BOOL.optionalFieldOf("destroy_on_use", false).forGetter(StrawBedRules::destroyOnUse), Codec.BOOL.optionalFieldOf("destroy_on_leave", false).forGetter(StrawBedRules::destroyOnLeave), ComponentSerialization.CODEC.optionalFieldOf("error_message").forGetter(StrawBedRules::errorMessage)).apply(i, StrawBedRules::new));
    }

    public enum Rule implements StringRepresentable {
        ALWAYS("always"),
        WHEN_DARK("when_dark"),
        NEVER("never");

        public static final Codec<StrawBedRules.Rule> CODEC = StringRepresentable.fromEnum(StrawBedRules.Rule::values);
        private final String name;

        private Rule(final String name) {
            this.name = name;
        }

        public boolean test(final Level level) {
            boolean var10000;
            switch (this.ordinal()) {
                case 0 -> var10000 = true;
                case 1 -> var10000 = level.isDarkOutside();
                case 2 -> var10000 = false;
                default -> throw new MatchException((String)null, (Throwable)null);
            }

            return var10000;
        }

        public String getSerializedName() {
            return this.name;
        }
    }
}
