package com.srkt.springbootpetclinic.services.springdatajpa;

import com.srkt.springbootpetclinic.model.Pet;
import com.srkt.springbootpetclinic.repositories.PetRepository;
import com.srkt.springbootpetclinic.services.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class PetSDJpaServive implements PetService {

    private final PetRepository petRepository;

    public PetSDJpaServive(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    @Override
    public Set<Pet> findAll() {
        Set<Pet> pets = new HashSet<>();
        petRepository.findAll().forEach(pets::add);
        return pets;
    }

    @Override
    public Pet findById(Long id) {
        return petRepository.findById(id).orElse(null);
    }

    @Override
    public Pet save(Pet object) {
        return petRepository.save(object);
    }

    @Override
    public void delete(Pet object) {
        petRepository.delete(object);

    }

    @Override
    public void deleteById(Long id) {
        petRepository.deleteById(id);

    }
}
