package co2103.hw2.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Carnival {
    @Id
    @GeneratedValue
    private int id; // use as primary key
    private String city;
    @ManyToOne
    @JoinColumn
    private Stall firstStall;
    @ManyToMany(cascade = CascadeType.MERGE)
    @JoinColumn
    private List<Stall> stalls;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Stall getFirstStall() {
        return firstStall;
    }

    public void setFirstStall(Stall firstStall) {
        this.firstStall = firstStall;
    }

    public List<Stall> getStalls() {
        return stalls;
    }

    public void setStalls(List<Stall> stalls) {
        this.stalls = stalls;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    @Override
    public String toString() {
        return "Carnival{" +
                "id=" + id +
                ", city='" + city + '\'' +
                ", firstStall=" + firstStall +
                ", stalls=" + stalls +
                '}';
    }
}



