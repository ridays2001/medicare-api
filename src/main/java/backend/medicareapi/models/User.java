package backend.medicareapi.models;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Entity
@Table(name = "User")
public class User {
	@Id
	@GeneratedValue
	private Integer id;

	@NotBlank
	private String name;

	@NotBlank
	private String email;

	@NotBlank
	private String username;

	@NotBlank
	private String phone_number;

	@NotBlank
	private String locality;

	@NotBlank
	private Date dob;

	@NotBlank
	private Integer pin_code;

	public User() {
		super();
	}

	public User(Integer id,
				String name,
				String email,
				String username,
				String phone_number,
				String locality,
				Date dob,
				Integer pin_code) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.username = username;
		this.phone_number = phone_number;
		this.locality = locality;
		this.dob = dob;
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

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
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

	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
}
