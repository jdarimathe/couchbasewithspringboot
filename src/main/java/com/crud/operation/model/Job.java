package com.crud.operation.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;


@Setter
@Getter
@Document
public class Job {

    @Id
    private long id;
    private String jobName;
    private String jobDescription;
    private String jobLocation;
    private String jobType;
}
