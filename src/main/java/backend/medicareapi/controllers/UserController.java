package backend.medicareapi.controllers;

import backend.medicareapi.models.User;
import backend.medicareapi.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class UserController {
	private final String token = "mY8Myas7E8+GwmI6KA+9pxRzgtm/iqYp7jlp1GKwWn4=";
	@Autowired
	UserRepository userRepository;

	@GetMapping("/users")
	public List<User> getAllUsers(@RequestHeader(value = "Authorization", required = false) String auth) {
		List<User> result = null;
		if ((auth != null) && (auth.equals(this.token))) {
			result = userRepository.findAll();
		}
		return result;
	}

	@PostMapping("/users/register")
	public User createUser(
			@Valid @RequestBody User user,
			@RequestHeader(value = "Authorization", required = false) String auth
	) {
		User result = null;
		if ((auth != null) && (auth.equals(this.token))) {
			result = userRepository.save(user);
		}
		return result;
	}

	@GetMapping("/users/verify/{username}")
	public User verifyUser(
			@RequestHeader(value = "Authorization", required = false) String auth,
			@PathVariable(value = "username") String username
	) {
		User result = null;
		if ((auth != null) && (auth.equals(this.token))) {
			User user = userRepository.findByUsername(username);
			if (user != null) {
				user.setVerified(true);
				result = userRepository.save(user);
			}
		}
		return result;
	}

	@PutMapping("/users/{username}")
	public User updateUser(
			@RequestHeader(value = "Authorization", required = false) String auth,
			@PathVariable(value = "username") String username,
			@Valid @RequestBody User user
	) {
		User result = null;
		if (auth != null && auth.equals(this.token) && username != null && user != null) {
			User matchedUser = userRepository.findByUsername(username);
			if (matchedUser != null) {
				matchedUser.setVerified(user.isVerified());
				matchedUser.setVerificationCode(user.getVerificationCode());
				matchedUser.setPassword(user.getPassword());
				matchedUser.setResetRequested(user.isResetRequested());
				matchedUser.setResetCode(user.getResetCode());
				result = userRepository.save(matchedUser);
			}
		}
		return result;
	}
}
