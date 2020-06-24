package com.simple.HotelApp.domain.repository;

import com.simple.HotelApp.domain.entity.LoggedClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoggedClientRepository extends JpaRepository<LoggedClient,Integer> {
}
