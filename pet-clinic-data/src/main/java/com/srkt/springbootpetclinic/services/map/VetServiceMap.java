package com.srkt.springbootpetclinic.services.map;

import com.srkt.springbootpetclinic.model.Vet;
import com.srkt.springbootpetclinic.services.VetService;

import java.util.Set;

public class VetServiceMap extends AbstractMapServices<Vet,Long> implements VetService {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }



    @Override
    public void delete(Vet object) {
        super.delete(object);

    }
    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(),object);
    }


}
