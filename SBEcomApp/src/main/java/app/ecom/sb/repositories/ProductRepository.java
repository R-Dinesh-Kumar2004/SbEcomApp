package app.ecom.sb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.ecom.sb.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

}
