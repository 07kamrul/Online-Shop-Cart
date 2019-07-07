package Main.Entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="kamrul_cart_Products")
public class Product implements Serializable {
	
	private static final long serialVersionUID = -1000119078147252957L;
	
	@Id
	@Column(name="CODE",length=20,nullable=false)
	private String code;
	
	@Column(name="Name",length=255,nullable=false)
	private String name;
	
	@Column(name="Price",nullable=false)
	private double price;
	
	@Lob
	@Column(name="Image",length=Integer.MAX_VALUE,nullable=true)
	private byte[] image;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="Create_Date",nullable=false)
	private Date createDate;
}
