package models;

import javax.persistence.*;

@Entity
@Table(name = "autos")
public class Auto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "model")
    private String model;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "users_id")
    private Users users;

    public Auto(){
    }

    public Auto(String model){
        this.model=model;
    }

    public int getId() {
        return id;
    }


    public String getModel() {
        return model;
    }

    public Users getUsers() {
        return users;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Auto{}";
    }
}
