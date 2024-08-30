package com.uber.dto;

import com.uber.entity.enums.PaymentMethod;
import com.uber.entity.enums.RideRequestStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RideRequestDto {

    private Long id;

    private PointDto pickupLocation;

    private PointDto dropOffLocation;

    private LocalDateTime requestedTime;

    private PaymentMethod paymentMethod;

    private RideRequestStatus rideRequestStatus;

    private RiderDto riderDto;

}
