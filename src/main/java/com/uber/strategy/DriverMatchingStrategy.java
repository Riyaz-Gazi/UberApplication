package com.uber.strategy;

import com.uber.dto.RideRequestDto;
import com.uber.entity.Driver;
import com.uber.entity.RideRequest;

import java.util.List;

public interface DriverMatchingStrategy {
    List<Driver> findMatchingDriver(RideRequest rideRequest);
}
