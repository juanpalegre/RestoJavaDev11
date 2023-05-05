package com.example.restojavadev11.repositories;

import com.example.restojavadev11.models.RestaurantEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantRepository extends JpaRepository<RestaurantEntity, Integer> {
}
