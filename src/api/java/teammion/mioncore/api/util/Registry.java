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

package teammion.mioncore.api.util;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import teammion.mioncore.api.MionCoreAPI;

/**
 * Extended GameRegistry
 *
 * @author Stefan Wimmer {@literal <stefanwimmer128@gmail.com>}
 */
public class Registry extends GameRegistry
{
    /**
     * Adds a smelting recipe (see {@link GameRegistry#addSmelting(Item, ItemStack, float)})
     * @param in Input Item
     * @param out Output ItemStack
     */
    public static void addSmelting(Item in, ItemStack out)
    {
        addSmelting(in, out, .2f);
    }
    
    /**
     * Adds a smelting recipe (see {@link GameRegistry#addSmelting(ItemStack, ItemStack, float)})
     * @param in Input ItemStack
     * @param out Output ItemStack
     */
    public static void addSmelting(ItemStack in, ItemStack out)
    {
        addSmelting(in, out, .2f);
    }
    
    /**
     * Adds a smelting recipe (see {@link GameRegistry#addSmelting(Block, ItemStack, float)})
     * @param in Input Block
     * @param out Output ItemStack
     */
    public static void addSmelting(Block in, ItemStack out)
    {
        addSmelting(in, out, .2f);
    }
    
    /**
     * Renders Item (see {@link net.minecraft.client.renderer.ItemModelMesher#register(Item, int, ModelResourceLocation)})
     * @param item Item to render
     * @param meta MetaId / Damage to render
     * @param modelResourceLocation ModelResourceLocation for Item
     */
    public static void registerModel(IItem item, int meta, ModelResourceLocation modelResourceLocation)
    {
        MionCoreAPI.getMionCore().registerModel(item, meta, modelResourceLocation);
    }
    
    /**
     * Renders Item (see {@link #registerModel(IItem, int, ModelResourceLocation)})
     * @param item Item to render
     * @param meta MetaId / Damage to render
     * @param modelResourceLocation first param for ModelResourceLocation
     */
    public static void regiserModel(IItem item, int meta, String modelResourceLocation)
    {
        registerModel(item, meta, new ModelResourceLocation(modelResourceLocation, "inventory"));
    }
}
