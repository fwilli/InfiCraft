package inficraft.infiblocks.magicslabs;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class MagicSlabSoilItem extends ItemBlock
{
    public static final String blockType[] =
    {
    	"dirt", "grass", "mycelium", "sand", "gravel", "oak", "pine", "birch", 
    	"planks", "snow", "soulsand", "brownMushroom", "redMushroom", "glowstone", "glass", "oakLeaves"
    };

    public MagicSlabSoilItem(int i)
    {
        super(i);
        setMaxDamage(0);
        setHasSubtypes(true);
    }

    @Override
    public int getMetadata(int md)
    {
        return md;
    }

    public String getItemNameIS(ItemStack itemstack)
    {
        return (new StringBuilder()).append(blockType[itemstack.getItemDamage()]).append("MagicSlab").toString();
    }
}
