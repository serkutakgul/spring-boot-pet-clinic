package com.srkt.springbootpetclinic.services.map;

import com.srkt.springbootpetclinic.model.Pet;
import com.srkt.springbootpetclinic.services.CrudService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class PetServiceMap extends AbstractMapServices<Pet,Long> implements CrudService<Pet,Long> {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);

    }
    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }


    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(),object);
    }


}
