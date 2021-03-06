package inficraft.infiblocks.blocks;

import inficraft.infiblocks.InfiBlocks;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class StorageBlockMagicSlabItem extends ItemBlock
{
	public static final String blockType[] =
	{
	    "coal", "charcoal", "redstone", "slime", "bone", "wheat", "dirt", "", "", "", "", "",
	    "netherrack", "sandstone", "slab", "brick"
	};

    public StorageBlockMagicSlabItem(int i)
    {
        super(i);
        setMaxDamage(0);
        setHasSubtypes(true);
    }

    public int getIconFromDamage(int i)
    {
        return InfiBlocks.getContentInstance().storageBlockMagicSlab.getBlockTextureFromSideAndMetadata(0, i);
    }
    
    public int getMetadata(int i)
    {
        return i;
    }

    public String getItemNameIS(ItemStack itemstack)
    {
        return (new StringBuilder()).append(blockType[itemstack.getItemDamage()]).append("StorageMagicSlab").toString();
    }
}
