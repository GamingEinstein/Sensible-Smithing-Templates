package net.gamingeinstein.sensiblesmithingtemplates;

import net.gamingeinstein.sensiblesmithingtemplates.platform.Services;

public class SensibleSmithingTemplatesCommon {
    public static void init() {
        Constants.LOG.info("Common init loaded on {} in a {} environment.", Services.PLATFORM.getPlatformName(), Services.PLATFORM.getEnvironmentName());
    }
}