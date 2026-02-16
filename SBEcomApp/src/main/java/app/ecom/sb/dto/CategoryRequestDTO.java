package app.ecom.sb.dto;

public class CategoryRequestDTO {

	private String name;
	private String description;

	public CategoryRequestDTO() {
		super();
	}

	public CategoryRequestDTO(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "CategoryRequestDTO [name=" + name + ", description=" + description + "]";
	}

}
