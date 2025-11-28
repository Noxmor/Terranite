package com.noxmor;

import com.noxmor.items.TerraniteItems;
import com.noxmor.tabs.TerraniteTabs;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class Terranite {
    public static final String MOD_ID = "terranite";

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static void init() {
        LOGGER.info("Initializing Terranite...");

        TerraniteTabs.init();
        TerraniteItems.init();
    }
}
