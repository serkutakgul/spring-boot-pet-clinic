package com.srkt.springbootpetclinic.services;

import com.srkt.springbootpetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(long id);
    Pet save (Pet pet);

    Set<Pet> findAll();
}
