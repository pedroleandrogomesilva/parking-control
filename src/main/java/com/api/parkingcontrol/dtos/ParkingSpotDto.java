package com.api.parkingcontrol.dtos;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.time.LocalDateTime;

public class ParkingSpotDto {

    @NotBlank
    private String carParkingSpot;

    @NotBlank
    @Size(max = 7)
    private String licensePlate;

    @NotBlank
    private String carBrand;

    @NotBlank
    private String carModel;

    @NotBlank
    private String carColor;

    @NotBlank
    private String carOwner;

    @NotBlank
    private String apartment;

    @NotBlank
    private String block;

}
