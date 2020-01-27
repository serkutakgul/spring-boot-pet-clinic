package com.srkt.springbootpetclinic.services.map;

import com.srkt.springbootpetclinic.model.Owner;
import com.srkt.springbootpetclinic.services.CrudService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapServices<Owner,Long> implements CrudService<Owner,Long> {
    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return findById(id);
    }


    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(),object);
    }


}
