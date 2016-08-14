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

import net.minecraft.item.Item;

/**
 * BlockCrops base class with right click harvest implementation
 *
 * @author Stefan Wimmer {@literal <stefanwimmer128@gmail.com>}
 */
public class BlockCropsRightClickHarvest extends BlockCrops
{
    private int rightClickHarvestResetState = 0;
    
    /**
     * Creates {@link BlockCropsRightClickHarvest} with Registry/Unlocalized name, Seed Item and Crop Item
     * @param name Registry/Unlocalized name
     * @param seed Seed Item
     * @param crop Crop Item
     */
    public BlockCropsRightClickHarvest(String name, Item seed, Item crop)
    {
        super(name, seed, crop);
    }
    
    /**
     * Creates {@link BlockCropsRightClickHarvest} with Registry/Unlocalized name, Seed Item, Crop Item and RightClickHarvestResetState
     * @param name Registry/Unlocalized name
     * @param seed Seed Item
     * @param crop Crop Item
     * @param rightClickHarvestResetState State to reset to after harvesting with right click
     */
    public BlockCropsRightClickHarvest(String name, Item seed, Item crop, int rightClickHarvestResetState)
    {
        this(name, seed, crop);
        
        this.rightClickHarvestResetState = rightClickHarvestResetState;
    }
    
    /**
     * Creates {@link BlockCropsRightClickHarvest} with Registry/Unlocalized name and Seed/Crop Item
     * @param name Registry/Unlocalized name
     * @param both Seed/Crop Item
     */
    public BlockCropsRightClickHarvest(String name, Item both)
    {
        super(name, both);
    }
    
    /**
     * Creates {@link BlockCropsRightClickHarvest} with Registry/Unlocalized name, Seed/Crop Item and RightClickHarvestResetState
     * @param name Registry/Unlocalized name
     * @param both Seed/Crop Item
     * @param rightClickHarvestResetState State to reset to after harvesting with right click
     */
    public BlockCropsRightClickHarvest(String name, Item both, int rightClickHarvestResetState)
    {
        this(name, both);
        
        this.rightClickHarvestResetState = rightClickHarvestResetState;
    }
    
    @Override
    public boolean allowRightClickHarvest()
    {
        return true;
    }
    
    @Override
    public int getRightClickHarvestResetState()
    {
        return rightClickHarvestResetState;
    }
}
