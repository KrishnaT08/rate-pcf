package com.samples.rate.config;

import javax.sql.DataSource;

import org.springframework.cloud.config.java.AbstractCloudConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RelationalCloudDataSourceConfig extends AbstractCloudConfig {

    @Bean
    public DataSource dataSource() {
        return connectionFactory().dataSource();
    }

}
