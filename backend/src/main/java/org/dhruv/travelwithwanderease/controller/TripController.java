package org.dhruv.travelwithwanderease.controller;

import org.dhruv.travelwithwanderease.model.Trip;
import org.dhruv.travelwithwanderease.repository.TripRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/trips")
@CrossOrigin(origins = "http://localhost:3000") // allows your React app to call this
public class TripController {
    private final TripRepository repo;
    public TripController(TripRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Trip> all(){
        return repo.findAll();
    }

    @PostMapping
    public Trip create(@RequestBody Trip t){
        return repo.save(t);
    }

    @GetMapping("/{id}")
    public Trip get(@PathVariable Long id){
        return repo.findById(id).orElseThrow();
    }
}
