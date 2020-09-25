package com.iexceed.couchdbapp.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;
import org.springframework.data.couchbase.repository.config.EnableCouchbaseRepositories;

@Configuration
@EnableCouchbaseRepositories(basePackages = { "com.iexceed.couchdbapp" })
public class CouchDBConfig extends AbstractCouchbaseConfiguration {

	
	// Values from application.properties
	@Value("${couchbase.bootstrap-hosts}")
	String url;
	
	@Value("${couchbase.bucket.username}")
	String userName;
	
	@Value("${couchbase.bucket.name}")
	String bucketName;
	
	@Value("${couchbase.bucket.password}")
	String pwd;

	@Override
	public String getConnectionString() {
		return url;
	}

	@Override
	public String getUserName() {
		return userName;
	}

	@Override
	public String getPassword() {
		return pwd;
	}

	@Override
	public String getBucketName() {
		return bucketName;
	}

}
