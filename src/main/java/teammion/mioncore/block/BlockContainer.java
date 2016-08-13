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

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.EnumBlockRenderType;
import teammion.mioncore.util.INameSetter;
import teammion.mioncore.util.IStackable;

/**
 * BlockContainer base class
 *
 * @author Stefan Wimmer <stefanwimmer128@gmail.com>
 */
public abstract class BlockContainer extends net.minecraft.block.BlockContainer implements IStackable, INameSetter
{
    private EnumBlockRenderType blockRenderType = EnumBlockRenderType.MODEL;
    
    public BlockContainer(String name, Material materialIn)
    {
        super(materialIn);
        
        setName(name);
    }
    
    public BlockContainer(String name, Material materialIn, MapColor color)
    {
        super(materialIn, color);
        
        setName(name);
    }
    
    public BlockContainer(String name, Material materialIn, CreativeTabs creativeTab)
    {
        this(name, materialIn);
        
        setCreativeTab(creativeTab);
    }
    
    public BlockContainer(String name, Material materialIn, MapColor color, CreativeTabs creativeTab)
    {
        this(name, materialIn, color);
        
        setCreativeTab(creativeTab);
    }
    
    public void setBlockRenderType(EnumBlockRenderType blockRenderType)
    {
        this.blockRenderType = blockRenderType;
    }

    @Override
    public EnumBlockRenderType getRenderType(IBlockState state)
    {
        return blockRenderType;
    }
}
