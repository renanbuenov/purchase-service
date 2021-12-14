package renan.purchaseservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import renan.purchaseservice.model.Purchase;

import java.util.List;

public interface PurchaseRepository extends JpaRepository<Purchase, Long> {

    List<Purchase> findAllByUserId(Long userId);
}