package net.embromoney.item;


import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.embromoney.EmbroMoney;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.embromoney.item.ModItems;


public class ModItemGroup {
    public static final ItemGroup MONEY_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(EmbroMoney.MOD_ID, "one_embroniy"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.embroniy"))
                    .icon(() -> new ItemStack(ModItems.ONE)).entries((displayContext, entries) -> {
                        entries.add(ModItems.ONE);
                        entries.add(ModItems.FIVE);
                        entries.add(ModItems.TEN);
                        entries.add(ModItems.FIFTY);
                        entries.add(ModItems.ONE_HUNDRED);
                        entries.add(ModItems.FIVE_HUNDRED);
                        entries.add(ModItems.THOUSAND);
                        entries.add(ModItems.FIVETHOUSAND);
                        entries.add(ModItems.TENTHOUSAND);

                        entries.add(ModItems.MILITARY_HELMET_BROWN);
                        entries.add(ModItems.MILITARY_CHESTPLATE_BROWN);
                        entries.add(ModItems.MILITARY_LEGGING_BROWN);
                        entries.add(ModItems.MILITARY_BOOTS_BROWN);




                        entries.add(Items.DIAMOND);


                    }).build());


    public static void registerItemGroups() {
        EmbroMoney.LOGGER.info("Регестрируем Модовые предметы #" + EmbroMoney.MOD_ID);
    }
}