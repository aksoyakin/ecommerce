package dev.akinaksoy.ecommercebe.dao;

import dev.akinaksoy.ecommercebe.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface ProductRepository extends JpaRepository<Product, Long> {
}

