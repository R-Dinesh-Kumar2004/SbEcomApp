package app.ecom.sb.exceptions;

public class CategoryAlreadyExistException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public CategoryAlreadyExistException(String message) {
		super(message);
	}
}
