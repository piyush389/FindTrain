package com.piyush.Train.Enitity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Train {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String trainNumber;
    private String TrainName;
    @OneToMany(mappedBy = "train",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JsonBackReference
    List<TrainSceheudule> trainSceheudules;
    public Train(){

    }

    public Train(Long id,  String trainName,String trainNumber, List<TrainSceheudule> trainSceheudules) {
        this.id = id;
        this.trainNumber =trainNumber;
        TrainName = trainName;
        this.trainSceheudules = trainSceheudules;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(String trainNumber) {
        this.trainNumber = trainNumber;
    }

    public List<TrainSceheudule> getTrainSceheudules() {
        return trainSceheudules;
    }

    public void setTrainSceheudules(List<TrainSceheudule> trainSceheudules) {
        this.trainSceheudules = trainSceheudules;
    }

    public String getTrainName() {
        return TrainName;
    }

    public void setTrainName(String trainName) {
        TrainName = trainName;
    }
}
