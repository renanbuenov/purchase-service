package renan.purchaseservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import renan.purchaseservice.model.Purchase;
import renan.purchaseservice.service.PurchaseService;

@RestController
@RequestMapping("api/purchase")
public class PurchaseController {

    @Autowired
    private PurchaseService purchaseService;

    @PostMapping
    public ResponseEntity<?> savePurchase(@RequestBody Purchase purchase) {
        return new ResponseEntity<>(purchaseService.savePurchase(purchase), HttpStatus.CREATED);
    }

    @GetMapping("{userId}")
    public ResponseEntity<?> getAllPurchasesOfUser(@PathVariable Long userId) {
        return ResponseEntity.ok(purchaseService.findAllPurchasesOfUser(userId));
    }
}