package com.elearning;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @GET
    @Path("/hello")
    public String hello() {
        return "Hello from Quarkus REST";
    }

    @GET
    @Path("/ciao")
    public String ciao() {
        return "Ciao da Quarkus REST";
    }

    @POST
    @Path("/hello")
    public String postHello() {
        return "Post Hello from Quarkus REST";
    }


}
