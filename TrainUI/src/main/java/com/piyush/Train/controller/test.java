package com.piyush.Train.controller;
import com.piyush.Train.Enitity.Station;
import com.piyush.Train.Enitity.Train;
import com.piyush.Train.Enitity.TrainSceheudule;
import com.piyush.Train.repo.Stationrepo;
import com.piyush.Train.repo.Trainrepo;
import com.piyush.Train.repo.TrainsceheudleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
@RequestMapping("/test")
public class test {
    @Autowired
    Stationrepo stationrepo;
    @Autowired
    Trainrepo trainrepo;
    @Autowired
    TrainsceheudleRepo trainsceheudleRepo;
     @GetMapping
    public void test(){
         Station delhi=new Station(null,"Delhi","NDLS");
         Station mumbai=new Station(null,"Mumbai","CST");
         Station kolkata=new Station(null,"Kolkata","KOAA");
         Station chennai=new Station(null,"Chennai","MASS");
         stationrepo.saveAll(List.of(delhi,mumbai,kolkata,chennai));

         Train rajdani=new Train(null,"Rajdani-Express","1123",null);
         Train dhuronto=new Train(null,"Dhuronto-Express","1234",null);
         Train shatabdhi=new Train(null,"Shatabdhi","1654",null);
         trainrepo.saveAll(List.of(rajdani,dhuronto,shatabdhi));

         TrainSceheudule sc1=new TrainSceheudule(null,rajdani,delhi,mumbai,"6:00","14:00");
         TrainSceheudule sc2=new TrainSceheudule(null,dhuronto,mumbai,kolkata,"8:00","21:00");
         TrainSceheudule sc3=new TrainSceheudule(null,shatabdhi,chennai,kolkata,"7:00","19:00");
         trainsceheudleRepo.saveAll(List.of(sc1,sc2,sc3));

     }
}
