package net.gamingeinstein.sensiblesmithingtemplates;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class SensibleSmithingTemplatesNeoForge {
    public SensibleSmithingTemplatesNeoForge(IEventBus eventBus) {
        Constants.LOG.info("Loaded mod on NeoForge");
        SensibleSmithingTemplatesCommon.init();
    }
}