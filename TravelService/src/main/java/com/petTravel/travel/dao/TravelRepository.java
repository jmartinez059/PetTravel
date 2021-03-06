package com.petTravel.travel.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.petTravel.travel.domain.Travel;

@Repository
public interface TravelRepository extends JpaRepository<Travel, Integer>{

}
