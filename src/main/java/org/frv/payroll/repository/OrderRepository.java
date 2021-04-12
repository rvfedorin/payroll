package org.frv.payroll.repository;

import org.frv.payroll.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Roman V.F.
 * Date: 12.04.2021
 */
public interface OrderRepository extends JpaRepository<Order, Long> {
}
