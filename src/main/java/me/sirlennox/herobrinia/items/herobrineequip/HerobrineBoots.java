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

public class HerobrineBoots extends ArmorItem {

    public HerobrineBoots() {
        super(Main.HEROBRINIA_ARMOR_MATERIAL, EquipmentSlot.FEET, new Settings().group(Main.HEROBRINIA_GROUP));
    }

    @Override
    public Text getName(ItemStack stack) {
        return this.getName();
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(new net.minecraft.text.LiteralText("§7This boots will protect you every time."));
        super.appendTooltip(stack, world, tooltip, context);
    }

    @Override
    public boolean isFireproof() {
        return true;
    }

    @Override
    public Text getName() {
        return new net.minecraft.text.LiteralText("§cHerobrine Boots");
    }
}
