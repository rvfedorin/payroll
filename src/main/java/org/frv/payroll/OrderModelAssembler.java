package org.frv.payroll;

import org.frv.payroll.model.Order;
import org.frv.payroll.model.Status;
import org.frv.payroll.rest.OrderController;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

/**
 * @author Roman V.F.
 * Date: 12.04.2021
 */
@Component
public class OrderModelAssembler implements RepresentationModelAssembler<Order, EntityModel<Order>> {
    @Override
    public EntityModel<Order> toModel(Order order) {
        EntityModel<Order> entityModel = EntityModel.of(order,
                linkTo(methodOn(OrderController.class).one(order.getId())).withSelfRel(),
                linkTo(methodOn(OrderController.class).all()).withRel("employees"));

        if (order.getStatus() == Status.IN_PROGRESS) {
            entityModel.add(linkTo(methodOn(OrderController.class).cancel(order.getId())).withRel("cancel"));
            entityModel.add(linkTo(methodOn(OrderController.class).complete(order.getId())).withRel("complete"));
        }

        return entityModel;
    }
}
