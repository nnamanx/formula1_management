package com.ferrari.formula1_team.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfig {

    @Bean
    ModelMapperConfig modelMapperConfig(){
        return new ModelMapperConfig();
    }
}
