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
import net.minecraft.item.Item;

/**
 * Provide easy setName for Item/Block
 *
 * @author Stefan Wimmer <stefanwimmer128@gmail.com>
 */
public interface INameSetter
{
    default void setName(String name)
    {
        if (this instanceof Item)
        {
            ((Item) this).setRegistryName(name);
            ((Item) this).setUnlocalizedName(name);
        }
        if (this instanceof Block)
        {
            ((Block) this).setRegistryName(name);
            ((Block) this).setUnlocalizedName(name);
        }
    }
}
