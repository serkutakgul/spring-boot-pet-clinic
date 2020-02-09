package com.srkt.springbootpetclinic.repositories;


import com.srkt.springbootpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit,Long> {
}
