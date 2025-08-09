package com.piyush.Train.controller;

import com.piyush.Train.Enitity.Train;
import com.piyush.Train.Service.TrainService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/train")
public class TrainController {
    private TrainService trainService;
    public TrainController(TrainService trainService){   //we don't need autowired when their is only one attribute
        this.trainService=trainService;
    }
    @GetMapping
    public List<Train> getall(){
        return trainService.getall();
    }
    @PostMapping
    public Train addtrain(@RequestBody  Train train){
        return trainService.addtrain(train);
    }
}
