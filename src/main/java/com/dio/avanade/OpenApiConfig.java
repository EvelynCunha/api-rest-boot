package com.dio.avanade;

import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public Info customOpenAPI() {
        return new Info()
                .title("Minha API")
                .version("v1")
                .description("API para produtos");
    }
}