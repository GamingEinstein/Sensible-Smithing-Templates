package net.gamingeinstein.sensiblesmithingtemplates;

import net.minecraftforge.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class SensibleSmithingTemplatesForge {
    public SensibleSmithingTemplatesForge() {
        Constants.LOG.info("Loaded mod on Forge");
        SensibleSmithingTemplatesCommon.init();
    }
}