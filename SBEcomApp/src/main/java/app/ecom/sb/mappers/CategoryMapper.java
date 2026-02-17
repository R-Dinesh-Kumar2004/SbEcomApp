package app.ecom.sb.mappers;

import java.util.List;

import app.ecom.sb.dto.CategoryRequestDTO;
import app.ecom.sb.dto.ProductRequestDTO;
import app.ecom.sb.entities.Category;
import app.ecom.sb.entities.Product;

public class CategoryMapper {
	
	public static Category toCategory(CategoryRequestDTO requestDTO) {
		Category category = new Category();
		category.setName(requestDTO.getName());
		category.setDescription(requestDTO.getDescription());
		
		return category;
	}
	
	public static CategoryRequestDTO toCategoryRequestDTO(Category category) {
		CategoryRequestDTO requestDTO = new CategoryRequestDTO();
		requestDTO.setName(category.getName());
		requestDTO.setDescription(category.getDescription());
		
		List<Product> productsList = category.getProducts();
		
		List<ProductRequestDTO> requestDTOsList = productsList.stream().map(product -> ProductMapper.toProductRequestDTO(product)).toList();
		requestDTO.setProductList(requestDTOsList);
		
		return requestDTO;
	}
	
}