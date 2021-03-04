package me.sirlennox.herobrinia.items.herobrineequip;

import me.sirlennox.herobrinia.Main;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class HerobrineLeggings extends ArmorItem {

    public HerobrineLeggings() {
        super(Main.HEROBRINIA_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Settings().group(Main.HEROBRINIA_GROUP));
    }

    @Override
    public Text getName(ItemStack stack) {
        return this.getName();
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.of("§7This leggings will protect you every time."));
        super.appendTooltip(stack, world, tooltip, context);
    }

    @Override
    public Text getName() {
        return Text.of("§cHerobrine Leggings");
    }
}
