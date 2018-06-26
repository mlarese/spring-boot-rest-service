package gtw;


import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerCrud extends CrudRepository<Customer, Long>{
    List<Customer> finByLastName(String lastName);
}
