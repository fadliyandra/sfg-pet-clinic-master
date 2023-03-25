package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.Vet;


/**
 * Created by jt on 7/18/18.
 */
public interface VetService extends CrudService<Vet, Long>{
    Vet findByLastName(String lastName);

}
