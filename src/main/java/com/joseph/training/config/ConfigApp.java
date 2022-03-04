package com.joseph.training.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application-local.properties")
@ComponentScan("com.joseph.training")
public class ConfigApp {

}
