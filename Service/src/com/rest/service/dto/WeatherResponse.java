package com.rest.service.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class WeatherResponse extends Response {
    
    private Integer temp;
    private Double humidity;
    private Integer windSpeed;
    private Double pressure;
    private String description;
    
    
    public WeatherResponse() {}
    
    public WeatherResponse(String city) {
        this.temp = 100;
        this.humidity = 12.56;
        this.windSpeed = 15;
        this.pressure = 56.66;
    }
    
    public WeatherResponse(WeatherObject weatherObject) {
        this(weatherObject.getCity());
        this.description = "WEATHER FOR: " + weatherObject.getCity() + ", " 
                           + weatherObject.getState() + " " 
                           + weatherObject.getZipCode() 
                           + " Temp: " + this.temp 
                           + " Humidity: " + this.humidity;
    }

    public void setTemp(Integer temp) {
        this.temp = temp;
    }

    public Integer getTemp() {
        return temp;
    }

    public void setHumidity(Double humidity) {
        this.humidity = humidity;
    }

    public Double getHumidity() {
        return humidity;
    }

    public void setWindSpeed(Integer windSpeed) {
        this.windSpeed = windSpeed;
    }

    public Integer getWindSpeed() {
        return windSpeed;
    }

    public void setPressure(Double pressure) {
        this.pressure = pressure;
    }

    public Double getPressure() {
        return pressure;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}
