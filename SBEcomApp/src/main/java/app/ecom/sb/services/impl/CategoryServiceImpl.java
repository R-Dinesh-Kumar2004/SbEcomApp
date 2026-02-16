package app.ecom.sb.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.ecom.sb.dto.CategoryRequestDTO;
import app.ecom.sb.entities.Category;
import app.ecom.sb.exceptions.ResourceNotFoundException;
import app.ecom.sb.mappers.CategoryMapper;
import app.ecom.sb.repositories.CategoryRepository;
import app.ecom.sb.services.CategoryService;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public CategoryRequestDTO fetchOneCategory(int id) {

		Optional<Category> optionalCategory = categoryRepository.findById(id);

		if (optionalCategory.isPresent()) {
			return CategoryMapper.toCategoryRequestDTO(optionalCategory.get());
		} else {
			throw new ResourceNotFoundException("Category with id " + id + " does not exist");
		}
	}

	@Override
	public List<CategoryRequestDTO> fetchAllCategories() {

		List<Category> categories = categoryRepository.findAll();

		if (categories.isEmpty()) {
			throw new ResourceNotFoundException("No Category found");
		} else {

			List<CategoryRequestDTO> categoryRequestDTOs = new ArrayList<CategoryRequestDTO>();

			for (Category category : categories) {
				categoryRequestDTOs.add(CategoryMapper.toCategoryRequestDTO(category));
			}

			return categoryRequestDTOs;
		}

	}

	@Override
	public CategoryRequestDTO addOneCategory(CategoryRequestDTO categoryToAdd) {
		return null;
	}

	@Override
	public CategoryRequestDTO updateOneCategory(int id, CategoryRequestDTO categoryToUpdate) {
		return null;
	}

	@Override
	public CategoryRequestDTO deleteOneCategory(int id) {
		return null;
	}

}
