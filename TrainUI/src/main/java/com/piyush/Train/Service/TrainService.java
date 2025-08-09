package com.piyush.Train.Service;

import com.piyush.Train.Enitity.Train;
import com.piyush.Train.repo.Trainrepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainService {
    private Trainrepo trainrepo;
    public TrainService(Trainrepo trainrepo){
        this.trainrepo=trainrepo;
    }
    public List<Train> getall() {
        return trainrepo.findAll();
    }

    public Train addtrain(Train train) {
        return trainrepo.save(train);
    }
}
