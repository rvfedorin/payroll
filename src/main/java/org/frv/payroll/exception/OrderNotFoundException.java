package org.frv.payroll.exception;

/**
 * @author Roman V.F.
 * Date: 10.04.2021
 */
public class OrderNotFoundException extends RuntimeException {
    public OrderNotFoundException(Long id) {
        super("Could not find order " + id);
    }
}
