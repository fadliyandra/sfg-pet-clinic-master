package guru.springframework.sfgpetclinic.repository;

import guru.springframework.sfgpetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepositroy extends CrudRepository<Vet, Long> {

}
