package com.srkt.springbootpetclinic.services.map;

import com.srkt.springbootpetclinic.model.Pet;
import com.srkt.springbootpetclinic.services.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
@Profile({"default","map"})
public class PetMapService extends AbstractMapService<Pet,Long> implements PetService {

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
        return super.save(object);
    }


}
