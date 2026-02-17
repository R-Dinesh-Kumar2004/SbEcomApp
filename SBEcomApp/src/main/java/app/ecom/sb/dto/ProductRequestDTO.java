package app.ecom.sb.dto;

import java.math.BigDecimal;

import org.springframework.web.multipart.MultipartFile;

public class ProductRequestDTO {

	private String name;
	private BigDecimal price;
	private int stock;
	private MultipartFile image;
	private int categoryId;

	public ProductRequestDTO() {
		super();
	}

	public ProductRequestDTO(String name, BigDecimal price, int stock, MultipartFile image, int categoryId) {
		super();
		this.name = name;
		this.price = price;
		this.stock = stock;
		this.image = image;
		this.categoryId = categoryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public MultipartFile getImage() {
		return image;
	}

	public void setImage(MultipartFile image) {
		this.image = image;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	@Override
	public String toString() {
		return "ProductRequestDTO [name=" + name + ", price=" + price + ", stock=" + stock + ", categoryId=" + categoryId + "]";
	}

}
