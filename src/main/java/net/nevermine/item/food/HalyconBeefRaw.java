package net.nevermine.item.food;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.nevermine.izer.Itemizer;

public class HalyconBeefRaw extends ItemFood{
    public HalyconBeefRaw() {
        super(3, 1.6f, true);
        setCreativeTab(Itemizer.MiscTab);
    }

    public ItemStack onEaten(final ItemStack item, final World world, final EntityPlayer player) {
        super.onEaten(item, world, player);

        if (!world.isRemote) {
            player.addPotionEffect(new PotionEffect(Potion.confusion.id, 150,2));
        }

        return item;
    }
}
