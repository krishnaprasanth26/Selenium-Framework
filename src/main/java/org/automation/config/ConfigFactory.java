package org.automation.config;

public final class ConfigFactory { //No one can extend it.


    private ConfigFactory(){}

    public static FrameworkConfig getConfig() {

        return org.aeonbits.owner.ConfigFactory.create(FrameworkConfig.class);
    }

}
