package com.noxmor.fabric;

import net.fabricmc.api.ModInitializer;

import com.noxmor.Terranite;

public final class TerraniteFabric implements ModInitializer {

    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        Terranite.init();
    }
}
