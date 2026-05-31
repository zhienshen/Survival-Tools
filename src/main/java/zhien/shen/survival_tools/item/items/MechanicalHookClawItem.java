package zhien.shen.survival_tools.item.items;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class MechanicalHookClawItem extends Item {

    public MechanicalHookClawItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if(world.isClient) {
            user.getItemCooldownManager().set(this, 50);
        }
        user.sendMessage(Text.of(() -> "Mechanical Hook Claw used by " + user.getName().getString()), true);
        return TypedActionResult.success(user.getStackInHand(hand));
    }
}
