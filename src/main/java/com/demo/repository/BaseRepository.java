package com.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.demo.domain.Base;

public interface BaseRepository extends CrudRepository<Base, Long> {


}
