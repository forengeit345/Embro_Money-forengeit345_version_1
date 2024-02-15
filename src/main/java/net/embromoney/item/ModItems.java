package net.embromoney.item;

import net.embromoney.EmbroMoney;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.util.Identifier;
import net.embromoney.item.ModItems;




public class ModItems {
    public static final Item ONE = registerItem("one_embroniy", new Item(new FabricItemSettings().maxCount ( 50 )));
    public static final Item FIVE = registerItem("five_embroniy", new Item(new FabricItemSettings().maxCount ( 50 )));
    public static final Item TEN = registerItem("ten_embroniy", new Item(new FabricItemSettings().maxCount ( 50 )));
    public static final Item FIFTY = registerItem("fifty_embroniy", new Item(new FabricItemSettings().maxCount ( 50 )));
    public static final Item ONE_HUNDRED = registerItem("one_hundred_embroniy", new Item(new FabricItemSettings().maxCount ( 50 )));
    public static final Item FIVE_HUNDRED = registerItem("five_hundred_embroniy", new Item(new FabricItemSettings().maxCount ( 50 )));
    public static final Item THOUSAND = registerItem("thousand_embroniy", new Item(new FabricItemSettings().maxCount ( 50 )));
    public static final Item FIVETHOUSAND = registerItem("five_thousand_embroniy", new Item(new FabricItemSettings().maxCount ( 50 )));
    public static final Item TENTHOUSAND = registerItem("ten_thousand_embroniy", new Item(new FabricItemSettings().maxCount ( 50 )));


    public static final Item MILITARY_HELMET_BROWN = registerItem("brown_military_helmet",
            new ArmorItem(ModArmorMaterials.ONE, ArmorItem.Type.HELMET, new FabricItemSettings()));

    public static final Item MILITARY_CHESTPLATE_BROWN = registerItem("brown_military_chestplate",
            new ArmorItem(ModArmorMaterials.ONE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));

    public static final Item MILITARY_LEGGING_BROWN = registerItem("brown_military_leggings",
            new ArmorItem(ModArmorMaterials.ONE, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));

    public static final Item MILITARY_BOOTS_BROWN = registerItem("brown_military_boots",
            new ArmorItem(ModArmorMaterials.ONE, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(ONE);
        entries.add(FIVE);
        entries.add(TEN);
        entries.add(FIFTY);
        entries.add(ONE_HUNDRED);
        entries.add(FIVE_HUNDRED);
        entries.add(THOUSAND);
        entries.add(FIVETHOUSAND);
        entries.add(TENTHOUSAND);

    }
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(EmbroMoney.MOD_ID, name), item);
    }

    public static  void registerModItems() {
        EmbroMoney.LOGGER.info("Регестрируем Модовые предметы #" + EmbroMoney.MOD_ID);
    }
}
