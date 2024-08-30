package com.uber.strategy.impl;

import com.uber.dto.RideRequestDto;
import com.uber.entity.RideRequest;
import com.uber.strategy.RideFareCalculationStrategy;
import org.springframework.stereotype.Service;


@Service
public class RideFareSurgePricingFareCalculationStrategy implements RideFareCalculationStrategy {
    @Override
    public double calculateFare(RideRequest rideRequest) {
        return 0;
    }
}
