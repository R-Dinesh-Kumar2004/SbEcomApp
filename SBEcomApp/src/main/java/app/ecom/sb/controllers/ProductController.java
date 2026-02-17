package app.ecom.sb.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.ecom.sb.dto.ApiResponseDTO;
import app.ecom.sb.dto.ProductRequestDTO;
import app.ecom.sb.services.ProductService;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public ResponseEntity<ApiResponseDTO<ProductRequestDTO>> addOneProduct(@ModelAttribute ProductRequestDTO requestDTO){
		
		
		ProductRequestDTO resposeDto = productService.addOneProduct(requestDTO);
		
		ApiResponseDTO<ProductRequestDTO> apiResponseDTO = new ApiResponseDTO<ProductRequestDTO>(HttpStatus.CREATED.value(), "product added successfully.", resposeDto);
		
		return ResponseEntity.ok(apiResponseDTO);
	}
}