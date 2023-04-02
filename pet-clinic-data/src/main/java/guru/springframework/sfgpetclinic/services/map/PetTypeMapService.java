package guru.springframework.sfgpetclinic.services.map;


import guru.springframework.sfgpetclinic.model.PetType;
import guru.springframework.sfgpetclinic.services.PetTypService;
import org.springframework.stereotype.Service;

import java.util.Set;


@Service
public class PetTypeMapService extends AbstractMapService<PetType, Long> implements PetTypService  {

    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public PetType findById(Long id) {
        return null;
    }

    @Override
    public PetType save(PetType object) {
        return super.save(object);
    }

    @Override
    public void delete(PetType object) {
        super.delete(object);

    }

    @Override
    public void deleteByID(Long id) {
        super.deleteById(id);

    }
}