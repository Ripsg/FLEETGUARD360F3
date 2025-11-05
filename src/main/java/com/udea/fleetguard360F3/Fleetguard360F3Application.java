package com.udea.fleetguard360F3;


//IMPORTS PARA ACEPTAR EL FRONTEND
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Fleetguard360F3Application {

	public static void main(String[] args) {
		SpringApplication.run(Fleetguard360F3Application.class, args);
	}

	//CONFIGURACIÓN AÑADIDA PARA LA ACEPTACIÓN DE PETICIONES DEL BACKEND
	@Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                // Habilita CORS para todas las rutas ("/**")
                registry.addMapping("/**")
                        .allowedOrigins("http://localhost:8081") // Frontend de React
                        .allowedMethods("GET", "POST", "OPTIONS")
                        .allowedHeaders("*")
                        .allowCredentials(true);
            }
        };
    }

}
