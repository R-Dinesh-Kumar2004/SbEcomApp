package app.ecom.sb.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import app.ecom.sb.entities.Category;
import app.ecom.sb.repositories.CategoryRepository;

@Component
public class DataInitializer implements CommandLineRunner{
	
	@Autowired
	CategoryRepository categoryRepository;

	@Override
	public void run(String... args) throws Exception {
//		Category category = new Category();
//		category.setName("Eatables");
//		category.setDescription("Ready to eat food");
//		
//		Category savedCategory = categoryRepository.save(category);
//		
//		System.out.println(category);
		
//		System.out.println(categoryRepository.existsById(1));
	}

}
