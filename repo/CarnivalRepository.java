package co2103.hw2.repo;

import co2103.hw2.model.Carnival;
import org.springframework.data.repository.CrudRepository;

public interface CarnivalRepository extends CrudRepository<Carnival, Integer> {
    public Carnival findByCity(String city);
    public Carnival findByFirstStallGame(String game);

}
