package com.srkt.springbootpetclinic.repositories;

import com.srkt.springbootpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner,Long> {
}
