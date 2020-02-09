package com.srkt.springbootpetclinic.repositories;

import com.srkt.springbootpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet,Long> {
}
