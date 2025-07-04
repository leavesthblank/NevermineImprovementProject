package net.nevermine.item.functional;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.nevermine.izer.Itemizer;

public class ChimeraChopRaw extends ItemFood {
    public ChimeraChopRaw() {
        super(4, 0.15f, true);
        setCreativeTab(Itemizer.MiscTab);
    }

    public ItemStack onEaten(final ItemStack item, final World world, final EntityPlayer player) {
        super.onEaten(item, world, player);
        return item;
    }
}
