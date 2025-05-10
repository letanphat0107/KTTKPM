package com.example.payment_service.controller;

import com.example.payment_service.model.Payment;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {
    @PostMapping
    public Payment processPayment(@RequestBody PaymentRequest request) {
        // logic thanh toán
    }

    //PATCH /api/payments/{id} → cập nhật trạng thái thanh toán.
    @PatchMapping("/{id}")
    public Payment updatePaymentStatus(@PathVariable String id, @RequestBody PaymentStatusUpdateRequest request) {
        // logic cập nhật trạng thái thanh toán
    }
}
