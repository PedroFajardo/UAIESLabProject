/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.UA.IES.LabProject;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pedro
 */
public class FlightsList {
    private List<Flight> flights;
 
    public FlightsList() {
        flights = new ArrayList<>();
    }
 
    // standard constructor and getter/setter

    public FlightsList(List<Flight> flights) {
        this.flights = flights;
    }

    public List<Flight> getFlights() {
        return flights;
    }

    public void setFlights(List<Flight> flights) {
        this.flights = flights;
    }
}