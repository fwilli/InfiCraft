package inficraft.infitools.base;

import inficraft.api.InfiTexturedItem;

import java.util.List;

import net.minecraft.src.CreativeTabs;
import net.minecraft.src.ItemStack;

public class EmptyBowl extends InfiTexturedItem
{
	public EmptyBowl(int i, String itemName) 
	{
		super(i, InfiBase.itemTexture, itemName);
	}
	
	public int getIconFromDamage(int meta)
    {
        return this.iconIndex + meta;
    }
	
	public static final String blockType[] =
    {
        "stone", "iron", "gold", "netherrack", "slime", "cactus", "glass", "obsidian"
    };

    public String getItemNameIS(ItemStack itemstack)
    {
        return (new StringBuilder()).append(blockType[itemstack.getItemDamage()]).append("CustomBowl").toString();
    }
    
    public void getSubItems(int par1, CreativeTabs par2CreativeTabs, List par3List)
    {
        for (int var4 = 0; var4 < 8; ++var4)
        {
            par3List.add(new ItemStack(par1, 1, var4));
        }
    }
}