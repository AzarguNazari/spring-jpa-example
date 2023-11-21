package jpa.test;

import org.springframework.data.jpa.repository.JpaRepository;
import jpa.test.entities.Product;
import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long>
{
    boolean existsByName(String name);
    long countByPriceGreaterThan(double price);
    long deleteByPriceLessThan(double price);
    List<Product> findFirst3ByPriceGreaterThan(double price);

}
