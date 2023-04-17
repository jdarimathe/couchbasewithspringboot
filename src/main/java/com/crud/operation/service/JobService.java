package com.crud.operation.service;

import com.crud.operation.exception.ResourceFoundException;
import com.crud.operation.model.Job;
import com.crud.operation.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobService {
    @Autowired
    private JobRepository jobRepository;

    /*
     * Post into couchbase
     */
    public Job saveJob(Job job) throws ResourceFoundException {
        Optional<Job> savedJob = jobRepository.findById(job.getId());
        if(savedJob.isPresent()){
            throw new ResourceFoundException("Job already exist with given ID:" + job.getId());
        }

        return jobRepository.save(job);
    }

    /*
     * Get a List job from couchbase
     */
    public List<Job> getJobs(){
        return jobRepository.findAll();
    }

}
