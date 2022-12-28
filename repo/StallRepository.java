package co2103.hw2.repo;

import co2103.hw2.model.Stall;
import org.springframework.data.repository.CrudRepository;

public interface StallRepository extends CrudRepository<Stall, String> {
    public Stall findByGame(String game);
}
