package app.ecom.sb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.ecom.sb.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer>{

	boolean existsByName(String categoryName);

}
