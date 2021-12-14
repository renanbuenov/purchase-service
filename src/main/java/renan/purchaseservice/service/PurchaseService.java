package renan.purchaseservice.service;

import renan.purchaseservice.model.Purchase;

import java.util.List;

public interface PurchaseService {

    Purchase savePurchase(Purchase purchase);

    List<Purchase> findAllPurchasesOfUser(Long userId);
}