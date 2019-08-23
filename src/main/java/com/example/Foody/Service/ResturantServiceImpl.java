package com.example.Foody.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Foody.Domain.Resturant;
import com.example.Foody.Repositories.ResturantRepository;

@Service
public class ResturantServiceImpl implements ResturantService {

	@Autowired
	private ResturantRepository resturantRepository;

	@Override
	public List<Resturant> searchResturants(String searchTerm) {
//		return null
	}

	@Override
	public void addResturant(Resturant resturant) {
		resturantRepository.save(resturant);
	}

	@Override
	public Integer saveRating(Integer resturantId, double rating) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Resturant> getAllResturants() {
		
		return resturantRepository.findAll();
	}

}
