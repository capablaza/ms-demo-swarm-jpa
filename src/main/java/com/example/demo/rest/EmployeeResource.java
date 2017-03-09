package com.example.demo.rest;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.List;


@Path("/")
@Api(value = "/", description = "Get employee information", tags = "employee")
public class EmployeeResource {

    @Inject
    PersistenceHelper helper;

    @GET
    @Produces("application/json")
    @ApiOperation(value = "Get the all employees",
            notes = "Returns employees as list",
            response = List.class
    )
    public Employee[] get() {
        return helper.getEntityManager().createNamedQuery("Employee.findAll", Employee.class).getResultList().toArray(new Employee[0]);
    }
}