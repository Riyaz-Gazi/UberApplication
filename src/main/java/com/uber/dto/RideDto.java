package com.uber.dto;

import com.uber.entity.enums.PaymentMethod;
import com.uber.entity.enums.RideStatus;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RideDto {

    private Long id;
    private Point pickupLocation;
    private Point dropOffLocation;
    private LocalDateTime createdTime;
    private PaymentMethod paymentMethod;
    private RideStatus rideStatus;
    private Double fare;
    private RiderDto riderDto;
    private DriverDto driverDto;
    private LocalDateTime startedAt;
    private LocalDateTime endedAt;
}
