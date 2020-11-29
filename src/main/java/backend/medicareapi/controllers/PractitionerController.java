package backend.medicareapi.controllers;

import backend.medicareapi.models.Practitioner;
import backend.medicareapi.repositories.PractitionerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class PractitionerController {
	private final String token = "mY8Myas7E8+GwmI6KA+9pxRzgtm/iqYp7jlp1GKwWn4=";
	@Autowired
	PractitionerRepository practitionerRepository;

	@GetMapping("/practitioners")
	public List<Practitioner> getAllPractitioners(@RequestHeader(value = "Authorization", required = false) String auth) {
		List<Practitioner> result = null;
		if (auth != null && auth.equals(this.token)) {
			result = practitionerRepository.findAll();
		}
		return result;
	}

	@PostMapping("/practitioners")
	public Practitioner createUser(
			@Valid @RequestBody Practitioner practitioner,
			@RequestHeader(value = "Authorization", required = false) String auth
	) {
		Practitioner result = null;
		if ((auth != null) && (auth.equals(this.token))) {
			result = practitionerRepository.save(practitioner);
		}
		return result;
	}
}
