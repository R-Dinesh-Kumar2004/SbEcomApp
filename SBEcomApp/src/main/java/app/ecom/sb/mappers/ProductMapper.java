package app.ecom.sb.mappers;

import app.ecom.sb.dto.ProductRequestDTO;
import app.ecom.sb.entities.Category;
import app.ecom.sb.entities.Product;

public class ProductMapper {
	
	public static ProductRequestDTO toProductRequestDTO(Product addedProduct) {
		
		ProductRequestDTO requestDTO = new ProductRequestDTO();
		
		requestDTO.setName(addedProduct.getName());
		requestDTO.setPrice(addedProduct.getPrice());
		requestDTO.setStock(addedProduct.getStock());
		
		return requestDTO;
	}
	
	public static Product toProduct(ProductRequestDTO dto, String imagePath, Category category) {
		Product product = new Product();
		
		product.setName(dto.getName());
		product.setPrice(dto.getPrice());
		product.setStock(dto.getStock());
		
		product.setCategory(category);
		product.setImagePath(imagePath);
		
		return product;
	}
	
}