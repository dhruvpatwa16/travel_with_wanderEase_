package org.dhruv.travelwithwanderease.service;

import org.dhruv.travelwithwanderease.model.Trip;
import org.dhruv.travelwithwanderease.repository.TripRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TripService {
    private final TripRepository repo;

    public TripService(TripRepository repo){
        this.repo = repo;
    }

    public List<Trip> getAllTrips(){
        return repo.findAll();
    }

    public Trip createTrip(Trip trip){
        return repo.save(trip);
    }

    public Trip getTripById(Long id){
        return repo.findById(id).orElseThrow(() ->new RuntimeException("Trip not found"));
    }
}
