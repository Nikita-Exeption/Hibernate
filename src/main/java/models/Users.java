package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "age")
    private int age;

    @OneToMany(mappedBy = "users",cascade = CascadeType.ALL,orphanRemoval = true)

    private List<Auto> autos;

    public Users(){
    }
    public Users(String name,int age){
        this.age=age;
        this.name=name;
        autos=new ArrayList<>();
    }
    public void addAuto(Auto auto){
        auto.setUsers(this);
        autos.add(auto);
    }
    public void removeAuto(Auto auto){
        autos.remove(auto);
    }

    public int getId() {
        return id;
    }

    public List<Auto> getAutos() {
        return autos;
    }

    public String getName() {
        return name;
    }

    public void setAutos(List<Auto> autos) {
        this.autos = autos;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", autos=" + autos +
                '}';
    }
}
