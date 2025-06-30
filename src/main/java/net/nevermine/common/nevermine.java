package net.nevermine.common;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartedEvent;
import cpw.mods.fml.common.event.FMLServerStoppingEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import java.util.Arrays;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.common.MinecraftForge;
import net.nevermine.assist.AddBusses;
import net.nevermine.assist.AddPackets;
import net.nevermine.assist.AscensionEnchants;
import net.nevermine.assist.ConfigurationHelper;
import net.nevermine.block.modelblocks.animated.TileEntityAnimatedModelBlock;
import net.nevermine.block.modelblocks.banner.TileEntityBanner;
import net.nevermine.block.modelblocks.statue.TileEntityStatue;
import net.nevermine.block.modelblocks.utility.TileEntityUtilityBlock;
import net.nevermine.container.AncientBossesContainer;
import net.nevermine.dimension.WorldGen;
import net.nevermine.event.player.Ticker;
import net.nevermine.izer.Blockizer;
import net.nevermine.izer.Dimensionizer;
import net.nevermine.izer.Itemizer;
import net.nevermine.izer.Mobizer;
import net.nevermine.izer.Projectilizer;

@Mod(
    modid = "nevermine",
    name = "AdventOfAscension",
    version = "3.0"
)
public class nevermine {
    @Instance("nevermine")
    public static nevermine instance;
    @SidedProxy(
        clientSide = "net.nevermine.common.ClientProxy",
        serverSide = "net.nevermine.common.CommonProxy"
    )
    public static CommonProxy proxy;
    public static boolean isMultiplayer;
    public static final String version = "3.0";
    public static final Random rand = new Random();

    public nevermine() {
    }

    public static void registerItemRenderer(Item i, IItemRenderer te) {
        MinecraftForgeClient.registerItemRenderer(i, te);
    }

    public static void registerItemRenderer(Block b, IItemRenderer te) {
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(b), te);
    }

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ConfigurationHelper.init(event.getModConfigurationDirectory());
        AddBusses.init();
        AddPackets.init();
        Itemizer.init();
        Projectilizer.init();
        Dimensionizer.init();
        AscensionEnchants.init();
        GameRegistry.registerTileEntity(TileEntityStatue.class, "Statue");
        GameRegistry.registerTileEntity(TileEntityBanner.class, "Banner");
        GameRegistry.registerTileEntity(TileEntityUtilityBlock.class, "UtilityBlock");
        GameRegistry.registerTileEntity(TileEntityAnimatedModelBlock.class, "AnimatedModelBlock");
        proxy.RenderInformation();
    }

    @EventHandler
    public void load(FMLInitializationEvent event) {
        postFMLEvent(new Ticker());
        GameRegistry.registerWorldGenerator(new WorldGen(), 5000);
        Mobizer.init();
        Blockizer.oreDictInit();

        for(String dungeon : Arrays.asList("mineshaftCorridor", "villageBlacksmith", "pyramidDesertyChest", "pyramidJungleChest", "strongholdCorridor", "strongholdLibrary", "strongholdCrossing", "bonusChest", "dungeonChest")) {
            ChestGenHooks.addItem(dungeon, new WeightedRandomChestContent(Item.getItemFromBlock(Blockizer.CarvedRune1), 0, 1, 2, 10));
            ChestGenHooks.addItem(dungeon, new WeightedRandomChestContent(Item.getItemFromBlock(Blockizer.CarvedRune2), 0, 1, 2, 10));
            ChestGenHooks.addItem(dungeon, new WeightedRandomChestContent(Item.getItemFromBlock(Blockizer.CarvedRune3), 0, 1, 2, 10));
            ChestGenHooks.addItem(dungeon, new WeightedRandomChestContent(Item.getItemFromBlock(Blockizer.CarvedRune6), 0, 1, 2, 10));
        }

    }

    public static void postFMLEvent(Object o) {
        FMLCommonHandler.instance().bus().register(o);
    }

    public static void postForgeEvent(Object o) {
        MinecraftForge.EVENT_BUS.register(o);
    }

    public static void addSpecialEventBus(Object o) {
        FMLCommonHandler.instance().bus().register(o);
    }

    public static void addEventBus(Object o) {
        MinecraftForge.EVENT_BUS.register(o);
    }

    @EventHandler
    public void serverStopping(FMLServerStoppingEvent event) {
        Ticker.serverShutdownTasks();
        AncientBossesContainer.unloadAllBosses();
    }
}
