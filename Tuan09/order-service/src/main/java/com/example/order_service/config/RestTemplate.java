package com.example.order_service.config;

@Bean
@LoadBalanced
public RestTemplate restTemplate() {
    return new RestTemplate();
}
