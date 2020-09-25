package com.iexceed.couchdbapp.model;

import static org.springframework.data.couchbase.core.mapping.id.GenerationStrategy.UNIQUE;

import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.data.couchbase.core.mapping.Field;
import org.springframework.data.couchbase.core.mapping.id.GeneratedValue;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Contact {

	@Id
	@GeneratedValue(strategy = UNIQUE)
//	@Field
	private String id;
	
	@Field
	private String name;
	
	@Field
	private String email;
	
	@Field
	private String org;

}
