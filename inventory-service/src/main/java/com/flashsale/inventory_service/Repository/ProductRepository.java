package com.flashsale.inventory_service.Repository;

import com.flashsale.inventory_service.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
