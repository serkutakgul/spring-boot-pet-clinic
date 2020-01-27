package com.srkt.springbootpetclinic.services.map;

import com.srkt.springbootpetclinic.model.Pet;
import com.srkt.springbootpetclinic.services.CrudService;

import java.util.Set;

public class PetServiceMap extends AbstractMapServices<Pet,Long> implements CrudService<Pet,Long> {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }

    @Override
    public void delete(Pet object) {
        super.delete(object);

    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(),object);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
