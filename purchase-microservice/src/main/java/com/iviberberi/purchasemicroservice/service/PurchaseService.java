package com.iviberberi.purchasemicroservice.service;

import com.iviberberi.purchasemicroservice.model.Purchase;

import java.util.List;

public interface PurchaseService {

    public Purchase savePurchase(Purchase purchase);

    public List<Purchase> finalAllPurchasesOfUser(Long userid);
}
