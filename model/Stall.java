package co2103.hw2.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Stall {
    @Id
    private String game;
    @ManyToMany(mappedBy = "stalls")
    private List<Carnival> carnivals;
    @OneToMany(cascade = CascadeType.REMOVE,fetch = FetchType.EAGER)
    @JoinColumn
    private List<Employee> employees;
    @OneToOne
    @JoinColumn
    private Employee owner;

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }

    public List<Carnival> getCarnivals() {
        return carnivals;
    }

    public void setCarnivals(List<Carnival> carnivals) {
        this.carnivals = carnivals;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public Employee getOwner() {
        return owner;
    }

    public void setOwner(Employee owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Stall{" +
                "game='" + game + '\'' +
                ", carnivals=" + carnivals +
                ", employees=" + employees +
                ", owner=" + owner +
                '}';
    }
}
