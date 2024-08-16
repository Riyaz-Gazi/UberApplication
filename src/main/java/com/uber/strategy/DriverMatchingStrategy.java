package com.uber.strategy;

import com.uber.dto.RideRequestDto;
import com.uber.entity.Driver;

import java.util.List;

public interface DriverMatchingStrategy {
    List<Driver> findMatchingDrivers(RideRequestDto rideRequestDto);
}
