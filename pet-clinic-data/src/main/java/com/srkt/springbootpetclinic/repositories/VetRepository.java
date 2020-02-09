package com.srkt.springbootpetclinic.repositories;


import com.srkt.springbootpetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet,Long> {
}
