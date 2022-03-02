package com.iviberberi.purchasemicroservice.repository;

import com.iviberberi.purchasemicroservice.model.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PurchaseRepository extends JpaRepository<Purchase, Long> {

    List<Purchase> findAllByUserId(Long userId);
}
