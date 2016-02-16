package com.rest.service;

import com.rest.service.dto.WeatherObject;
import com.rest.service.dto.WeatherResponse;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/weather")
public class WeatherResource {
    
    @GET
    @Path("/{city}:{state}:{zipcode}")
    @Produces(MediaType.APPLICATION_JSON)
    public WeatherResponse getWeatherByCity(@PathParam("city") String city,
                                            @PathParam("state") String state,
                                            @PathParam("zipcode") String zipCode) {
        WeatherObject weatherObject = new WeatherObject();
        weatherObject.setCity(city);
        weatherObject.setState(state);
        weatherObject.setZipCode(zipCode);
        
        return new WeatherResponse(weatherObject);
    }
}
