package io.github.techtastic.tab.forge;

import dev.architectury.platform.forge.EventBuses;
import io.github.techtastic.tab.TradeAndBordersMod;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(TradeAndBordersMod.MOD_ID)
public class TradeAndBordersModForge {
    public TradeAndBordersModForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(TradeAndBordersMod.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        TradeAndBordersMod.init();
    }
}
