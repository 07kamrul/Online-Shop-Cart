package Main.Model;

import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderInfo {

	private String id;
	private Date orderDate;
	private int orderNum;
	private double amount;
	
	private String customerName;
	private String customerAddress;
	private String customerEmail;
	private String customerPhone;
	
	private List<OrderDetailInfo> details;
	
}
