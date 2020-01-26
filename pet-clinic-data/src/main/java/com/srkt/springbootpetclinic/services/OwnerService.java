package com.srkt.springbootpetclinic.services;

import com.srkt.springbootpetclinic.model.Owner;



public interface OwnerService extends CrudService<Owner,Long> {

   Owner findByLastName(String lastName);


}
