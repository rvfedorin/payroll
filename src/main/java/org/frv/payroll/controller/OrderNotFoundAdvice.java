package org.frv.payroll.controller;

import org.frv.payroll.exception.EmployeeNotFoundException;
import org.frv.payroll.exception.OrderNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Roman V.F.
 * Date: 10.04.2021
 */
@ControllerAdvice
public class OrderNotFoundAdvice {

    @ResponseBody
    @ExceptionHandler(OrderNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String orderNotFoundHandler(EmployeeNotFoundException exception) {
        return exception.getMessage();
    }
}
