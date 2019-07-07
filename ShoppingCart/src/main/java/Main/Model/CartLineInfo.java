package Main.Model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CartLineInfo {

	private ProductInfo productInfo;
	private int quantity;
	
	public CartLineInfo() {
		this.quantity = 0;
	}
	
	public ProductInfo getProductInfo() {
		return productInfo;
	}
	
	public double getAmount() {
		return this.productInfo.getPrice() * this.quantity;
	}
}
