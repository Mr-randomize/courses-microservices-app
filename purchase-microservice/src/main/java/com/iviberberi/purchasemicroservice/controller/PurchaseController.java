package com.iviberberi.purchasemicroservice.controller;

import com.iviberberi.purchasemicroservice.model.Purchase;
import com.iviberberi.purchasemicroservice.service.PurchaseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/purchase")
public class PurchaseController {

    private PurchaseService purchaseService;

    public PurchaseController(PurchaseService purchaseService) {
        this.purchaseService = purchaseService;
    }

    @PostMapping
    public ResponseEntity<?> savePurchase(@RequestBody Purchase purchase) {
        return new ResponseEntity(purchaseService.savePurchase(purchase), HttpStatus.CREATED);
    }

    @GetMapping("/{userId}")
    public ResponseEntity<?> getAllPurchaseOfUser(@PathVariable Long userId) {
        return ResponseEntity.ok(purchaseService.finalAllPurchasesOfUser(userId));
    }
}
