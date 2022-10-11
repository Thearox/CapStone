package za.ac.cput.repository;

/*
  IPaymentRepository.java
  IRepository for the Payment
  Lyle Haines (217245919)
  10 April 2022
 */

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.Group19CarWash.domain.Payment;


import java.util.Optional;
import java.util.Set;

public interface IPaymentRepository extends JpaRepository<Payment, String> {

    void deletePaymentById(String paymentId);

    Optional<Payment> findPaymentById(String paymentId);
}
