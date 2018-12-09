package net.cilution.sfgpetclinic.bootstrap;

import net.cilution.sfgpetclinic.model.Owner;
import net.cilution.sfgpetclinic.model.Vet;
import net.cilution.sfgpetclinic.services.OwnerService;
import net.cilution.sfgpetclinic.services.VetService;
import net.cilution.sfgpetclinic.services.map.OwnerServiceMap;
import net.cilution.sfgpetclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
// when Spring is up and running, it will run the CommandLineRunner components, one way to initialize data
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Michael");
        owner1.setFirstName("Weston");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Fiona");
        owner2.setFirstName("Glenanne");
        ownerService.save(owner2);

        System.out.println("Loaded owners...");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");
        vetService.save(vet2);

        System.out.println("Loaded vets...");
    }
}
