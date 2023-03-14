package com.org.managementservice.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "parking_lot")
public class ParkingLot implements Serializable{

    private static final long serialVersionUID = 1L;
    @Id
    private String id;
    private String name;
    private String address;
    private Integer size;

    private VehicleParkingPrice vehicleParkingPrice;
    private String user;
    private String status;
}
