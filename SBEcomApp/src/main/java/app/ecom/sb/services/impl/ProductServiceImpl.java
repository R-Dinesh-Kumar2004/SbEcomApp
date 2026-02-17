package app.ecom.sb.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.ecom.sb.dto.ProductRequestDTO;
import app.ecom.sb.entities.Category;
import app.ecom.sb.entities.Product;
import app.ecom.sb.exceptions.ResourceNotFoundException;
import app.ecom.sb.mappers.ProductMapper;
import app.ecom.sb.repositories.CategoryRepository;
import app.ecom.sb.repositories.ProductRepository;
import app.ecom.sb.services.ProductService;
import app.ecom.sb.utils.FileUploadUtil;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	ProductRepository productRepository;
	
	@Autowired
	CategoryRepository categoryRepository;

	@Override
	public ProductRequestDTO fetchOneProduct(int id) {
		return null;
	}

	@Override
	public List<ProductRequestDTO> fetchAllProducts() {
		return null;
	}

	@Override
	public ProductRequestDTO addOneProduct(ProductRequestDTO productToAdd) {
		
		//category
		int categoryId = productToAdd.getCategoryId();
		Category category = categoryRepository
				.findById(categoryId)
				.orElseThrow(() -> new ResourceNotFoundException("Category with id "+categoryId+" not found"));
		
		//image 
		String imagePath = "";
		try {
			imagePath = FileUploadUtil.saveImage(productToAdd.getImage());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Product product = ProductMapper.toProduct(productToAdd, imagePath, category);
		Product addedProduct = productRepository.save(product);
		
		return ProductMapper.toProductRequestDTO(addedProduct);
	}

	@Override
	public ProductRequestDTO updateOneProduct(int id, ProductRequestDTO productToUpdate) {
		return null;
	}

	@Override
	public ProductRequestDTO deleteOneProduct(int id) {
		return null;
	}

}
