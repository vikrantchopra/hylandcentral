package com.example.hylandcentral.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.hylandcentral.model.Coach;


@Repository
public interface CoachRepository extends CrudRepository<Coach, Long> {

	Coach findByUsername(String username);
}
