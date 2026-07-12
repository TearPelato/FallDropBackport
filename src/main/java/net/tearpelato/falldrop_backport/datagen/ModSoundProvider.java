package net.tearpelato.falldrop_backport.datagen;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.SoundDefinitionsProvider;
import net.tearpelato.falldrop_backport.Constants;
import net.tearpelato.falldrop_backport.init.ModSounds;

public class ModSoundProvider extends SoundDefinitionsProvider {
    protected ModSoundProvider(PackOutput output) {
        super(output, Constants.NAMESPACE);
    }

    @Override
    public void registerSounds() {
        add(ModSounds.SHELF_MUSHROOM_BOUNCE.get(), definition()
                .subtitle("sounds.minecraft.shelf_mushroom.bounce")
                .with(sound(Constants.vanilla("block.shelf_mushroom.bounce1")),
                        sound(Constants.vanilla("block.shelf_mushroom.bounce2")),
                        sound(Constants.vanilla("block.shelf_mushroom.bounce3")),
                        sound(Constants.vanilla("block.shelf_mushroom.bounce4")),
                        sound(Constants.vanilla("block.shelf_mushroom.bounce5"))));

        add(ModSounds.SHELF_MUSHROOM_FALL.get(), definition().subtitle("sounds.minecraft.shelf_mushroom.bounce")
                .with(sound(Constants.vanilla("block.shelf_mushroom.fall"))));

        add(ModSounds.SHELF_MUSHROOM_BREAK.get(), definition().subtitle("sounds.minecraft.shelf_mushroom.break")
                .with(sound(Constants.vanilla("block.shelf_mushroom.break1")),
                        sound(Constants.vanilla("block.shelf_mushroom.break2")),
                        sound(Constants.vanilla("block.shelf_mushroom.break3")),
                        sound(Constants.vanilla("block.shelf_mushroom.break4")),
                        sound(Constants.vanilla("block.shelf_mushroom.break5")),
                        sound(Constants.vanilla("block.shelf_mushroom.break6"))));

        add(ModSounds.SHELF_MUSHROOM_PLACE.get(), definition().subtitle("sounds.minecraft.shelf_mushroom.bounce")
                .with(sound(Constants.vanilla("block.shelf_mushroom.place1")),
                        sound(Constants.vanilla("block.shelf_mushroom.place2")),
                        sound(Constants.vanilla("block.shelf_mushroom.place3")),
                        sound(Constants.vanilla("block.shelf_mushroom.place4")),
                        sound(Constants.vanilla("block.shelf_mushroom.place5")),
                        sound(Constants.vanilla("block.shelf_mushroom.place6"))));

        add(ModSounds.SHELF_MUSHROOM_STEP.get(), definition().subtitle("sounds.minecraft.shelf_mushroom.bounce")
                .with(sound(Constants.vanilla("block.shelf_mushroom.step1")),
                        sound(Constants.vanilla("block.shelf_mushroom.step2")),
                        sound(Constants.vanilla("block.shelf_mushroom.step3")),
                        sound(Constants.vanilla("block.shelf_mushroom.step4")),
                        sound(Constants.vanilla("block.shelf_mushroom.step5")),
                        sound(Constants.vanilla("block.shelf_mushroom.step6"))));


    }
}
