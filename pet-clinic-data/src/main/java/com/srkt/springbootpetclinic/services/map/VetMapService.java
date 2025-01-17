package com.srkt.springbootpetclinic.services.map;

import com.srkt.springbootpetclinic.model.Speciality;
import com.srkt.springbootpetclinic.model.Vet;
import com.srkt.springbootpetclinic.services.SpecialtyService;
import com.srkt.springbootpetclinic.services.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default","map"})
public class VetMapService extends AbstractMapService<Vet,Long> implements VetService {

    private final SpecialtyService specialtyService;

    public VetMapService(SpecialtyService specialtyService) {
        this.specialtyService = specialtyService;
    }


    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }



    @Override
    public void delete(Vet object) {
        super.delete(object);

    }
    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }

    @Override
    public Vet save(Vet object) {
        if (object.getSpecialities().size() > 0){
            object.getSpecialities().forEach(speciality -> {
                if(speciality.getId() == null){
                    Speciality savedSpecialty = specialtyService.save(speciality);
                    speciality.setId(savedSpecialty.getId());
                }
            });
        }

        return super.save(object);
    }


}
