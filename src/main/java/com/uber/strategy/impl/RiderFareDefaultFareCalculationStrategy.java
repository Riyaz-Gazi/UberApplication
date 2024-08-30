package com.uber.strategy.impl;

import com.uber.dto.RideRequestDto;
import com.uber.entity.RideRequest;
import com.uber.service.DistanceService;
import com.uber.strategy.RideFareCalculationStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Primary
public class RiderFareDefaultFareCalculationStrategy implements RideFareCalculationStrategy {

    private final DistanceService distanceService;
    @Override
    public double calculateFare(RideRequest rideRequest) {
        Double distance = distanceService.calculateDistance(rideRequest.getPickupLocation(),rideRequest.getDropOffLocation());
        return distance*RIDE_FARE_MULTIPLIER;
    }
}
