package com.uber.strategy.impl;

import com.uber.dto.RideRequestDto;
import com.uber.entity.Driver;
import com.uber.strategy.DriverMatchingStrategy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverMatchingNearestDriverStrategy implements DriverMatchingStrategy {
    @Override
    public List<Driver> findMatchingDrivers(RideRequestDto rideRequestDto) {
        return null;
    }
}
