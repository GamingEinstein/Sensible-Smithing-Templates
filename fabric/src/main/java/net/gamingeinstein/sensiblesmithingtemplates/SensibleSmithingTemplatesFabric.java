package net.gamingeinstein.sensiblesmithingtemplates;

import net.fabricmc.api.ModInitializer;

public class SensibleSmithingTemplatesFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        Constants.LOG.info("Loaded mod on Fabric");
        SensibleSmithingTemplatesCommon.init();
    }
}
