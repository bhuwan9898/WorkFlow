package com.learnerscorner.workflow.controller;

import com.learnerscorner.workflow.Worker;
import com.learnerscorner.workflow.service.EmployerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("employer") //all the requests that come in the url form employer/ will be handled by this class
public class EmployerController {
    @Autowired
    EmployerService employerService;
    // get all workers
    // this will listen to employer/allEmployees
    @GetMapping("allWorkers")
    public List<Worker> getAllWorkers(){
      return employerService.getAllWorkers();
    }

    //get workers by id
    @GetMapping("allWorkers/{id}")
    public Worker getWorkerById(@PathVariable int id){
        return employerService.getWorkerById(id);

    }


}
