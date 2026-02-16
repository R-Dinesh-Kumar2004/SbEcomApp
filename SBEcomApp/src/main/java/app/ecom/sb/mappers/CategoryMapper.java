package app.ecom.sb.mappers;

import app.ecom.sb.dto.CategoryRequestDTO;
import app.ecom.sb.entities.Category;

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
		
		return requestDTO;
	}
	
}
