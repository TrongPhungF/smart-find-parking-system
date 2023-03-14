package com.org.managementservice.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "vehicle_parking_price")
public class VehicleParkingPrice implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String id;


}
