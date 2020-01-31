package com.srkt.springbootpetclinic.bootstrap;

import com.srkt.springbootpetclinic.model.Owner;
import com.srkt.springbootpetclinic.model.Vet;
import com.srkt.springbootpetclinic.services.OwnerService;
import com.srkt.springbootpetclinic.services.VetService;
import com.srkt.springbootpetclinic.services.map.OwnerServiceMap;
import com.srkt.springbootpetclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    public DataLoader(){
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();


    }
    @Override
    public void run(String... args) throws Exception {

        Owner o1 = new Owner();
        o1.setId(1L);
        o1.setFirstName("Jack");
        o1.setLastName("Jackson");

        Owner o2 = new Owner();
        o2.setId(2L);
        o2.setFirstName("John");
        o2.setLastName("Johnson");

        Vet v1 = new Vet();
        v1.setId(1L);
        v1.setFirstName("Ally");
        v1.setLastName("Allison");

        Vet v2 = new Vet();
        v2.setId(1L);
        v2.setFirstName("Danny");
        v2.setLastName("Dannison");

    }

}
