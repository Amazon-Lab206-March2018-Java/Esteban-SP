package com.poesteba.dojosninjas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.poesteba.dojosninjas.models.Ninja;

public interface NinjaRepo extends CrudRepository<Ninja, Long> {

	List<Ninja> findAllByDojo_id(Long id);
}
