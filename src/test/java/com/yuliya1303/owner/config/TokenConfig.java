package com.yuliya1303.owner.config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "file:/tmp/secret.properties",
        "classpath:config/token.properties"
})

public interface TokenConfig extends Config {

    @Key("token")
    String token();

}
