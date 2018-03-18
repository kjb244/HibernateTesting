package main.java.com.spring.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "address_info")
public class AddressInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column( updatable = false, nullable = false)
    private int id;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String email;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "addressInfo")
    @JsonManagedReference
    private Set<DogInfo> dogInfoSet;

    public AddressInfo(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<DogInfo> getDogInfoSet() {
        return dogInfoSet;
    }

    public void setDogInfoSet(Set<DogInfo> dogInfoSet) {
        this.dogInfoSet = dogInfoSet;
    }

    @Override
    public String toString() {
        return "AddressInfo{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", dogInfoSet=" + dogInfoSet +
                '}';
    }
}
