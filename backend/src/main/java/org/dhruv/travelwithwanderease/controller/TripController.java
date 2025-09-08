package org.dhruv.travelwithwanderease.controller;

import jakarta.validation.Valid;
import org.dhruv.travelwithwanderease.model.Trip;
import org.dhruv.travelwithwanderease.repository.TripRepository;
import org.dhruv.travelwithwanderease.service.TripService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/trips")
@CrossOrigin(origins = "http://localhost:3000") // allows your React app to call this
public class TripController {

    private final TripService tripService;
    public TripController(TripService tripService) {
        this.tripService = tripService;
    }

    @GetMapping
    public List<Trip> all(){
        return tripService.getAllTrips();
    }

    @PostMapping
    public Trip create(@Valid @RequestBody Trip trip){
        return tripService.createTrip(trip);
    }

    @GetMapping("/{id}")
    public Trip get(@PathVariable Long id){
        return tripService.getTripById(id);
    }
}
