package com.uber.service.impl;

import com.uber.dto.DriverDto;
import com.uber.dto.RideDto;
import com.uber.dto.RideRequestDto;
import com.uber.dto.RiderDto;
import com.uber.entity.RideRequest;
import com.uber.entity.Rider;
import com.uber.entity.User;
import com.uber.entity.enums.RideRequestStatus;
import com.uber.repository.RideRequestRepository;
import com.uber.repository.RiderRepository;
import com.uber.service.RiderService;
import com.uber.strategy.DriverMatchingStrategy;
import com.uber.strategy.RideFareCalculationStrategy;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class RiderServiceImpl implements RiderService {

    private final ModelMapper modelMapper;
    private final RideFareCalculationStrategy rideFareCalculationStrategy;
    private final DriverMatchingStrategy driverMatchingStrategy;
    private final RideRequestRepository rideRequestRepository;
    private final RiderRepository riderRepository;

    @Override
    public RideRequestDto requestRide(RideRequestDto rideRequestDto) {

        RideRequest rideRequest = modelMapper.map(rideRequestDto, RideRequest.class);
        rideRequest.setRideRequestStatus(RideRequestStatus.PENDING);

        Double fare = rideFareCalculationStrategy.calculateFare(rideRequest);
        rideRequest.setFare(fare);

        RideRequest savedRideRequest = rideRequestRepository.save(rideRequest);

        driverMatchingStrategy.findMatchingDriver(rideRequest);

        return modelMapper.map(savedRideRequest, RideRequestDto.class);
    }

    @Override
    public RideDto cancelRide(Long rideId) {
        return null;
    }

    @Override
    public DriverDto rateDriver(Long rideId, Integer rating) {
        return null;
    }

    @Override
    public RiderDto getMyProfile() {
        return null;
    }

    @Override
    public List<RideDto> getAllMyRides() {
        return null;
    }

    @Override
    public Rider createNewRider(User user) {
        Rider rider = Rider
                .builder()
                .user(user)
                .rating(0.0)
                .build();
        return riderRepository.save(rider);
    }
}
