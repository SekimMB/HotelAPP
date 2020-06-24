package com.simple.HotelApp.domain.repository;

import com.simple.HotelApp.domain.entity.Receptionist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReceptionistRepository extends JpaRepository<Receptionist,Integer> {
}
