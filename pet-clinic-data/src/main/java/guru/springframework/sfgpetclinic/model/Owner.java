package guru.springframework.sfgpetclinic.model;

//import lombok.Builder;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//import javax.persistence.*;
//import java.util.HashSet;
//import java.util.Set;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by jt on 7/13/18.
 */
//@Setter
//@Getter
//@NoArgsConstructor
//@Entity
//@Table(name = "owners")
public class Owner extends Person {



    private String address;
    private String city;
    private String telehone;
    private Set<Pet> pets = new HashSet<>();

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTelehone() {
        return telehone;
    }

    public void setTelehone(String telehone) {
        this.telehone = telehone;
    }

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
}
