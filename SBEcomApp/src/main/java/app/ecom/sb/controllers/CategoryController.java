package app.ecom.sb.controllers;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.ecom.sb.dto.ApiResponseDTO;
import app.ecom.sb.dto.CategoryRequestDTO;
import app.ecom.sb.services.CategoryService;

@RestController
@RequestMapping("/api/v1/categories")
public class CategoryController {
	
	@Autowired
	CategoryService categoryService;
	
	
	@GetMapping("/{id}")
	public ResponseEntity<ApiResponseDTO<CategoryRequestDTO>> getOneCategory(@PathVariable("id") int id){
		
		CategoryRequestDTO categoryRequestDTO = categoryService.fetchOneCategory(id);
		
		ApiResponseDTO<CategoryRequestDTO> apiResponseDTO = new ApiResponseDTO<CategoryRequestDTO>(200, 
				"Category with id "+id+" fetched successfully", LocalDateTime.now(), categoryRequestDTO);
		
		return ResponseEntity.ok(apiResponseDTO);
	}
	
	@GetMapping
	public ResponseEntity<ApiResponseDTO<List<CategoryRequestDTO>>> getAllCategory(){
		
		List<CategoryRequestDTO> categoryRequestDTOs = categoryService.fetchAllCategories();
		
		ApiResponseDTO<List<CategoryRequestDTO>> apiResponseDTO = new ApiResponseDTO<List<CategoryRequestDTO>>(200, 
				"Categories fetched successfully", LocalDateTime.now(), categoryRequestDTOs);
		
		return ResponseEntity.ok(apiResponseDTO);
	}
}
