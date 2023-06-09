package com.crud.operation.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;
import org.springframework.stereotype.Component;

@Component
public class CouchbaseConfig extends AbstractCouchbaseConfiguration {

    @Value("${app.couchbase.connection-string}")
    private String connectionString;

    @Value("${app.couchbase.user-name}")
    private String userName;

    @Value("${app.couchbase.password}")
    private String password;

    @Value("${app.couchbase.bucket-job}")
    private String jobBucket;

    @Override
    public String getConnectionString() {
        return connectionString;
    }

    @Override
    public String getUserName() {
        return userName;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getBucketName() {
        return jobBucket;
    }

}
