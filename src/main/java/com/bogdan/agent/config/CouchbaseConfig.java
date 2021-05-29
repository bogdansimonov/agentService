package com.bogdan.agent.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;

@Configuration
public class CouchbaseConfig extends AbstractCouchbaseConfiguration {

    @Value("${couchbase.connection.string}")
    private String connectionString;

    @Value("${couchbase.username}")
    private String userName;

    @Value("${couchbase.password}")
    private String password;

    @Value("${couchbase.bucket}")
    private String bucket;

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
        return bucket;
    }
}
