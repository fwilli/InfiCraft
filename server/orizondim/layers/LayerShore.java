package net.minecraft.src.orizondim.layers;
import net.minecraft.src.*;
import net.minecraft.src.orizondim.*;

public class LayerShore extends GenLayerOrizon
{
    public LayerShore(long par1, GenLayerOrizon par3GenLayer)
    {
        super(par1);
        this.parent = par3GenLayer;
    }

    /**
     * Returns a list of integer values generated by this layer. These may be interpreted as temperatures, rainfall
     * amounts, or biomeList[] indices based on the particular GenLayer subclass.
     */
    public int[] getInts(int par1, int par2, int par3, int par4)
    {
        int[] var5 = this.parent.getInts(par1 - 1, par2 - 1, par3 + 2, par4 + 2);
        int[] var6 = IntCache.getIntCache(par3 * par4);

        for (int var7 = 0; var7 < par4; ++var7)
        {
            for (int var8 = 0; var8 < par3; ++var8)
            {
                this.initChunkSeed((long)(var8 + par1), (long)(var7 + par2));
                int var9 = var5[var8 + 1 + (var7 + 1) * (par3 + 2)];
                int var10;
                int var11;
                int var12;
                int var13;

                /*if (var9 == BiomeGenBase.mushroomIsland.biomeID)
                {
                    var10 = var5[var8 + 1 + (var7 + 1 - 1) * (par3 + 2)];
                    var11 = var5[var8 + 1 + 1 + (var7 + 1) * (par3 + 2)];
                    var12 = var5[var8 + 1 - 1 + (var7 + 1) * (par3 + 2)];
                    var13 = var5[var8 + 1 + (var7 + 1 + 1) * (par3 + 2)];

                    if (var10 != mod_Orizon.ocean.biomeID && var11 != mod_Orizon.ocean.biomeID && var12 != mod_Orizon.ocean.biomeID && var13 != mod_Orizon.ocean.biomeID)
                    {
                        var6[var8 + var7 * par3] = var9;
                    }
                    else
                    {
                        var6[var8 + var7 * par3] = BiomeGenBase.mushroomIslandShore.biomeID;
                    }
                }*/
                if (var9 != mod_Orizon.ocean.biomeID && var9 != mod_Orizon.river.biomeID && var9 != mod_Orizon.swampland.biomeID && var9 != BiomeGenBase.extremeHills.biomeID)
                {
                    var10 = var5[var8 + 1 + (var7 + 1 - 1) * (par3 + 2)];
                    var11 = var5[var8 + 1 + 1 + (var7 + 1) * (par3 + 2)];
                    var12 = var5[var8 + 1 - 1 + (var7 + 1) * (par3 + 2)];
                    var13 = var5[var8 + 1 + (var7 + 1 + 1) * (par3 + 2)];

                    if (var10 != mod_Orizon.ocean.biomeID && var11 != mod_Orizon.ocean.biomeID && var12 != mod_Orizon.ocean.biomeID && var13 != mod_Orizon.ocean.biomeID)
                    {
                        var6[var8 + var7 * par3] = var9;
                    }
                    else
                    {
                        var6[var8 + var7 * par3] = mod_Orizon.beach.biomeID;
                    }
                }
                /*else if (var9 == BiomeGenBase.extremeHills.biomeID)
                {
                    var10 = var5[var8 + 1 + (var7 + 1 - 1) * (par3 + 2)];
                    var11 = var5[var8 + 1 + 1 + (var7 + 1) * (par3 + 2)];
                    var12 = var5[var8 + 1 - 1 + (var7 + 1) * (par3 + 2)];
                    var13 = var5[var8 + 1 + (var7 + 1 + 1) * (par3 + 2)];

                    if (var10 == BiomeGenBase.extremeHills.biomeID && var11 == BiomeGenBase.extremeHills.biomeID && var12 == BiomeGenBase.extremeHills.biomeID && var13 == BiomeGenBase.extremeHills.biomeID)
                    {
                        var6[var8 + var7 * par3] = var9;
                    }
                    else
                    {
                        var6[var8 + var7 * par3] = BiomeGenBase.extremeHillsEdge.biomeID;
                    }
                }*/
                else
                {
                    var6[var8 + var7 * par3] = var9;
                }
            }
        }

        return var6;
    }
}
