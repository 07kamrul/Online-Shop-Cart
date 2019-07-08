package Main.Form;

import org.springframework.web.multipart.MultipartFile;

import Main.Entity.Product;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductForm {

	private String code;
	private String name;
	private double price;

	private boolean newProduct = false;

	private MultipartFile fileData;

	public ProductForm() {
		this.newProduct = true;
	}

	public ProductForm(Product product) {
		this.code = product.getCode();
		this.name = product.getName();
		this.price = product.getPrice();
	}
}
