package com.yuliya1303.owner;

import com.yuliya1303.owner.config.WebConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WebTest {

    @Test
    void webTest() {

        WebConfig config = ConfigFactory.create(WebConfig.class, System.getProperties());

        assertThat(config.browserName()).isEqualTo("CHROME");
        assertThat(config.browserVersion()).isEqualTo("101.0");
        assertThat(config.launchType()).isEqualTo(""); //for gradle clean test -Dlaunch=local

        //assertThat(config.launchType()).isEqualTo("https://user1:1234@selenoid.autotests.cloud/wd/hub/");
        // for gradle clean test -Dlaunch=remote




    }
}
