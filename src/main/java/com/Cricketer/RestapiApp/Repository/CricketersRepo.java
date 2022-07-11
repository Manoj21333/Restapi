package com.Cricketer.RestapiApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Cricketer.RestapiApp.Model.Cricketer;

public interface CricketersRepo extends JpaRepository<Cricketer, Integer> {

}
