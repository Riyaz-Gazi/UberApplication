package com.uber.service;

import org.locationtech.jts.geom.Point;

public interface DistanceService {
    double calculateDistance(Point src,Point dest);
}
