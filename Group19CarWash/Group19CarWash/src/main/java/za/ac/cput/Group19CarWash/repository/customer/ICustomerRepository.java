package za.ac.cput.Group19CarWash.repository.customer;

/*
  ICustomerRepository.java
  IRepository for the Customer
  Lyle Haines (217245919)
  10 April 2022
 */

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.Group19CarWash.domain.Customer;


import java.util.Optional;

public interface ICustomerRepository extends JpaRepository<Customer, String> {

    void deleteCustomerById(String cusId);

    Optional<Customer> findCustomerById(String cusId);

}
