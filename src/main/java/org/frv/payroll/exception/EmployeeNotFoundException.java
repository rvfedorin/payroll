package org.frv.payroll.exception;

/**
 * @author Roman V.F.
 * Date: 10.04.2021
 */
public class EmployeeNotFoundException extends RuntimeException {
    public EmployeeNotFoundException(Long id) {
        super("Could not find employee " + id);
    }
}
