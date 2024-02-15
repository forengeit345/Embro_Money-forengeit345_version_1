package net.embromoney.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.embromoney.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;



public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }


    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.MILITARY_HELMET_BROWN));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.MILITARY_CHESTPLATE_BROWN));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.MILITARY_LEGGING_BROWN));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.MILITARY_BOOTS_BROWN));

    }
}
