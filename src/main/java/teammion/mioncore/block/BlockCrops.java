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

package teammion.mioncore.block;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import teammion.mioncore.util.INameSetter;
import teammion.mioncore.util.IStackable;

import javax.annotation.Nullable;

/**
 * BlockCrops base class
 *
 * @author Stefan Wimmer {@literal <stefanwimmer128@gmail.com>}
 */
public class BlockCrops extends net.minecraft.block.BlockCrops implements IStackable, INameSetter
{
    private Item seed;
    private Item crop;
    
    /**
     * Creates {@link BlockCrops} with Registry/Unlocalized name, Seed Item and Crop Item
     * @param name Registry/Unlocalized name
     * @param seed Seed Item
     * @param crop Crop Item
     */
    public BlockCrops(String name, Item seed, Item crop)
    {
        this.seed = seed;
        this.crop = crop;
        
        setName(name);
    }
    
    /**
     * Creates {@link BlockCrops} with Registry/Unlocalized name, Seed/Crop Item
     * @param name Registry/Unlocalized name
     * @param both Seed/Crop Item
     */
    public BlockCrops(String name, Item both)
    {
        this(name, both, both);
    }
    
    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, @Nullable ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ)
    {
        if (allowRightClickHarvest() && isMaxAge(state))
        {
            for (ItemStack stack : getDrops(worldIn, pos, state, 0))
            {
                spawnAsEntity(worldIn, pos, stack);
                
                worldIn.setBlockState(pos, withAge(getRightClickHarvestResetState()));
            }
            
            return true;
        }
        
        return super.onBlockActivated(worldIn, pos, state, playerIn, hand, heldItem, side, hitX, hitY, hitZ);
    }
    
    @Override
    public Item getSeed()
    {
        return seed;
    }
    
    @Override
    public Item getCrop()
    {
        return crop;
    }
    
    /**
     * Returns {@code true} when harvest by right clicking is allowed
     * {@link BlockCropsRightClickHarvest} has this implemented already
     * @return Harvest by right click is allowed
     */
    public boolean allowRightClickHarvest()
    {
        return false;
    }
    
    /**
     * Returns {@code int} of state to reset after harvesting with right click
     * @return State to reset to after harvesting with right click
     */
    public int getRightClickHarvestResetState()
    {
        return 0;
    }
}
