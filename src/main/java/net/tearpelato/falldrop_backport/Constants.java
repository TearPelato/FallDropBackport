package net.tearpelato.falldrop_backport;

import net.minecraft.resources.Identifier;

public class Constants {
    public static final String MOD_ID = "falldrop_backport";


    public Identifier id(String path) {
        return Identifier.fromNamespaceAndPath(MOD_ID,path);
    }
}
