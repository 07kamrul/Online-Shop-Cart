package Main.Model;

import Main.Entity.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class ProductInfo {

	private String code;
	private String name;
	private double price;
	
	public ProductInfo (Product product) {
		this.code = product.getCode();
		this.name = product.getName();
		this.price = product.getPrice();
	}
}
