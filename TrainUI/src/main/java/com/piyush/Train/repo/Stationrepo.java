package com.piyush.Train.repo;

import com.piyush.Train.Enitity.Station;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Stationrepo extends JpaRepository<Station,Long> {
}
