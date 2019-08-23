package com.example.Foody.Repositories;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Foody.Domain.Resturant;

@Repository()
@Transactional
public interface ResturantRepository extends JpaRepository<Resturant, Integer> {

//	@Query(value = ")
//	public List<Resturant> find(String searchTerm);
}
