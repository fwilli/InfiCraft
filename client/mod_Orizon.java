package net.minecraft.src;

import net.minecraft.src.forge.*;
import net.minecraft.src.orizon.*;
import java.io.File;
import java.util.*;
import net.minecraft.client.Minecraft;

public class mod_Orizon extends BaseModMp
{
    public static InfiProps props;
    
    public static Block mineralOre;
    public static Block mineralOreHigh;
    public static Block mineralOreLow1;
    public static Block mineralOreLow2;
    public static Block mineralOreLow3;
    
    public static Block mineralOreAlt;
    public static Block mineralOreAltHigh;
    public static Block mineralOreAltLow1;
    public static Block mineralOreAltLow2;
    public static Block mineralOreAltLow3;
    
    public static Block gemOre;
    public static Block gemOreHigh;
    public static Block gemOreLow1;
    public static Block gemOreLow2;
    public static Block gemOreLow3;
    
    public static Block calciteOre;
    public static Block marble;
    
    public static int mineralOreID;
    public static int mineralOreHighID;
    public static int mineralOreLow1ID;
    public static int mineralOreLow2ID;
    public static int mineralOreLow3ID;
    
    public static int mineralOreAltID;
    public static int mineralOreAltHighID;
    public static int mineralOreAltLow1ID;
    public static int mineralOreAltLow2ID;
    public static int mineralOreAltLow3ID;
    
    public static int gemOreID;
    public static int gemOreHighID;
    public static int gemOreLow1ID;
    public static int gemOreLow2ID;
    public static int gemOreLow3ID;
    
    public static int calciteOreID;
    public static int marbleID;
    
    public static Block cStone;
    public static Block cCobble;
    public static Block cBrick;
    public static Block cMossy;
    public static Block cCracked;
    public static Block cTile;
    public static Block cFancy;
    public static Block cSquare;
    
    public static int cStoneID;
    public static int cCobbleID;
    public static int cBrickID;
    public static int cMossyID;
    public static int cCrackedID;
    public static int cTileID;
    public static int cFancyID;
    public static int cSquareID;
    
    public static Block replaceOre;
    public static Block replaceMetal;
    
    public static int replaceOreID;
    public static int replaceMetalID;
    
    public static boolean genCopper;
    public static boolean genTurquoise;
    public static boolean genChalcocite;
    public static boolean genCassiterite;
    public static boolean genTeallite;
    public static boolean genZinc;
    public static boolean genSphalerite;
    public static boolean genCerussite;
    public static boolean genCobalt;
    public static boolean genArdite;
    public static boolean genMyuvil;
    
    public static int copperRarity;
    public static int copperHeight;
    public static int turquoiseRarity;
    public static int turquoiseHeight;
    public static int chalcociteRarity;
    public static int chalcociteHeight;
    public static int cassiteriteRarity;
    public static int cassiteriteHeight;
    public static int tealliteRarity;
    public static int tealliteHeight;
    public static int zincBloomRarity;
    public static int zincBloomHeight;
    public static int sphaleriteRarity;
    public static int sphaleriteHeight;
    public static int cerussiteRarity;
    public static int cerussiteHeight;
    public static int cobaltRarity;
    public static int cobaltHeight;
    public static int arditeRarity;
    public static int arditeHeight;
    public static int myuvilRarity;
    public static int myuvilHeight;
    public static int galenaRarity;
    public static int galenaHeight;
    public static int ivymetalRarity;
    public static int ivymetalHeight;
    public static int aggregateRarity;
    public static int aggregateHeight;
    
    public static int goldRarity;
    public static int goldHeight;
    public static int diamondRarity;
    public static int diamondHeight;
    public static int lapisRarity;
    public static int lapisHeight;
    public static int redstoneRarity;
    public static int redstoneHeight;
    
    public static int rubyRarity;
    public static int rubyHeight;
    public static int emeraldRarity;
    public static int emeraldHeight;
    public static int sapphireRarity;
    public static int sapphireHeight;
    public static int amethystRarity;
    public static int amethystHeight;
    public static int topazRarity;
    public static int topazHeight;
    public static int quartzRarity;
    public static int quartzHeight;
    public static int roseQuartzRarity;
    public static int roseQuartzHeight;
    public static int rockCrystalRarity;
    public static int rockCrystalHeight;
    
    public static int marbleRarity;
    public static int marbleHeight;
    
    public static boolean resolveConflicts;
    public static boolean genStratifiedStone;
    public static boolean genColoredStone;
    public static boolean genCalcite;
    public static boolean genMarble;
    public static boolean genNetherOre;
    public static boolean genSilt;
    public static boolean redoVanillaOres;
    public static boolean replaceOres;
    public static boolean genGems;
    public static boolean genUniqueGems;

    public String getVersion()
    {
        return "v0.1 Zing";
    }

    public mod_Orizon()
    {
        /*
        MinecraftForge.setBlockHarvestLevel(mineralOre, 0, "pickaxe", 1);
        MinecraftForge.setBlockHarvestLevel(calciteOre, 0, "pickaxe", 0);*/
    	ModLoader.registerBlock(mineralOre, net.minecraft.src.orizon.MineralOreItem.class);
    	ModLoader.registerBlock(mineralOreHigh, net.minecraft.src.orizon.MineralOreHighItem.class);
    	ModLoader.registerBlock(mineralOreLow1, net.minecraft.src.orizon.MineralOreMediumItem.class);
    	ModLoader.registerBlock(mineralOreLow2, net.minecraft.src.orizon.MineralOreLowItem.class);
    	ModLoader.registerBlock(mineralOreLow3, net.minecraft.src.orizon.MineralOreDarkItem.class);
    	ModLoader.registerBlock(mineralOreAlt, net.minecraft.src.orizon.MineralOreAltItem.class);
    	ModLoader.registerBlock(mineralOreAltHigh, net.minecraft.src.orizon.MineralOreAltHighItem.class);
    	ModLoader.registerBlock(mineralOreAltLow1, net.minecraft.src.orizon.MineralOreAltMediumItem.class);
    	ModLoader.registerBlock(mineralOreAltLow2, net.minecraft.src.orizon.MineralOreAltLowItem.class);
    	ModLoader.registerBlock(mineralOreAltLow3, net.minecraft.src.orizon.MineralOreAltDarkItem.class);
    	ModLoader.registerBlock(cStone);
    	ModLoader.registerBlock(calciteOre, net.minecraft.src.orizon.CalciteOreItem.class);
    	ModLoader.registerBlock(marble, net.minecraft.src.orizon.MarbleItem.class);
    	MinecraftForgeClient.preloadTexture("/oretex/ores.png");
    	MinecraftForgeClient.preloadTexture("/oretex/stone.png");
    	
    	addNames();
    }

    public void addNames() {
    	ModLoader.addLocalization("mineralCopper.name", "Copper Ore");
    	ModLoader.addLocalization("mineralTurquoise.name", "Turquoise Ore");
    	ModLoader.addLocalization("mineralChalcocite.name", "Chalcocite Ore");
    	ModLoader.addLocalization("mineralCassiterite.name", "Cassiterite Ore");
    	ModLoader.addLocalization("mineralTeallite.name", "Teallite Ore");
    	ModLoader.addLocalization("mineralZincBloom.name", "Zinc Bloom Ore");
    	ModLoader.addLocalization("mineralSphalerite.name", "Sphalerite Ore");
    	ModLoader.addLocalization("mineralCerussite.name", "Cerussite Ore");
    	ModLoader.addLocalization("mineralCobalt.name", "Cobalt Ore");
    	ModLoader.addLocalization("mineralArdite.name", "Ardite Ore");
    	ModLoader.addLocalization("mineralMyuvil.name", "Myuvil Ore");
    	ModLoader.addLocalization("mineralGalena.name", "Galena Ore");
    	ModLoader.addLocalization("mineralIvymetal.name", "Ivymetal Ore");
    	
    	ModLoader.addLocalization("gemRubyOre.name", "Ruby Ore");
    	ModLoader.addLocalization("gemEmeraldOre.name", "Emerald Ore");
    	ModLoader.addLocalization("gemSapphireOre.name", "Sapphire Ore");
    	ModLoader.addLocalization("gemTopazOre.name", "Topaz Ore");
    	ModLoader.addLocalization("gemAmethystOre.name", "Amethyst Ore");
    	ModLoader.addLocalization("gemQuartzOre.name", "Quartz Ore");
    	ModLoader.addLocalization("gemRoseQuartzOre.name", "Rose Quartz Ore");
    	ModLoader.addLocalization("gemRockCrystalOre.name", "Rock Crystal Ore");
    	
    	ModLoader.addLocalization("gemRuby.name", "Ruby");
    	ModLoader.addLocalization("gemEmerald.name", "Emerald");
    	ModLoader.addLocalization("gemSapphire.name", "Sapphire");
    	ModLoader.addLocalization("gemTopaz.name", "Topaz");
    	ModLoader.addLocalization("gemAmethyst.name", "Amethyst");
    	ModLoader.addLocalization("gemQuartz.name", "Quartz");
    	ModLoader.addLocalization("gemRoseQuartz.name", "Rose Quartz");
    	ModLoader.addLocalization("gemRockCrystal.name", "Rock Crystal");
    }
    
    @Override
    public void generateSurface(World world, Random random, int chunkX, int chunkZ)
    {
    	if(genCalcite)
    		WorldGenStones.generateCalcite(world, random, chunkX, chunkZ);
    	if(genMarble)
    		WorldGenStones.generateMarble(world, random, chunkX, chunkZ);
    	if(genSilt)
    		WorldGenStones.generateSilt(world, random, chunkX, chunkZ);
    	if(genGems)
    		WorldGenStones.generateGems(world, random, chunkX, chunkZ);
    	if(genStratifiedStone)
    		WorldGenStones.generateStratifiedStone(world, random, chunkX, chunkZ);
        WorldGenStones.generateOres(world, random, chunkX, chunkZ);
    }

    public void load() {}

    static
    {
    	File me = new File( (new StringBuilder().append(Minecraft.getMinecraftDir().getPath())
				.append('/').append("mDiyo").toString() ) );
        me.mkdir();
		props = new InfiProps((new File((new StringBuilder()).append(Minecraft.getMinecraftDir().getPath())
				.append('/').append("mDiyo").append('/').append("OrizonIDs.cfg").toString())).getPath());
		props = PropsHelperOrizon.InitProps(props);
		PropsHelperOrizon.getProps(props);
		props = new InfiProps((new File((new StringBuilder()).append(Minecraft.getMinecraftDir().getPath())
				.append('/').append("mDiyo").append('/').append("OrizonWorldGen.cfg").toString())).getPath());
		props = PropsHelperOrizon.InitSpawn(props);
		PropsHelperOrizon.getSpawn(props);
		
		cStone = new ColoredStone(cStoneID, 0).setStepSound(Block.soundStoneFootstep).setHardness(Block.stone.getHardness()).setBlockName("Colored Stone");
		
        mineralOre = new MineralOre(mineralOreID, 32).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setBlockName("Mineral Ore");
        mineralOreHigh = new MineralOre(mineralOreHighID, 0).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setBlockName("Mineral Ore High");
        mineralOreLow1 = new MineralOre(mineralOreLow1ID, 64).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setBlockName("Mineral Ore Medium");
        mineralOreLow2 = new MineralOre(mineralOreLow2ID, 96).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setBlockName("Mineral Ore Low");
        mineralOreLow3 = new MineralOre(mineralOreLow3ID, 128).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setBlockName("Mineral Ore Dark");
        
        mineralOreAlt = new MineralOreAlt(mineralOreAltID, 48).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setBlockName("Mineral Ore Alt");
        mineralOreAltHigh = new MineralOreAlt(mineralOreAltHighID, 16).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setBlockName("Mineral Ore Alt High");
        mineralOreAltLow1 = new MineralOreAlt(mineralOreAltLow1ID, 80).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setBlockName("Mineral Ore Alt Medium");
        mineralOreAltLow2 = new MineralOreAlt(mineralOreAltLow2ID, 112).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setBlockName("Mineral Ore Alt Low");
        mineralOreAltLow3 = new MineralOreAlt(mineralOreAltLow3ID, 144).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setBlockName("Mineral Ore Alt Dark");
        
        gemOre = new GemOre(gemOreID, 16).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setBlockName("Gem Ore");
        gemOreHigh = new GemOre(gemOreHighID, 0).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setBlockName("Gem Ore High");
        gemOreLow1 = new GemOre(gemOreLow1ID, 32).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setBlockName("Gem Ore Medium");
        gemOreLow2 = new GemOre(gemOreLow2ID, 48).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setBlockName("Gem Ore Low");
        gemOreLow3 = new GemOre(gemOreLow3ID, 64).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setBlockName("Gem Ore Dark");
        
        calciteOre = new CalciteOre(calciteOreID, 160).setStepSound(Block.soundStoneFootstep).setHardness(1.0F).setBlockName("Calcite Ore");
        marble = new Marble(marbleID, 176).setHardness(5F).setBlockName("Marble");

        replaceOre = new OreReplacement(replaceOreID, 208).setHardness(3F).setBlockName("Replacement Ore");
        replaceMetal = new OreReplacementMetal(replaceMetalID, 224).setHardness(3F).setBlockName("Replacement Metal Ore");
        
    }
}
