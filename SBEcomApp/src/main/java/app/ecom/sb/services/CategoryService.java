package app.ecom.sb.services;

import java.util.List;

import app.ecom.sb.dto.CategoryRequestDTO;

public interface CategoryService {
	
	CategoryRequestDTO fetchOneCategory(int id);

	List<CategoryRequestDTO> fetchAllCategories();

	CategoryRequestDTO addOneCategory(CategoryRequestDTO categoryToAdd);

	CategoryRequestDTO updateOneCategory(int id, CategoryRequestDTO categoryToUpdate);

	CategoryRequestDTO deleteOneCategory(int id);

}