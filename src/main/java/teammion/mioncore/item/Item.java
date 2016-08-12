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

package teammion.mioncore.item;

import net.minecraft.creativetab.CreativeTabs;
import teammion.mioncore.util.INameSetter;
import teammion.mioncore.util.IStackable;

/**
 * Item base class
 *
 * @author Stefan Wimmer <stefanwimmer128@gmail.com>
 */
public class Item extends net.minecraft.item.Item implements IStackable, INameSetter
{
    public Item(String name)
    {
        setName(name);
    }
    
    public Item(String name, CreativeTabs creativeTab)
    {
        this(name);
        
        setCreativeTab(creativeTab);
    }
}
