package com.example.Foody.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Foody.Domain.Resturant;
import com.example.Foody.Service.ResturantService;

@RestController
@RequestMapping("/restaurants")
public class RestaurantController {

	@Autowired
	private ResturantService resturantService;

	@GetMapping(value = "/search")
	public List<Resturant> searchResturants(@RequestParam("searchTerm") String searchTerm) {
		return resturantService.searchResturants(searchTerm);
	}

	@PostMapping(value = "/addResturant")
	public void addResturant(Resturant resturant) {
		resturantService.addResturant(resturant);
	}

	@GetMapping(value = "")
	public List<Resturant> getResturant() {
		return resturantService.getAllResturants();
	}

	@PostMapping(value = "rate/")
	public Integer saveRating(@RequestParam("resturantId") Integer resturantId, @RequestParam("rating") double rating) {
		return resturantService.saveRating(resturantId, rating);
	}

}
