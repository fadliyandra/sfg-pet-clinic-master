package guru.springframework.sfgpetclinic.bootstrap;


import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.Pet;
import guru.springframework.sfgpetclinic.model.PetType;
import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.OwnerService;
import guru.springframework.sfgpetclinic.services.PetTypeService;
import guru.springframework.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypService;



    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypService) {

        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypService = petTypService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType saveCatPetType = petTypService.save(cat);




        Owner owner1 = new Owner();
        owner1.setFirstName("Fadli");
        owner1.setLastName("Yandra");
        owner1.setAddress("123 titisan tunggang");
        owner1.setTelehone("082387123064");
        ownerService.save(owner1);

        Pet mikesPet = new Pet();
        mikesPet.setPetType(savedDogPetType);
        mikesPet.setOwner(owner1);
        mikesPet.setBirthDate(LocalDate.now());
        mikesPet.setName("fadli");
        owner1.getPets().add(mikesPet);
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Andre");
        owner2.setLastName("Taulani");
        owner2.setAddress("123 titisan tunggang");
        owner2.setTelehone("082387123064");

        Pet fionaCat = new Pet();
        fionaCat.setName("kity");
        fionaCat.setOwner(owner2);
        fionaCat.setBirthDate(LocalDate.now());
        fionaCat.setPetType(saveCatPetType);
        owner2.getPets().add(fionaCat);

        ownerService.save(owner2);

        System.out.println("load Owners....");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Manurung");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Amril");
        vet2.setLastName("tanjung");

        vetService.save(vet2);
        System.out.println("Loades Vets....");



















    }
}
