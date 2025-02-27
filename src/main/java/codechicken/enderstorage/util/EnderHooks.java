package codechicken.enderstorage.util;

import net.minecraftforge.fml.common.Loader;

public final class EnderHooks {

    public boolean CCLoaded = false;
    public boolean CraftTweakerLoaded = false;
    public boolean OCLoaded = false;
    public boolean ExtraPlanetsLoaded = false;
    public boolean IELoaded = false;
    public boolean AE2Loaded = false;
    public boolean IC2Loaded = false;
    public boolean MekanismLoaded = false;
    public boolean BotaniaLoaded = false;

    public void hookPreInit() {
        CCLoaded = Loader.isModLoaded("computercraft");
        CraftTweakerLoaded = Loader.isModLoaded("crafttweaker");
        OCLoaded = Loader.isModLoaded("opencomputers");
        ExtraPlanetsLoaded = Loader.isModLoaded("extraplanets");
        IELoaded = Loader.isModLoaded("immersiveengineering");
        AE2Loaded = Loader.isModLoaded("appliedenergistics2");
        IC2Loaded = Loader.isModLoaded("ic2");
        MekanismLoaded = Loader.isModLoaded("mekanism");
        BotaniaLoaded = Loader.isModLoaded("botania");
    }

    public void hookInit() {

    }

    public void hookPostInit() {
        if (CraftTweakerLoaded) {
        }
    }
}