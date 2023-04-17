package com.crud.operation.repository;

import  com.crud.operation.model.Job;
import org.springframework.data.couchbase.repository.CouchbaseRepository;

import org.springframework.stereotype.Repository;

    @Repository
    public interface JobRepository extends CouchbaseRepository<Job, Long> {
    }

