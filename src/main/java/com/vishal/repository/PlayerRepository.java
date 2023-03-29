package com.vishal.repository;

import org.springframework.data.repository.CrudRepository;

import com.vishal.entity.PlayerEntity;

public interface PlayerRepository extends CrudRepository<PlayerEntity, Integer> {

}
