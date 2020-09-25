package com.iexceed.couchdbapp.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.couchbase.core.CouchbaseTemplate;
import org.springframework.stereotype.Component;

import com.iexceed.couchdbapp.model.Contact;

@Component
@Qualifier("ContactDaoCouchTemplate")
public class ContactDaoCouchTemplate implements ContactDao {

	@Autowired
	private CouchbaseTemplate template;

	@Override
	public Contact save(Contact contact) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Contact> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contact findOne(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteOne(String id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub

	}

	@Override
	public Contact update(Contact contact) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int saveAll(List<Contact> contacts) {
		// TODO Auto-generated method stub
		return 0;
	}

}
