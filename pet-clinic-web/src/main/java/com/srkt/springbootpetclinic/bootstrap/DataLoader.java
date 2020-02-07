package com.srkt.springbootpetclinic.bootstrap;

import com.srkt.springbootpetclinic.model.Owner;
import com.srkt.springbootpetclinic.model.PetType;
import com.srkt.springbootpetclinic.model.Vet;
import com.srkt.springbootpetclinic.services.OwnerService;
import com.srkt.springbootpetclinic.services.PetTypeService;
import com.srkt.springbootpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }



    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        Owner o1 = new Owner();

        o1.setFirstName("Jack");
        o1.setLastName("Jackson");
        ownerService.save(o1);

        Owner o2 = new Owner();

        o2.setFirstName("John");
        o2.setLastName("Johnson");
        ownerService.save(o2);

        Vet v1 = new Vet();

        v1.setFirstName("Ally");
        v1.setLastName("Allison");
        vetService.save(v1);

        Vet v2 = new Vet();

        v2.setFirstName("Danny");
        v2.setLastName("Dannison");
        vetService.save(v2);

    }

}
