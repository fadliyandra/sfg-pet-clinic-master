package guru.springframework.sfgpetclinic.repository;

import guru.springframework.sfgpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepositroy extends CrudRepository<Visit, Long> {

}
