package com.maarouf.immatriculationqueryservice.repositories;

import com.maarouf.immatriculationqueryservice.entities.Vehicle;
import com.maarouf.immatriculationqueryservice.entities.VehicleOwner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, String> {
    Vehicle findVehicleByOwner(VehicleOwner vehicleOwner);
}
