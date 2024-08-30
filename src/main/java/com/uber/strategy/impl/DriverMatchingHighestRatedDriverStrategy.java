package com.uber.strategy.impl;

import com.uber.dto.RideRequestDto;
import com.uber.entity.Driver;
import com.uber.entity.RideRequest;
import com.uber.strategy.DriverMatchingStrategy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverMatchingHighestRatedDriverStrategy implements DriverMatchingStrategy {
    @Override
    public List<Driver> findMatchingDriver(RideRequest rideRequest) {
        return null;
    }
}
