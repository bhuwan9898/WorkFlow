package com.learnerscorner.workflow.service;

import com.learnerscorner.workflow.Worker;
import com.learnerscorner.workflow.dao.WorkerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployerService {
    @Autowired
    WorkerDao workerDao;

    //get all workers
    public List<Worker> getAllWorkers() {
        List<Worker> workers = workerDao.findAll();
        return workers;
    }

    //get workers by id
    public Worker getWorkerById(int id) {
        return workerDao.findById(id).orElse(null); // Returns null if the worker is not found
    }
}
