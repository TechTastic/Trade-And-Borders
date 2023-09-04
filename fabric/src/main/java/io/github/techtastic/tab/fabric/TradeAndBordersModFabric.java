package io.github.techtastic.tab.fabric;

import io.github.techtastic.tab.TradeAndBordersMod;
import net.fabricmc.api.ModInitializer;

public class TradeAndBordersModFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        TradeAndBordersMod.init();
    }
}
