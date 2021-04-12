package org.frv.payroll.config;

import lombok.extern.slf4j.Slf4j;
import org.frv.payroll.model.Employee;
import org.frv.payroll.model.Order;
import org.frv.payroll.model.Status;
import org.frv.payroll.repository.EmployeeRepository;
import org.frv.payroll.repository.OrderRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Roman V.F.
 * Date: 10.04.2021
 */
@Slf4j
@Configuration
public class LoadDatabase {

    @Bean
    CommandLineRunner initDatabase(EmployeeRepository employeeRepo, OrderRepository orderRepository) {
        return args -> {
            employeeRepo.save(new Employee("Bilbo", "Baggins", "bulgar"));
            employeeRepo.save(new Employee("Frodo", "Baggins", "thief"));

            employeeRepo.findAll().forEach(employee -> log.info("Preloaded " + employee));

            orderRepository.save(new Order("MacBook Pro", Status.COMPLETED));
            orderRepository.save(new Order("iPhone", Status.IN_PROGRESS));

            orderRepository.findAll().forEach(order -> log.info("Preloaded " + order));
        };
    }
}
