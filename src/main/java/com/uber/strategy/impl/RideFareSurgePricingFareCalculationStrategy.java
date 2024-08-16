package com.uber.strategy.impl;

import com.uber.dto.RideRequestDto;
import com.uber.strategy.RideFareCalculationStrategy;
import org.springframework.stereotype.Service;


@Service
public class RideFareSurgePricingFareCalculationStrategy implements RideFareCalculationStrategy {
    @Override
    public double calculateFare(RideRequestDto rideRequestDto) {
        return 0;
    }
}
