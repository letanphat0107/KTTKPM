package com.example.order_service.service;

@Service
public class OrderService {
    @Autowired
    private RestTemplate restTemplate;

    @CircuitBreaker(name = "paymentService", fallbackMethod = "paymentFallback")
    @Retry(name = "paymentService")
    @RateLimiter(name = "paymentService")
    @TimeLimiter(name = "paymentService")
    public String createOrder(OrderRequest request) {
        String response = restTemplate.postForObject(
                "http://payment-service/api/payments", request.getPaymentInfo(), String.class
        );
        return response;
    }

    public String paymentFallback(OrderRequest request, Throwable ex) {
        return "Payment service currently unavailable. Please try again later.";
    }
}
