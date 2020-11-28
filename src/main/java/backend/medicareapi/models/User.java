package backend.medicareapi.models;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Entity
@Table(name = "user")
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
	private Date dob;

	@NotBlank
	private String password;

	@NotBlank
	private boolean verified;

	@NotBlank
	private String verificationCode;

	@NotBlank
	private boolean resetRequested;

	@NotBlank
	private String resetCode;

	public User() {
		super();
	}

	public User(Integer id,
				String name,
				String email,
				String username,
				Date dob,
				String password,
				boolean verified,
				String verificationCode,
				boolean resetRequested,
				String resetCode) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.username = username;
		this.dob = dob;
		this.password = password;
		this.verified = verified;
		this.verificationCode = verificationCode;
		this.resetRequested = resetRequested;
		this.resetCode = resetCode;
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

	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isVerified() {
		return verified;
	}
	public void setVerified(boolean verified) {
		this.verified = verified;
	}

	public String getVerificationCode() {
		return verificationCode;
	}
	public void setVerificationCode(String verificationCode) {
		this.verificationCode = verificationCode;
	}

	public String getResetCode() {
		return resetCode;
	}
	public void setResetCode(String resetCode) {
		this.resetCode = resetCode;
	}

	public boolean isResetRequested() {
		return resetRequested;
	}
	public void setResetRequested(boolean resetRequested) {
		this.resetRequested = resetRequested;
	}
}
