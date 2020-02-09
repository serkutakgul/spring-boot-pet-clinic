package com.srkt.springbootpetclinic.repositories;


import com.srkt.springbootpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType,Long> {
}
