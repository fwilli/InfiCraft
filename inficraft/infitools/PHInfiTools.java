package inficraft.infitools;

import java.io.File;
import java.io.IOException;

import net.minecraftforge.common.Configuration;

public class PHInfiTools {

    public static void initProps()
    {
        /* Here we will set up the config file for the mod 
         * First: Create a folder inside the config folder
         * Second: Create the actual config file
         * Note: Configs are a pain, but absolutely necessary for every mod.
         */
        File file = new File(InfiTools.proxy.getLocation() + "/config/InfiCraft");
        file.mkdir();
        File newFile = new File(InfiTools.proxy.getLocation() + "/config/InfiCraft/InfiTools.txt");

        /* Some basic debugging will go a long way */
        try
        {
            newFile.createNewFile();
        }
        catch (IOException e)
        {
            System.out.println("Could not create configuration file for InfiTools. Reason:");
            System.out.println(e);
        }

        /* [Forge] Configuration class, used as config method */
        Configuration config = new Configuration(newFile);

        /* Load the configuration file */
        config.load();

        /* Define the mod's IDs. 
         * Avoid values below 4096 for items and in the 250-450 range for blocks
         */
        
        forge = config.getBlock("Lava Forge", 1471).getInt(1471);
        
        toolRod = config.getItem("Tool Rod", 14001).getInt(14001);
        woodPattern = config.getItem("Wood Pattern", 14002).getInt(14002);
        stonePattern = config.getItem("Stone Pattern", 14003).getInt(14032);
        
        pickaxe = config.getItem("Pickaxe", 14051).getInt(14051);
        pickaxe = config.getItem("Shovel", 14052).getInt(14052);
        pickaxe = config.getItem("Axe", 14053).getInt(14053);
        pickaxe = config.getItem("Sword", 14054).getInt(14054);
        
        pickaxe = config.getItem("Mattock", 14055).getInt(14055);
        pickaxe = config.getItem("Ice Axe", 14056).getInt(14056);
        pickaxe = config.getItem("Scythe", 14057).getInt(14057);
        pickaxe = config.getItem("Hammer", 14058).getInt(14058);
        
        pickaxe = config.getItem("Dagger", 14059).getInt(14059);
        pickaxe = config.getItem("Handpick", 14060).getInt(14060);
        pickaxe = config.getItem("Trowel", 14061).getInt(14061);
        pickaxe = config.getItem("Hatchet", 14062).getInt(14062);
        
        pickaxe = config.getItem("Machete", 14063).getInt(14063);
        pickaxe = config.getItem("Spear", 14064).getInt(14064);
        pickaxe = config.getItem("Battleaxe", 14065).getInt(14065);
        pickaxe = config.getItem("Fryingpan", 14066).getInt(14066);

        /* Save the configuration file */
        config.save();
    }
    
    public static int forge;
    public static int crafter;
    
    public static int toolRod;
    public static int woodPattern;
    public static int stonePattern;
    
    public static int pickaxe;
    public static int shovel;
    public static int axe;
    public static int sword;
    
    public static int mattock;
    public static int iceaxe;
    public static int scythe;
    public static int hammer;
    
    public static int dagger;
    public static int handpick;
    public static int trowel;
    public static int hatchet;
    
    public static int machete;
    public static int spear;
    public static int battleaxe;
    public static int fryingpan;
}