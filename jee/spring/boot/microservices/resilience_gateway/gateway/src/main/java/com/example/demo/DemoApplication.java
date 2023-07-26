package com.example.demo;

import io.github.resilience4j.circuitbreaker.CircuitBreakerConfig;
import io.github.resilience4j.timelimiter.TimeLimiterConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cglib.core.Customizer;
import org.springframework.cloud.circuitbreaker.resilience4j.Resilience4JCircuitBreakerFactory;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
	/*
	public Customizer<Resilience4JCircuitBreakerFactory>circuitBreakerFactory(){
		CircuitBreakerConfig config=CircuitBreakerConfig.ofDefaults();
		TimeLimiterConfig timeConfig=TimeLimiterConfig.ofDefaults();
		Resilience4JCircuitBreakerFactory factory=new Resilience4JCircuitBreakerFactory();

	}*/

    @Bean
    public RouteLocator routeLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(p -> p
                        .path("/products/**")
                       //.filters(f -> f.addRequestHeader("Hello", "World"))
                        .uri("http://localhost:8585"))
                .build();

    }

}
