package org.dhruv.travelwithwanderease.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data  //for auto-generate getters and setters
@NoArgsConstructor
@AllArgsConstructor
public class Trip {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String destination;
    private Integer travellers;
    private Double budget;
}
