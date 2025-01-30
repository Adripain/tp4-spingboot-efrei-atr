package com.efrei.tp4_efrei_spring;


import com.example.contacts.model.Contact;
import com.example.contacts.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {
    private final ContactRepository repository;
    
    @Value("${contact.prefix}")
    private String prefix;

    public ContactService(ContactRepository repository) {
        this.repository = repository;
    }

    public Contact addContact(Contact contact) {
        contact.setName(prefix + " " + contact.getName());
        return repository.save(contact);
    }

    public List<Contact> getAllContacts() {
        return repository.findAll();
    }
}
