package Main.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class CustomerInfo {

	private String name;
	private String address;
	private String email;
	private String phone;

	private boolean valid;

}
