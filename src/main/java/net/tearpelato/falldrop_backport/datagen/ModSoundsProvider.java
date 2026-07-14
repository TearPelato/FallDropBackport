package net.tearpelato.falldrop_backport.datagen;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.SoundDefinitionsProvider;
import net.tearpelato.falldrop_backport.Constants;
import net.tearpelato.falldrop_backport.init.ModSounds;

public class ModSoundsProvider extends SoundDefinitionsProvider {
    protected ModSoundsProvider(PackOutput output) {
        super(output, Constants.NAMESPACE);
    }

    @Override
    public void registerSounds() {
        add(ModSounds.SHELF_MUSHROOM_BOUNCE.get(), definition()
                .subtitle("sounds.minecraft.shelf_mushroom.bounce")
                .with(sound(Constants.vanilla("block/shelf_mushroom/bounce1")),
                        sound(Constants.vanilla("block/shelf_mushroom/bounce2")),
                        sound(Constants.vanilla("block/shelf_mushroom/bounce3")),
                        sound(Constants.vanilla("block/shelf_mushroom/bounce4")),
                        sound(Constants.vanilla("block/shelf_mushroom/bounce5"))));

        add(ModSounds.SHELF_MUSHROOM_FALL.get(), definition().subtitle("sounds.minecraft.shelf_mushroom.bounce")
                .with(sound(Constants.vanilla("block/shelf_mushroom/fall"))));

        add(ModSounds.SHELF_MUSHROOM_BREAK.get(), definition().subtitle("sounds.minecraft.shelf_mushroom.break")
                .with(sound(Constants.vanilla("block/shelf_mushroom/break1")),
                        sound(Constants.vanilla("block/shelf_mushroom/break2")),
                        sound(Constants.vanilla("block/shelf_mushroom/break3")),
                        sound(Constants.vanilla("block/shelf_mushroom/break4")),
                        sound(Constants.vanilla("block/shelf_mushroom/break5")),
                        sound(Constants.vanilla("block/shelf_mushroom/break6"))));

        add(ModSounds.SHELF_MUSHROOM_PLACE.get(), definition().subtitle("sounds.minecraft.shelf_mushroom.place")
                .with(sound(Constants.vanilla("block/shelf_mushroom/place1")),
                        sound(Constants.vanilla("block/shelf_mushroom/place2")),
                        sound(Constants.vanilla("block/shelf_mushroom/place3")),
                        sound(Constants.vanilla("block/shelf_mushroom/place4")),
                        sound(Constants.vanilla("block/shelf_mushroom/place5")),
                        sound(Constants.vanilla("block/shelf_mushroom/place6"))));

        add(ModSounds.SHELF_MUSHROOM_STEP.get(), definition().subtitle("sounds.minecraft.shelf_mushroom.step")
                .with(sound(Constants.vanilla("block/shelf_mushroom/step1")),
                        sound(Constants.vanilla("block/shelf_mushroom/step2")),
                        sound(Constants.vanilla("block/shelf_mushroom/step3")),
                        sound(Constants.vanilla("block/shelf_mushroom/step4")),
                        sound(Constants.vanilla("block/shelf_mushroom/step5")),
                        sound(Constants.vanilla("block/shelf_mushroom/step6"))));

        add(ModSounds.RED_SHRUB_BREAK.get(), definition().subtitle("sounds.minecraft.red_shrub.break")
                .with(sound(Constants.vanilla("block/red_shrub/break1")),
                        sound(Constants.vanilla("block/red_shrub/break2")),
                        sound(Constants.vanilla("block/red_shrub/break3")),
                        sound(Constants.vanilla("block/red_shrub/break4"))));

        add(ModSounds.RED_SHRUB_PLACE.get(), definition().subtitle("sounds.minecraft.red_shrub.place")
                .with(sound(Constants.vanilla("block/red_shrub/place1")),
                        sound(Constants.vanilla("block/red_shrub/place2")),
                        sound(Constants.vanilla("block/red_shrub/place3")),
                        sound(Constants.vanilla("block/red_shrub/place4"))));

        add(ModSounds.STRAW_BED_BREAK.get(), definition().subtitle("sounds.minecraft.straw_bed.break")
                .with(sound(Constants.vanilla("block/straw_bed/break1")),
                        sound(Constants.vanilla("block/straw_bed/break2")),
                        sound(Constants.vanilla("block/straw_bed/break3")),
                        sound(Constants.vanilla("block/straw_bed/break4"))));

        add(ModSounds.STRAW_BED_BREAK_LEAVE.get(), definition().subtitle("sounds.minecraft.straw_bed.leave")
                .with(sound(Constants.vanilla("block/straw_bed/break_leave"))));

        add(ModSounds.STRAW_BED_HIT.get(), definition().subtitle("sounds.minecraft.straw_bed.hit")
                .with(sound(Constants.vanilla("block/straw_bed/hit1")),
                        sound(Constants.vanilla("block/straw_bed/hit2")),
                        sound(Constants.vanilla("block/straw_bed/hit3")),
                        sound(Constants.vanilla("block/straw_bed/hit4")),
                        sound(Constants.vanilla("block/straw_bed/hit5")),
                        sound(Constants.vanilla("block/straw_bed/hit6"))));

        add(ModSounds.STRAW_BED_PLACE.get(), definition().subtitle("sounds.minecraft.straw_bed.place")
                .with(sound(Constants.vanilla("block/straw_bed/place1")),
                        sound(Constants.vanilla("block/straw_bed/place2")),
                        sound(Constants.vanilla("block/straw_bed/place3")),
                        sound(Constants.vanilla("block/straw_bed/place4"))));

        add(ModSounds.STRAW_BED_STEP.get(), definition().subtitle("sounds.minecraft.shelf_mushroom.step")
                .with(sound(Constants.vanilla("block/straw_bed/step1")),
                        sound(Constants.vanilla("block/straw_bed/step2")),
                        sound(Constants.vanilla("block/straw_bed/step3")),
                        sound(Constants.vanilla("block/straw_bed/step4")),
                        sound(Constants.vanilla("block/straw_bed/step5")),
                        sound(Constants.vanilla("block/straw_bed/step6"))));

        add(ModSounds.CUSHION_BREAK.get(), definition().subtitle("sounds.minecraft.cushion.break")
                .with(sound(Constants.vanilla("entity/cushion/break1")),
                        sound(Constants.vanilla("entity/cushion/break2")),
                        sound(Constants.vanilla("entity/cushion/break3"))));

        add(ModSounds.CUSHION_GET_UP.get(), definition().subtitle("sounds.minecraft.cushion.break")
                .with(sound(Constants.vanilla("entity/cushion/get_up1")),
                        sound(Constants.vanilla("entity/cushion/get_up2")),
                        sound(Constants.vanilla("entity/cushion/get_up3"))));

        add(ModSounds.CUSHION_PLACE.get(), definition().subtitle("sounds.minecraft.cushion.break")
                .with(sound(Constants.vanilla("entity/cushion/place1")),
                        sound(Constants.vanilla("entity/cushion/place2")),
                        sound(Constants.vanilla("entity/cushion/place3")),
                        sound(Constants.vanilla("entity/cushion/place4")),
                        sound(Constants.vanilla("entity/cushion/place5")),
                        sound(Constants.vanilla("entity/cushion/place6"))));

        add(ModSounds.CUSHION_SIT.get(), definition().subtitle("sounds.minecraft.cushion.break")
                .with(sound(Constants.vanilla("entity/cushion/sit1")),
                        sound(Constants.vanilla("entity/cushion/sit2")),
                        sound(Constants.vanilla("entity/cushion/sit3"))));

        add(ModSounds.POPLAR_LEAVES_BREAK.get(), definition().subtitle("sounds.block.generic.break")
                .with(sound(Constants.vanilla("block/leaf_litter/break1")),
                        sound(Constants.vanilla("block/leaf_litter/break2")),
                        sound(Constants.vanilla("block/leaf_litter/break3")),
                        sound(Constants.vanilla("block/leaf_litter/break4")),
                        sound(Constants.vanilla("block/leaf_litter/break5"))));

        add(ModSounds.POPLAR_LEAVES_FALL.get(), definition().subtitle("sounds.block.generic.fall")
                .with(sound(Constants.vanilla("block/leaf_litter/step1")),
                        sound(Constants.vanilla("block/leaf_litter/step2")),
                        sound(Constants.vanilla("block/leaf_litter/step3")),
                        sound(Constants.vanilla("block/leaf_litter/step4")),
                        sound(Constants.vanilla("block/leaf_litter/step5")),
                        sound(Constants.vanilla("block/leaf_litter/step6"))));

        add(ModSounds.POPLAR_LEAVES_HIT.get(), definition().subtitle("sounds.block.generic.hit")
                .with(sound(Constants.vanilla("block/leaf_litter/step1")),
                        sound(Constants.vanilla("block/leaf_litter/step2")),
                        sound(Constants.vanilla("block/leaf_litter/step3")),
                        sound(Constants.vanilla("block/leaf_litter/step4")),
                        sound(Constants.vanilla("block/leaf_litter/step5")),
                        sound(Constants.vanilla("block/leaf_litter/step6"))));

        add(ModSounds.POPLAR_LEAVES_PLACE.get(), definition().subtitle("sounds.block.generic.place")
                .with(sound(Constants.vanilla("block/leaf_litter/place1")),
                        sound(Constants.vanilla("block/leaf_litter/place2")),
                        sound(Constants.vanilla("block/leaf_litter/place3")),
                        sound(Constants.vanilla("block/leaf_litter/place4")),
                        sound(Constants.vanilla("block/leaf_litter/place5"))));

        add(ModSounds.POPLAR_LEAVES_STEP.get(), definition().subtitle("sounds.block.generic.footsteps")
                .with(sound(Constants.vanilla("block/leaf_litter/step1")),
                        sound(Constants.vanilla("block/leaf_litter/step2")),
                        sound(Constants.vanilla("block/leaf_litter/step3")),
                        sound(Constants.vanilla("block/leaf_litter/step4")),
                        sound(Constants.vanilla("block/leaf_litter/step5")),
                        sound(Constants.vanilla("block/leaf_litter/step6"))));

    }
}