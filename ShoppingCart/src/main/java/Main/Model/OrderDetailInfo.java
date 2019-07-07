package Main.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderDetailInfo {

	private String id;
	private String productCode;
	private String productName;
	
	private int quantity;
	private double price;
	private double amount;
	
}
