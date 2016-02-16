package com.rest.service.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class WeatherObject {
    
    private String city;
    private String state;
    private String zipCode;


    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getZipCode() {
        return zipCode;
    }
}
