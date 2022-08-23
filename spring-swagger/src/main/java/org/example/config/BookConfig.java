package org.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2
public class BookConfig {
    @Bean
    public Docket postApi() {
        return new Docket(DocumentationType.SWAGGER_2).groupName("Swagger Spring Book").apiInfo(apiInfo()).select()
                .paths(regex("/book.*")).build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("Book Service")
                .description("Sample Documentation Generated using swagger2 for our book rest api")
                .termsOfServiceUrl("https://www.notion.so/e628414e28be4b19a3f89a8f366985b5?v=a1b6337a537048df8d7269399e739f63&p=8ba1d18399554c86b523c48ac626af80&pm=s")
                .license("thích thì chiêuuf")
                .licenseUrl("https://www.notion.so/e628414e28be4b19a3f89a8f366985b5?v=a1b6337a537048df8d7269399e739f63&p=8ba1d18399554c86b523c48ac626af80&pm=s").version("1.0")
                .build();
    }
}
