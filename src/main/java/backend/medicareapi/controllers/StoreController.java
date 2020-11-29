package backend.medicareapi.controllers;

import backend.medicareapi.models.Store;
import backend.medicareapi.repositories.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class StoreController {
	private final String token = "mY8Myas7E8+GwmI6KA+9pxRzgtm/iqYp7jlp1GKwWn4=";
	@Autowired
	StoreRepository storeRepository;

	@GetMapping("/stores")
	public List<Store> getAllStores(@RequestHeader(value = "Authorization", required = false) String auth) {
		List<Store> result = null;
		if (auth != null && auth.equals(this.token)) {
			result = storeRepository.findAll();
		}
		return result;
	}

	@PostMapping("/stores")
	public Store createUser(
			@Valid @RequestBody Store store,
			@RequestHeader(value = "Authorization", required = false) String auth
	) {
		Store result = null;
		if ((auth != null) && (auth.equals(this.token))) {
			result = storeRepository.save(store);
		}
		return result;
	}
}
