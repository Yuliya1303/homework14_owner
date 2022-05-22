package com.yuliya1303.owner.config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:config/${launch}.properties"
})

public interface WebConfig extends Config {

    @Key("browser.name")
    String browserName();

    @Key("browser.version")
    String browserVersion();

    @Key("launch.type")
    String launchType();

}
