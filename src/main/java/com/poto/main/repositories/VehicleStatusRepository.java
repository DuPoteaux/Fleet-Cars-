package com.poto.main.repositories;

import com.poto.main.models.VehicleStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface VehicleStatusRepository extends JpaRepository<VehicleStatus, Integer> {

}
