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

package teammion.mioncore.util;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created on 12.08.16 at 16:52
 *
 * @author Stefan Wimmer <stefanwimmer128@gmail.com>
 */
public class Registry extends GameRegistry
{
    public static void addSmelting(Item in, ItemStack out)
    {
        addSmelting(in, out, .2f);
    }
    
    public static void addSmelting(ItemStack in, ItemStack out)
    {
        addSmelting(in, out, .2f);
    }
    
    public static void addSmelting(Block in, ItemStack out)
    {
        addSmelting(in, out, .2f);
    }
    
    public static void render(IItem item, int meta, ModelResourceLocation modelResourceLocation)
    {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(
                item.item(), meta, modelResourceLocation
        );
    }
    
    public static void render(IItem item, int meta, String modid, String name)
    {
        render(item, meta, new ModelResourceLocation(modid + ":" + name, "inventory"));
    }
}
