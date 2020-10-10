package backend.medicareapi.exceptions;

public class UserNotFoundException extends Exception {
	private Integer id;
	public UserNotFoundException(Integer id) {
		super(String.format("User with ID '%d' not found.", id));
	}
}
