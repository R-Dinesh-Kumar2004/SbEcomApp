package app.ecom.sb.services;

import java.util.List;

import app.ecom.sb.dto.ProductRequestDTO;

public interface ProductService {
	
	ProductRequestDTO fetchOneProduct(int id);

	List<ProductRequestDTO> fetchAllProducts();

	ProductRequestDTO addOneProduct(ProductRequestDTO productToAdd);

	ProductRequestDTO updateOneProduct(int id, ProductRequestDTO productToUpdate);

	ProductRequestDTO deleteOneProduct(int id);
}
