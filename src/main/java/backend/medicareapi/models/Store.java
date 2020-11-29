package backend.medicareapi.models;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "Store")
public class Store {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@NotBlank
	private String name;

	@NotBlank
	private String website;

	@NotBlank
	private String phone_number;

	@NotBlank
	private String locality;

	@NotBlank
	private Integer pin_code;

	public Store() {
		super();
	}

	public Store(
			Integer id,
			String name,
			String phone_number,
			String locality,
			String website,
			Integer pin_code
	) {
		super();
		this.id = id;
		this.name = name;
		this.phone_number = phone_number;
		this.locality = locality;
		this.pin_code = pin_code;
		this.website = website;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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

	public Integer getPin_code() {
		return pin_code;
	}
	public void setPin_code(Integer pin_code) {
		this.pin_code = pin_code;
	}

	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
}
