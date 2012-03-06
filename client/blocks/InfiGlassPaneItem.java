package net.minecraft.src.blocks;

import net.minecraft.src.*;

public class InfiGlassPaneItem extends ItemBlock
{
	public static final String blockType[] =
	    {
			"clear", "soul", "clearSoul"
	    };

    public InfiGlassPaneItem(int i)
    {
        super(i);
        setMaxDamage(0);
        setHasSubtypes(true);
        setFull3D();
    }

    public int getIconFromDamage(int i)
    {
        return mod_InfiBlocks.infiGlassPane.getBlockTextureFromSideAndMetadata(0, i);
    }

    public int getMetadata(int i)
    {
        return i;
    }

    public String getItemNameIS(ItemStack itemstack)
    {
        return (new StringBuilder()).append(blockType[itemstack.getItemDamage()]).append("GlassPane").toString();
    }
}
