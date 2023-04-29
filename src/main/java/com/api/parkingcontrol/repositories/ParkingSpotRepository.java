package com.api.parkingcontrol.repositories;

import com.api.parkingcontrol.models.ParkingSpotModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
//JpaRepository ja possui metodos prontos para transações com o banco de dados, buscar recursos, salvar, deletar, atualizar

@Repository //para transações com banco de dados
public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel, UUID> { //repository para o model

    boolean existsByLicensePlateCar(String licensePlateCar);
    boolean existsByParkingSpotNumber(String parkingSpotNumber);
    boolean existsByApartmentAndBlock(String apartment, String block);
}
