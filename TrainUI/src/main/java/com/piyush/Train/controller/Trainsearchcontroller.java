package com.piyush.Train.controller;

import com.piyush.Train.Enitity.Train;
import com.piyush.Train.Enitity.TrainSceheudule;
import com.piyush.Train.Service.TrainSearchService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/search")
@CrossOrigin
public class Trainsearchcontroller {
    private TrainSearchService trainsearchservice;
    public Trainsearchcontroller(TrainSearchService trainsearchservice){
        this.trainsearchservice=trainsearchservice;
    }
    @GetMapping("/by-code")
    public List<TrainSceheudule> findtrainbystationcode(@RequestParam String sourcecode,
                                                        @RequestParam String destinationcode){
        return trainsearchservice.findtrainbystationcode(sourcecode.toUpperCase(),destinationcode.toUpperCase());
    }
    @GetMapping("/by-name")
    public List<TrainSceheudule> findtrainbyname(@RequestParam String sourcename,
                                                 @RequestParam String destinationname){
        return trainsearchservice.findtrainbyname(sourcename.toUpperCase(),destinationname.toUpperCase());
    }
}
