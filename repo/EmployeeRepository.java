package co2103.hw2.repo;

import co2103.hw2.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
    public Employee findByPrice(Integer price);
}
