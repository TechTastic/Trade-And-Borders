package io.github.techtastic.tab.fabric;

import io.github.techtastic.tab.PlatformUtils;
import net.fabricmc.loader.api.FabricLoader;

import java.nio.file.Path;

public class PlatformUtilsImpl {
    /**
     * This is our actual method to {@link PlatformUtils#getConfigDirectory()}.
     */
    public static Path getConfigDirectory() {
        return FabricLoader.getInstance().getConfigDir();
    }
}
