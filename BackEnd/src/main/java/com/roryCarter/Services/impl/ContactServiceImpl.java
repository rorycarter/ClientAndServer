package com.roryCarter.Services.impl;

import com.roryCarter.Domain.Contact;
import com.roryCarter.Repository.ContactRepository;
import com.roryCarter.Services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactRepository contactRepository;

    @Override
    public Contact save(Contact entity)
    {
        return contactRepository.save(entity);
    }

    @Override
    public Contact findById(String s)
    {
        return contactRepository.findOne(s);
    }

    @Override
    public Contact update(Contact entity)
    {
        return contactRepository.save(entity);
    }

    @Override
    public void delete(Contact entity)
    {
        contactRepository.delete(entity);
    }

}
