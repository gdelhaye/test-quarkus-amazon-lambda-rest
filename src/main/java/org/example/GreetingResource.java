package org.example;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @Inject
    MyService myService;

    @GET
    @Path("/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public Greeting hello(@PathParam("name") String name) {
        return this.myService.getMessage(name);
    }
}
