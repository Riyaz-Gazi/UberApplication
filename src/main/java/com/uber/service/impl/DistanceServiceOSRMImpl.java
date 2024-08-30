package com.uber.service.impl;

import com.uber.service.DistanceService;
import org.locationtech.jts.geom.Point;
import org.springframework.stereotype.Service;

@Service
public class DistanceServiceOSRMImpl implements DistanceService {
    @Override
    public double calculateDistance(Point src, Point dest) {
        // Call the third party api osrm
        return 0;
    }
}
