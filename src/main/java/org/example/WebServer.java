package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

@SpringBootApplication
public class WebServer {
    /**
     * Определение метода, который создает объект ObjectMapper,
     * для преобразования ParameterMessage в JSON
     */
    @Bean
    public ObjectMapper objectMapper(Jackson2ObjectMapperBuilder builder) {
        return  builder.build();
    }

    /**
     * Точка входа приложения
     */
    public static void main(String[] args) {
        SpringApplication.run(WebServer.class, args);
    }
}
