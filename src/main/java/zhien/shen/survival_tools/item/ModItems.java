package zhien.shen.survival_tools.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import zhien.shen.survival_tools.SurvivalTools;
import zhien.shen.survival_tools.item.items.MechanicalHookClawItem;

public class ModItems {
    public static final Item MECHANICAL_HOOK_CLAW = registerItems("mechanical_hook_claw", new MechanicalHookClawItem(new Item.Settings().maxCount(1)));

    private static Item registerItems(String id, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(SurvivalTools.NAMESPACE, id), item);
    }

    private static void addItemToIG(FabricItemGroupEntries fabricItemGroupEntries) {
        fabricItemGroupEntries.add(MECHANICAL_HOOK_CLAW);
    }

    public static void registerModItems() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::addItemToIG);
        SurvivalTools.LOGGER.info("Registering Mod Items for " + SurvivalTools.MOD_ID);
    }
}
