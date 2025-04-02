package com.dio.avanade;

import org.springdoc.core.annotations.OpenAPIDefinition;
import org.springdoc.core.annotations.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(info = @Info(
        title = "API de Produtos",
        version = "v1",
        description = "Documentação da API REST para o gerenciamento de produtos."
))
public class OpenApiConfig {

}