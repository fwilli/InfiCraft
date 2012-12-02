package mDiyo.inficraft.orizon.pastelmarble;
import java.util.List;

import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;

public class Marble extends Block
{
    public Marble(int i, int j)
    {
        super(i, j, Material.rock);
        enableStats = false;
        setCreativeTab(PastelMarble.stonetab);
    }
    
    public boolean getEnableStats() {return false;}

    public int damageDropped(int md)
    {
    	if (md < 6)
    		return md + 6;
        return md;
    }

    public int getBlockTextureFromSideAndMetadata(int side, int md)
    {
    	if (md > 5)
    		return blockIndexInTexture + md + 10;
        return blockIndexInTexture + md;
    }

    public String getTextureFile()
    {
        return PastelMarble.texture;
    }
    
    @Override
    public void getSubBlocks(int id, CreativeTabs tab, List list)
    {
    	for (int iter = 0; iter < 12; iter++)
    	{
    		list.add(new ItemStack(id, 1, iter));
    	}
    }
}
