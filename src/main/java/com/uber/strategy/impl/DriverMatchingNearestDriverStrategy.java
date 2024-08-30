package com.uber.strategy.impl;

import com.uber.dto.RideRequestDto;
import com.uber.entity.Driver;
import com.uber.entity.RideRequest;
import com.uber.repository.DriverRepository;
import com.uber.strategy.DriverMatchingStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.List;

@Service
@RequiredArgsConstructor
@Primary
public class DriverMatchingNearestDriverStrategy implements DriverMatchingStrategy {

    private final DriverRepository driverRepository;
    @Override
    public List<Driver> findMatchingDriver(RideRequest rideRequest) {
        return driverRepository.findTenNearestDrivers(rideRequest.getPickupLocation());
    }
}
