package com.iexceed.couchdbapp.repo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.iexceed.couchdbapp.model.Contact;

//@N1qlPrimaryIndexed
//@ViewIndexed(designDoc = "contact")
@Repository
public interface ContactRepository extends PagingAndSortingRepository<Contact, String> {

}
