package com.example.payment_service.service;

public class PaymentService {
    @CircuitBreaker(name = "paymentService", fallbackMethod = "fallback")
    public PaymentResponse processPayment(PaymentRequest request) {
        // gọi service thanh toán
    }

    public PaymentResponse fallback(PaymentRequest request, Throwable e) {
        return new PaymentResponse("FAILED", "Dịch vụ không khả dụng, vui lòng thử lại.");
    }

}
