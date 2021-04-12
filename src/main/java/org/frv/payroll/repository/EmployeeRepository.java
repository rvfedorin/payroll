package org.frv.payroll.repository;

import org.frv.payroll.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Roman V.F.
 * Date: 10.04.2021
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
