package com.yuliya1303.owner;

import com.yuliya1303.owner.config.ApiConfig;
import com.yuliya1303.owner.config.TokenConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ApiTest {

    @Test
    void apiTest() {

        ApiConfig config = ConfigFactory.create(ApiConfig.class, System.getProperties());
        TokenConfig configToken = ConfigFactory.create(TokenConfig.class, System.getProperties());

        assertThat(config.baseUrl()).isEqualTo("https://demoqa.com/");
        assertThat(configToken.token()).isEqualTo("1234abcd1234abcd");

    }

}
