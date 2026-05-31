package zhien.shen.survival_tools.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import zhien.shen.survival_tools.SurvivalTools;

public class ModItemGroups {
    public static final ItemGroup SURVIVAL_TOOLS_GROUP =
            Registry.register(Registries.ITEM_GROUP, Identifier.of(SurvivalTools.NAMESPACE, "survival_tools_group"),
                    ItemGroup.create(ItemGroup.Row.TOP, 7)
                            .displayName(Text.translatable("itemgroup.survival_tools_group"))
                            .icon(() -> new ItemStack(ModItems.MECHANICAL_HOOK_CLAW))
                            .entries((context, entries) -> {
                                entries.add(ModItems.MECHANICAL_HOOK_CLAW);
                            })
                            .build()
            );

//    private static RegistryKey<ItemGroup> register(String id)
//
//        return RegistryKey.of(RegistryKeys.ITEM_GROUP, Identifier.of(SurvivalTools.NAMESPACE, id));
//    }

    public static void registerModItemGroups() {
        SurvivalTools.LOGGER.info("Registering Mod Item Groups for " + SurvivalTools.MOD_ID);
    }
}
