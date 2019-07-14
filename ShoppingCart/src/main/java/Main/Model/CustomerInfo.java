package Main.Model;

import Main.Form.CustomerForm;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class CustomerInfo {

	public CustomerInfo(CustomerForm customerForm) {
		this.name = customerForm.getName();
		this.address = customerForm.getAddress();
		this.email = customerForm.getEmail();
		this.phone = customerForm.getPhone();
		this.valid = customerForm.isValid();

	}

	private String name;
	private String address;
	private String email;
	private String phone;

	private boolean valid;

}
