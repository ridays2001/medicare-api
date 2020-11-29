package backend.medicareapi.models;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "Store")
public class Store {
	@Id
	@GeneratedValue
	private Integer storeId;

	@NotBlank
	private String name;

	@NotBlank
	private String phone_number;

	@NotBlank
	private String locality;

	@NotBlank
	private Integer pin_code;

	public Store() {
		super();
	}

	public Store(Integer storeId, String name, String phone_number, String locality, String address, Integer pin_code) {
		super();
		this.storeId = storeId;
		this.name = name;
		this.phone_number = phone_number;
		this.locality = locality;
		this.address = address;
		this.pin_code = pin_code;
	}

	public Integer getStoreId() {
		return storeId;
	}
	public void setStoreId(Integer id) {
		this.storeId = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public String getLocality() {
		return locality;
	}
	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getPin_code() {
		return pin_code;
	}
	public void setPin_code(Integer pin_code) {
		this.pin_code = pin_code;
	}
}
