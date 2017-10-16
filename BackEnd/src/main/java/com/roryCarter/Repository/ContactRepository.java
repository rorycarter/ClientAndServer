package com.roryCarter.Repository;

import com.roryCarter.Domain.Contact;
import org.springframework.data.repository.CrudRepository;

public interface ContactRepository extends CrudRepository<Contact,String> {


}
