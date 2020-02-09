package com.srkt.springbootpetclinic.repositories;


import com.srkt.springbootpetclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;

public interface SpecialtyRepository extends CrudRepository<Speciality,Long> {
}
