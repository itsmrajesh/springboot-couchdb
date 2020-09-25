package com.iexceed.couchdbapp.dao;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;

import com.iexceed.couchdbapp.model.Contact;
import com.iexceed.couchdbapp.repo.ContactRepository;

@Component
@Qualifier("ContactDaoJPAImpl")
public class ContactDaoJPAImpl implements ContactDao {

	@Autowired
	private ContactRepository repo;

	@Override
	public Contact save(Contact contact) {
		return repo.save(contact);
	}

	@Override
	public List<Contact> findAll() {

		Page<Contact> pages = repo.findAll(PageRequest.of(0, 20));

		return pages.stream().collect(Collectors.toList());
	}

	@Override
	public Contact findOne(String id) {
		Optional<Contact> obj = repo.findById(id);
		if (obj.isPresent()) {
			return obj.get();
		}
		return null;
	}

	@Override
	public void deleteOne(String id) {
		repo.deleteById(id);
	}

	@Override
	public void deleteAll() {
		repo.deleteAll();
	}

	@Override
	public Contact update(Contact contact) {
		return save(contact);
	}

	@Override
	public int saveAll(List<Contact> contacts) {

		int count = 0;

		Iterator<Contact> it = repo.saveAll(contacts).iterator();

		while (it.hasNext()) {
			count++;
			it.next();
		}

		return count;
	}

}
