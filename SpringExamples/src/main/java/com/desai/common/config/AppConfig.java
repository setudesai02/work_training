package com.desai.common.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ CsvGeneratorConfig.class, JsonGeneratorConfig.class })
public class AppConfig {

}
