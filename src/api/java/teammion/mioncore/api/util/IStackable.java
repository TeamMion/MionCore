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

import net.minecraft.item.ItemStack;

/**
 * Provide easy ItemStack creator
 *
 * @author Stefan Wimmer {@literal <stefanwimmer128@gmail.com>}
 */
public interface IStackable extends IItem
{
    /**
     * Returns an ItemStack with defined stackSize and MetaId / Damage
     * @param stackSize stackSize of ItemStack
     * @param meta MetaId / Damage of ItemStack
     * @return ItemStack with defined stackSize and MetaId / Damage
     */
    default ItemStack stack(int stackSize, int meta)
    {
        return new ItemStack(item(), stackSize, meta);
    }
    
    /**
     * Returns ItemStack with defined stackSize (see {@link #stack(int, int)})
     * @param stackSize stackSize of ItemStack
     * @return ItemStack with defined stackSize
     */
    default ItemStack stack(int stackSize)
    {
        return stack(stackSize, 0);
    }
    
    /**
     * Returns ItemStack (see {@link #stack(int, int)})
     * @return ItemStack
     */
    default ItemStack stack()
    {
        return stack(1);
    }
}
