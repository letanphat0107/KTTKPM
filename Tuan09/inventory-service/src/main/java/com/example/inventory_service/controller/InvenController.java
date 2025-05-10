package com.example.inventory_service.controller;

@RestController
@RequestMapping("/api/inventory")
public class InvenController {
//    POST /api/inventory/check → kiểm tra tồn kho.
    @PostMapping("/check")
    public ResponseEntity<?> checkInventory(@RequestBody InventoryCheckRequest request) {
        // Logic to check inventory
        return ResponseEntity.ok("Inventory checked successfully");
    }

//    PATCH /api/inventory/update → cập nhật tồn kho.
    @PatchMapping("/update")
    public ResponseEntity<?> updateInventory(@RequestBody InventoryUpdateRequest request) {
        // Logic to update inventory
        return ResponseEntity.ok("Inventory updated successfully");
    }
}
