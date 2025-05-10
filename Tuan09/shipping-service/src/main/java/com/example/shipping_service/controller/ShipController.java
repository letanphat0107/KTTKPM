package com.example.shipping_service.controller;

@RestController
@RequestMapping("/api/shipping")
public class ShipController {
    //POST /api/shipping → tạo đơn giao hàng.
    @PostMapping
    public ResponseEntity<Ship> createShipping(@RequestBody Ship ship) {
        // Logic to create a new shipping order
        return ResponseEntity.status(HttpStatus.CREATED).body(createdShip);
    }
    //PATCH /api/shipping/{id} → cập nhật trạng thái giao hàng.
    @PatchMapping("/{id}")
    public ResponseEntity<Ship> updateShipping(@PathVariable Long id, @RequestBody Ship ship) {
        // Logic to update the shipping order status
        return ResponseEntity.ok(updatedShip);
    }
}
