package guru.springframework.sfgpetclinic.repository;

import guru.springframework.sfgpetclinic.model.Speciality;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpecialtyRepositry extends JpaRepository<Speciality, Long> {
}
