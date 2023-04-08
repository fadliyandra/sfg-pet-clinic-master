package guru.springframework.sfgpetclinic.services.springdatajpa;

import guru.springframework.sfgpetclinic.model.Visit;
import guru.springframework.sfgpetclinic.repository.VisitRepositroy;
import guru.springframework.sfgpetclinic.services.VisitService;

import java.util.HashSet;
import java.util.Set;

public class VisitSDJpaService implements VisitService {

    private final VisitRepositroy visitRepositroy;

    public VisitSDJpaService(VisitRepositroy visitRepositroy) {
        this.visitRepositroy = visitRepositroy;
    }

    @Override
    public Set<Visit> findAll() {
        Set<Visit> visits = new HashSet<>();
        visitRepositroy.findAll().forEach(visits::add);
        return visits;
    }

    @Override
    public Visit findById(Long aLong) {
        return visitRepositroy.findById(aLong).orElse(null);
    }

    @Override
    public Visit save(Visit object) {
        return visitRepositroy.save(object);
    }

    @Override
    public void delete(Visit object) {
        visitRepositroy.delete(object);

    }

    @Override
    public void deleteByID(Long aLong) {
         visitRepositroy.deleteById(aLong);

    }
}
