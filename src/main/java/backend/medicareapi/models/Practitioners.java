package backend.medicareapi.models;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "Practitioners")
public class Practitioners {
	@Id
	@GeneratedValue
	private Integer id;

	@NotBlank
	private String name;

	@NotBlank
	private String speciality;

	@NotBlank
	private String locality;

	@NotBlank
	private String phone_number;

	@NotBlank
	private Integer pin_code;

	public Practitioners() {
		super();
	}
	public Practitioners(Integer id, String name, String speciality, String locality, String phone_number, Integer pin_code) {
		super();
		this.id = id;
		this.name = name;
		this.speciality = speciality;
		this.locality = locality;
		this.phone_number = phone_number;
		this.pin_code = pin_code;
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

	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public String getLocality() {
		return locality;
	}
	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public Integer getPin_code() {
		return pin_code;
	}
	public void setPin_code(Integer pin_code) {
		this.pin_code = pin_code;
	}
}
