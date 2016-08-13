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
import teammion.mioncore.util.INameSetter;

/**
 * Created on 13.08.16 at 12:24
 *
 * @author Stefan Wimmer <stefanwimmer128@gmail.com>
 */
public class BlockCrops extends net.minecraft.block.BlockCrops implements INameSetter
{
    private Item seed;
    private Item crop;
    
    public BlockCrops(String name, Item seed, Item crop)
    {
        this.seed = seed;
        this.crop = crop;
        
        setName(name);
    }
    
    public BlockCrops(String name, Item both)
    {
        this(name, both, both);
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
}
