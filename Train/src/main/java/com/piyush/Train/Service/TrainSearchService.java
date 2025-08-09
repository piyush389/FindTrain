package com.piyush.Train.Service;

import com.piyush.Train.Enitity.TrainSceheudule;
import com.piyush.Train.repo.TrainsceheudleRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainSearchService {
    private TrainsceheudleRepo trainsceheudleRepo;
    public TrainSearchService(TrainsceheudleRepo trainSceheudule){
       this.trainsceheudleRepo=trainSceheudule;
    }
    public List<TrainSceheudule> findtrainbystationcode(String sourceocode, String destinationcode) {
        return trainsceheudleRepo.
                findBySource_StationCodeAndDestination_StationCode(sourceocode,destinationcode);
    }

    public List<TrainSceheudule> findtrainbyname(String sourcename, String destinationname) {
        return trainsceheudleRepo.
                findBySource_StationNameAndDestination_StationName(sourcename,destinationname);
    }
}
