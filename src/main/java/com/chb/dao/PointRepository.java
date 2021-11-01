package com.chb.dao;

import com.chb.entities.Point;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PointRepository extends JpaRepository<Point, Long> {
    @Query("select p from Point p")
    public List<Point> listPoint();
}
