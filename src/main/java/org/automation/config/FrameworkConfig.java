package org.automation.config;

import org.aeonbits.owner.Config;

@Config.Sources(value="file:${user.dir}"+"/src/test/resources/config/config.properties")
public interface FrameworkConfig extends Config {

    public String url();
    public int timeout();
    public String browser();

}
