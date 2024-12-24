package com.learnerscorner.workflow.dao;

import com.learnerscorner.workflow.Worker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkerDao extends JpaRepository<Worker, Integer> {

}
