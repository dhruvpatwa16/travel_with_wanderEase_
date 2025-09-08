package org.dhruv.travelwithwanderease.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Entity
@Data  //for auto-generate getters and setters
@NoArgsConstructor
@AllArgsConstructor
public class Trip {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Trip name is required")
    private String name;

    @NotBlank(message = "Destination is required")
    private String destination;

    @Min(value = 1, message = "There must be atleast 1 traveller")
    private Integer travellers;

    @Min(value = 1, message = "Budget cannot be negative or zero")
    private Double budget;
}
