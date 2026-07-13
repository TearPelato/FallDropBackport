package net.tearpelato.falldrop_backport.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.builder.SoundTypeBuilder;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricSoundsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.tearpelato.falldrop_backport.Constants;
import net.tearpelato.falldrop_backport.init.ModSounds;

import java.util.concurrent.CompletableFuture;

public class ModSoundsProvider extends FabricSoundsProvider {
    public ModSoundsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(HolderLookup.Provider registryLookup, SoundExporter exporter) {
        exporter.add(ModSounds.SHELF_MUSHROOM_BOUNCE, SoundTypeBuilder.of()
                .subtitle("sounds.minecraft.shelf_mushroom.bounce")
                .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Constants.vanilla("block/shelf_mushroom/bounce1")))
                        .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Constants.vanilla("block/shelf_mushroom/bounce2")))
                        .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Constants.vanilla("block/shelf_mushroom/bounce3")))
                        .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Constants.vanilla("block/shelf_mushroom/bounce4")))
                        .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Constants.vanilla("block/shelf_mushroom/bounce5"))));

        exporter.add(ModSounds.SHELF_MUSHROOM_FALL, SoundTypeBuilder.of()
                .subtitle("sounds.minecraft.shelf_mushroom.bounce")
                .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Constants.vanilla("block/shelf_mushroom/fall"))));

        exporter.add(ModSounds.SHELF_MUSHROOM_BREAK, SoundTypeBuilder.of()
                .subtitle("sounds.minecraft.shelf_mushroom.break")
                .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Constants.vanilla("block/shelf_mushroom/break1")))
                        .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Constants.vanilla("block/shelf_mushroom/break2")))
                        .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Constants.vanilla("block/shelf_mushroom/break3")))
                        .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Constants.vanilla("block/shelf_mushroom/break4")))
                        .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Constants.vanilla("block/shelf_mushroom/break5")))
                        .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Constants.vanilla("block/shelf_mushroom/break6"))));

        exporter.add(ModSounds.SHELF_MUSHROOM_PLACE, SoundTypeBuilder.of()
                .subtitle("sounds.minecraft.shelf_mushroom.place")
                .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Constants.vanilla("block/shelf_mushroom/place1")))
                        .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Constants.vanilla("block/shelf_mushroom/place2")))
                        .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Constants.vanilla("block/shelf_mushroom/place3")))
                        .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Constants.vanilla("block/shelf_mushroom/place4")))
                        .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Constants.vanilla("block/shelf_mushroom/place5")))
                        .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Constants.vanilla("block/shelf_mushroom/place6"))));

        exporter.add(ModSounds.SHELF_MUSHROOM_STEP, SoundTypeBuilder.of()
                .subtitle("sounds.minecraft.shelf_mushroom.step")
                .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Constants.vanilla("block/shelf_mushroom/step1")))
                        .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Constants.vanilla("block/shelf_mushroom/step2")))
                        .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Constants.vanilla("block/shelf_mushroom/step3")))
                        .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Constants.vanilla("block/shelf_mushroom/step4")))
                        .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Constants.vanilla("block/shelf_mushroom/step5")))
                        .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Constants.vanilla("block/shelf_mushroom/step6"))));

        exporter.add(ModSounds.RED_SHRUB_BREAK, SoundTypeBuilder.of()
                .subtitle("sounds.minecraft.red_shrub.break")
                .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Constants.vanilla("block/red_shrub/break1")))
                        .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Constants.vanilla("block/red_shrub/break2")))
                        .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Constants.vanilla("block/red_shrub/break3")))
                        .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Constants.vanilla("block/red_shrub/break4"))));

        exporter.add(ModSounds.RED_SHRUB_PLACE, SoundTypeBuilder.of()
                .subtitle("sounds.minecraft.red_shrub.place")
                .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Constants.vanilla("block/red_shrub/place1")))
                        .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Constants.vanilla("block/red_shrub/place2")))
                        .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Constants.vanilla("block/red_shrub/place3")))
                        .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Constants.vanilla("block/red_shrub/place4"))));

        exporter.add(ModSounds.STRAW_BED_BREAK, SoundTypeBuilder.of()
                .subtitle("sounds.minecraft.straw_bed.break")
                .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Constants.vanilla("block/straw_bed/break1")))
                        .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Constants.vanilla("block/straw_bed/break2")))
                        .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Constants.vanilla("block/straw_bed/break3")))
                        .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Constants.vanilla("block/straw_bed/break4"))));

        exporter.add(ModSounds.STRAW_BED_BREAK_LEAVE, SoundTypeBuilder.of()
                .subtitle("sounds.minecraft.straw_bed.leave")
                .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Constants.vanilla("block/straw_bed/break_leave"))));

        exporter.add(ModSounds.STRAW_BED_HIT, SoundTypeBuilder.of()
                .subtitle("sounds.minecraft.straw_bed.hit")
                .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Constants.vanilla("block/straw_bed/hit1")))
                        .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Constants.vanilla("block/straw_bed/hit2")))
                        .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Constants.vanilla("block/straw_bed/hit3")))
                        .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Constants.vanilla("block/straw_bed/hit4")))
                        .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Constants.vanilla("block/straw_bed/hit5")))
                        .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Constants.vanilla("block/straw_bed/hit6"))));

        exporter.add(ModSounds.STRAW_BED_PLACE, SoundTypeBuilder.of()
                .subtitle("sounds.minecraft.straw_bed.place")
                .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Constants.vanilla("block/straw_bed/place1")))
                        .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Constants.vanilla("block/straw_bed/place2")))
                        .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Constants.vanilla("block/straw_bed/place3")))
                        .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Constants.vanilla("block/straw_bed/place4"))));

        exporter.add(ModSounds.STRAW_BED_STEP, SoundTypeBuilder.of()
                .subtitle("sounds.minecraft.shelf_mushroom.step")
                .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Constants.vanilla("block/straw_bed/step1")))
                        .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Constants.vanilla("block/straw_bed/step2")))
                        .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Constants.vanilla("block/straw_bed/step3")))
                        .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Constants.vanilla("block/straw_bed/step4")))
                        .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Constants.vanilla("block/straw_bed/step5")))
                        .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Constants.vanilla("block/straw_bed/step6"))));

        exporter.add(ModSounds.CUSHION_BREAK, SoundTypeBuilder.of()
                .subtitle("sounds.minecraft.cushion.break")
                .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Constants.vanilla("entity/cushion/break1")))
                        .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Constants.vanilla("entity/cushion/break2")))
                        .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Constants.vanilla("entity/cushion/break3"))));

        exporter.add(ModSounds.CUSHION_GET_UP, SoundTypeBuilder.of()
                .subtitle("sounds.minecraft.cushion.break")
                .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Constants.vanilla("entity/cushion/get_up1")))
                        .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Constants.vanilla("entity/cushion/get_up2")))
                        .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Constants.vanilla("entity/cushion/get_up3"))));

        exporter.add(ModSounds.CUSHION_PLACE, SoundTypeBuilder.of()
                .subtitle("sounds.minecraft.cushion.break")
                .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Constants.vanilla("entity/cushion/place1")))
                        .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Constants.vanilla("entity/cushion/place2")))
                        .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Constants.vanilla("entity/cushion/place3")))
                        .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Constants.vanilla("entity/cushion/place4")))
                        .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Constants.vanilla("entity/cushion/place5")))
                        .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Constants.vanilla("entity/cushion/place6"))));

        exporter.add(ModSounds.CUSHION_SIT, SoundTypeBuilder.of()
                .subtitle("sounds.minecraft.cushion.break")
                .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Constants.vanilla("entity/cushion/sit1")))
                        .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Constants.vanilla("entity/cushion/sit2")))
                        .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Constants.vanilla("entity/cushion/sit3"))));
    }

    @Override
    public String getName() {
        return "FallDrop Backport Sounds";
    }
}
