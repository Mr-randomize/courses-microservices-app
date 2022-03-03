package com.iviberberi.apigateway.request;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(value = "purchase-service",
        path = "/api/purchase",
//        url = "${purchase.service.url}",
        configuration = FeignConfiguration.class)
public interface PurchaseServiceRequest {

    @PostMapping
    Object savePurchase(@RequestBody Object requestBody);

    @GetMapping("{userId}")
    List<Object> getAllPurchasesOfUser(@PathVariable("userId") Long userId);
}
