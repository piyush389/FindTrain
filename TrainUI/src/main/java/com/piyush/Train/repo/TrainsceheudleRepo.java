package com.piyush.Train.repo;

import com.piyush.Train.Enitity.TrainSceheudule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrainsceheudleRepo extends JpaRepository<TrainSceheudule,Long> {
    List<TrainSceheudule> findBySource_StationCodeAndDestination_StationCode(String sourceCode, String destinationCode);
    List<TrainSceheudule> findBySource_StationNameAndDestination_StationName(String sourceName, String destinationName);
}
