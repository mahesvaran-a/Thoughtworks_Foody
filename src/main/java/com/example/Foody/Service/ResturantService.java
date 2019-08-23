package com.example.Foody.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Foody.Domain.Resturant;

@Service
public interface ResturantService {

	/**
	 * Returns list of restaurants by searchTerm
	 * 
	 * @param searchTerm
	 * @return
	 */
	public List<Resturant> searchResturants(String searchTerm);

	/**
	 * @param resturant
	 */
	public void addResturant(Resturant resturant);

	/**
	 * @param resturantId
	 * @param rating
	 * @return
	 */
	public Integer saveRating(Integer resturantId, double rating);

	/**
	 * @return
	 */
	public List<Resturant> getAllResturants();
}
