package com.srkt.springbootpetclinic.services;

import com.srkt.springbootpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {
   Owner findById(long id);
   Owner save (Owner owner);
   Owner findByLastName(String lastName);
   Set<Owner> findAll();

}
