package com.srkt.springbootpetclinic.bootstrap;

import com.srkt.springbootpetclinic.model.*;
import com.srkt.springbootpetclinic.services.OwnerService;
import com.srkt.springbootpetclinic.services.PetTypeService;
import com.srkt.springbootpetclinic.services.SpecialtyService;
import com.srkt.springbootpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialtyService specialtyService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialtyService specialtyService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;

        this.specialtyService = specialtyService;
    }



    @Override
    public void run(String... args) throws Exception {

        int count = petTypeService.findAll().size();

        if (count == 0 ){
            loadData();
        }

    }

    private void loadData() {
        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        Speciality radiology = new Speciality();
        radiology.setDescription("Radiology");
        Speciality savedRadiology = specialtyService.save(radiology);

        Speciality surgery = new Speciality();
        surgery.setDescription("Surgery");
        Speciality savedSurgery = specialtyService.save(surgery);

        Speciality dentistry = new Speciality();
        dentistry.setDescription("dentistry");
        Speciality savedDentistry = specialtyService.save(dentistry);

        Owner o1 = new Owner();

        o1.setFirstName("Jack");
        o1.setLastName("Jackson");
        o1.setAddress("Ankara");
        o1.setCity("Ankara");
        o1.setTelephone("123123");

        Pet jksPet = new Pet();
        jksPet.setPetType(savedDogPetType);
        jksPet.setOwner(o1);
        jksPet.setBirthDate(LocalDate.now());
        jksPet.setName("Rosco");
        o1.getPets().add(jksPet);

        ownerService.save(o1);

        Owner o2 = new Owner();

        o2.setFirstName("John");
        o2.setLastName("Johnson");
        o2.setAddress("İstanbul");
        o2.setCity("İstanbul");
        o2.setTelephone("123123");

        Pet alPet = new Pet();
        alPet.setPetType(savedCatPetType);
        alPet.setOwner(o2);
        alPet.setBirthDate(LocalDate.now());
        alPet.setName("Catcat");
        o1.getPets().add(alPet);

        ownerService.save(o2);

        Vet v1 = new Vet();

        v1.setFirstName("Ally");
        v1.setLastName("Allison");
        v1.getSpecialities().add(savedRadiology);
        vetService.save(v1);

        Vet v2 = new Vet();

        v2.setFirstName("Danny");
        v2.setLastName("Dannison");
        v2.getSpecialities().add(savedSurgery);
        vetService.save(v2);
    }

}
