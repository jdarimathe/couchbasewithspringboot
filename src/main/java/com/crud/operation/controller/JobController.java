package com.crud.operation.controller;

import com.crud.operation.exception.ResourceFoundException;
import com.crud.operation.model.Job;
import com.crud.operation.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobController {
    @Autowired
    private JobService jobService;


    @PostMapping("/create")
    public ResponseEntity<Job> saveJob(@RequestBody Job job) throws ResourceFoundException {
        return new ResponseEntity<Job>(jobService.saveJob(job), HttpStatus.CREATED);
    }

    @GetMapping("/jobs")
    public List<Job> getAllJobs(){
        return jobService.getJobs();
    }
}
