package io.github.techtastic.tab.forge;

import io.github.techtastic.tab.PlatformUtils;
import net.minecraftforge.fml.loading.FMLPaths;

import java.nio.file.Path;

public class PlatformUtilsImpl {
    /**
     * This is our actual method to {@link PlatformUtils#getConfigDirectory()}.
     */
    public static Path getConfigDirectory() {
        return FMLPaths.CONFIGDIR.get();
    }
}
