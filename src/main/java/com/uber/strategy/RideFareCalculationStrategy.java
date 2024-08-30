package com.uber.strategy;

import com.uber.dto.RideRequestDto;
import com.uber.entity.RideRequest;

public interface RideFareCalculationStrategy {

    double RIDE_FARE_MULTIPLIER = 10;

    double calculateFare(RideRequest rideRequest);
}
