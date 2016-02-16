package com.rest.service;

import com.rest.service.dto.Response;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/service")
public class ServiceResource {
    

    @GET
    @Path("/getData")
    @Produces(MediaType.APPLICATION_XML)
    public Response getData() {
        
        Response response = new Response("First", 3);
        
        List<String> messages = new ArrayList<>();
        messages.add("One message");
        messages.add("Two Message");
        messages.add("Three Message");
        
        response.setMessages(messages);
        
        return response;
    }
    
    @GET
    @Path("/getData/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getData(@PathParam("name") String name) {
        return new Response(name, 3);
    }
}
