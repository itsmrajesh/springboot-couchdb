package com.iexceed.couchdbapp.dao;

import java.util.List;

import com.iexceed.couchdbapp.model.Contact;

public interface ContactDao {

	Contact save(Contact contact);

	List<Contact> findAll();

	Contact findOne(String id);

	void deleteOne(String id);

	void deleteAll();

	Contact update(Contact contact);

	int saveAll(List<Contact> contacts);

}
