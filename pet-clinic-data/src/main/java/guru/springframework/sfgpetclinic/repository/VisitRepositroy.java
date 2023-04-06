package guru.springframework.sfgpetclinic.repository;

import guru.springframework.sfgpetclinic.model.Vet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VisitRepositroy extends JpaRepository<Vet, Long> {

}
