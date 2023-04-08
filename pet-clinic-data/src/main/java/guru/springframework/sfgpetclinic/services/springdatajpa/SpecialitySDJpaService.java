package guru.springframework.sfgpetclinic.services.springdatajpa;

import guru.springframework.sfgpetclinic.model.Speciality;
import guru.springframework.sfgpetclinic.repository.SpecialtyRepositry;
import guru.springframework.sfgpetclinic.services.SpecialtyService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class SpecialitySDJpaService implements SpecialtyService {


    private final SpecialtyRepositry specialtyRepositry;

    public SpecialitySDJpaService(SpecialtyRepositry specialtyRepositry) {
        this.specialtyRepositry = specialtyRepositry;
    }

    @Override
    public Set<Speciality> findAll() {

        Set<Speciality> specialities= new HashSet<>();
        specialtyRepositry.findAll().forEach(specialities::add);
        return specialities;
    };

    @Override
    public Speciality findById(Long aLong) {
        return specialtyRepositry.findById(aLong).orElse(null);
    }

    @Override
    public Speciality save(Speciality object) {
        return specialtyRepositry.save(object);
    }

    @Override
    public void delete(Speciality object) {
        specialtyRepositry.delete(object);

    }

    @Override
    public void deleteByID(Long aLong) {

        specialtyRepositry.deleteById(aLong);
    }
}
