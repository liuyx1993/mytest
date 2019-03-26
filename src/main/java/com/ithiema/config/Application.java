package com.ithiema.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages = "com.ithiema")
@EnableTransactionManagement
@Import(JdbcConfig.class)
public class Application {
}
