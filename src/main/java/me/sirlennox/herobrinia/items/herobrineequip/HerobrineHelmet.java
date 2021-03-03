package me.sirlennox.herobrinia.items.herobrineequip;

import me.sirlennox.herobrinia.Main;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;

public class HerobrineHelmet extends ArmorItem {

    public HerobrineHelmet() {
        super(Main.HEROBRINIA_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Settings().group(Main.HEROBRINIA_GROUP));
    }

    @Override
    public Text getName(ItemStack stack) {
        return this.getName();
    }

    @Override
    public Text getName() {
        return Text.of("§cHerobrine Helmet");
    }
}
