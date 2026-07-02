package net.tearpelato.falldrop_backport;

import com.mojang.logging.LogUtils;
import net.minecraft.resources.Identifier;
import org.slf4j.Logger;

public class Constants {
    public static final String MOD_ID = "falldrop_backport";
    public static final Logger LOGGER = LogUtils.getLogger();
    public static final String NAMESPACE ="minecraft";

    public static Identifier id(String path) {
        return Identifier.fromNamespaceAndPath(MOD_ID,path);
    }
    public static Identifier vanilla(String path) {
        return Identifier.withDefaultNamespace(path);
    }
}
