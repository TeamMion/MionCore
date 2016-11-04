/*
 * Copyright (c) 2016, Team Mion
 *
 * Permission to use, copy, modify, and/or distribute this software for any
 * purpose with or without fee is hereby granted, provided that the above
 * copyright notice and this permission notice appear in all copies.
 *
 * THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES
 * WITH REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF
 * MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR
 * ANY SPECIAL, DIRECT, INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES
 * WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN
 * ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF
 * OR IN CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE.
 */

package teammion.mioncore.api.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

/**
 * ItemDrink base class
 *
 * @author Stefan Wimmer {@literal <stefanwimmer128@gmail.com>}
 */
public class ItemDrink extends ItemFood
{
    /**
     * Creates {@link ItemDrink} with Registry/Unlocalized name, amount, saturation and isWolfFood
     * @param name Registry/Unlocalized name
     * @param amount Food regain amount
     * @param saturation Food saturation
     * @param isWolfFood Says if food can be eaten by Wolfs
     */
    public ItemDrink(String name, int amount, float saturation, boolean isWolfFood)
    {
        super(name, amount, saturation, isWolfFood);
    }
    
    /**
     * Creates {@link ItemDrink} with Registry/Unlocalized name, amount and isWolfFood
     * @param name Registry/Unlocalized name
     * @param amount Food regain amount
     * @param isWolfFood Says if food can be eaten by Wolfs
     */
    public ItemDrink(String name, int amount, boolean isWolfFood)
    {
        super(name, amount, isWolfFood);
    }
    
    /**
     * Creates {@link ItemDrink} with Registry/Unlocalized name and amount
     * @param name Registry/Unlocalized name
     * @param amount Food regain amount
     */
    public ItemDrink(String name, int amount)
    {
        super(name, amount);
    }
    
    /**
     * Creates {@link ItemDrink} with Registry/Unlocalized name, amount, saturation, isWolfFood and CreativeTabs
     * @param name Registry/Unlocalized name
     * @param amount Food regain amount
     * @param saturation Food saturation
     * @param isWolfFood Says if food can be eaten by Wolfs
     * @param creativeTab CreativeTabs
     */
    public ItemDrink(String name, int amount, float saturation, boolean isWolfFood, CreativeTabs creativeTab)
    {
        super(name, amount, saturation, isWolfFood, creativeTab);
    }
    
    /**
     * Creates {@link ItemDrink} with Registry/Unlocalized name, amount, isWolfFood and CreativeTabs
     * @param name Registry/Unlocalized name
     * @param amount Food regain amount
     * @param isWolfFood Says if food can be eaten by Wolfs
     * @param creativeTab CreativeTabs
     */
    public ItemDrink(String name, int amount, boolean isWolfFood, CreativeTabs creativeTab)
    {
        super(name, amount, isWolfFood, creativeTab);
    }
    
    /**
     * Creates {@link ItemDrink} with Registry/Unlocalized name, amount and CreativeTabs
     * @param name Registry/Unlocalized name
     * @param amount Food regain amount
     * @param creativeTab CreativeTabs
     */
    public ItemDrink(String name, int amount, CreativeTabs creativeTab)
    {
        super(name, amount, creativeTab);
    }
    
    @Override
    public EnumAction getItemUseAction(ItemStack stack)
    {
        return EnumAction.DRINK;
    }
    
    @Override
    protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player)
    {
        ItemStack bottle = new ItemStack(Items.GLASS_BOTTLE, 1);
        
        if (! player.inventory.addItemStackToInventory(bottle) && ! worldIn.isRemote)
            worldIn.spawnEntityInWorld(new EntityItem(
                    worldIn, player.posX, player.posY, player.posZ, bottle
            ));
        
        super.onFoodEaten(stack, worldIn, player);
    }
}
