package com.example.Foody.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;

import com.example.Foody.Domain.FoodType;
import com.example.Foody.Domain.Resturant;

@Repository
@Transactional
public interface FoodTypeRepository extends JpaRepository<FoodType, Integer> {

}
