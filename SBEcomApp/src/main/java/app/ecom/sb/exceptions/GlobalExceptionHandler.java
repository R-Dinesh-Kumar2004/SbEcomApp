package app.ecom.sb.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import app.ecom.sb.dto.ApiResponseDTO;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(exception = ResourceNotFoundException.class)
	public ResponseEntity<ApiResponseDTO<String>> handleResourceNotFoundException(ResourceNotFoundException ex) {

		ApiResponseDTO<String> responseDTO = new ApiResponseDTO<String>(HttpStatus.NOT_FOUND.value(), ex.getMessage(), null);

		return ResponseEntity.ofNullable(responseDTO);
	}

	@ExceptionHandler(exception = NullPointerException.class)
	public ResponseEntity<ApiResponseDTO<String>> handleNullPointerException(NullPointerException ex) {

		ApiResponseDTO<String> responseDTO = new ApiResponseDTO<String>(HttpStatus.INTERNAL_SERVER_ERROR.value(),
				ex.getMessage(), null);

		return ResponseEntity.ofNullable(responseDTO);
	}
	
	@ExceptionHandler(exception = CategoryAlreadyExistException.class)
	public ResponseEntity<ApiResponseDTO<String>> handleCategoryAlreadyException(CategoryAlreadyExistException ex) {

		ApiResponseDTO<String> responseDTO = new ApiResponseDTO<String>(HttpStatus.INTERNAL_SERVER_ERROR.value(),
				ex.getMessage(), null);

		return ResponseEntity.ofNullable(responseDTO);
	}
}
