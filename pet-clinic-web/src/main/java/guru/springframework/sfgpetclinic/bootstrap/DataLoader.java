package guru.springframework.sfgpetclinic.bootstrap;


import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.PetType;
import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.OwnerService;
import guru.springframework.sfgpetclinic.services.PetTypService;
import guru.springframework.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypService petTypService;



    public DataLoader(OwnerService ownerService, VetService vetService, PetTypService petTypService) {

        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypService = petTypService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType saveDogType = petTypService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType saveCatType = petTypService.save(cat);




        Owner owner1 = new Owner();
        owner1.setFirstName("Fadli");
        owner1.setLastName("Yandra");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Andre");
        owner2.setLastName("Taulani");
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
