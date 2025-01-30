package com.efrei.tp4_efrei_spring;
import com.example.contacts.model.Contact;
import com.example.contacts.service.ContactService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contacts")
public class ContactController {
    private final ContactService service;

    public ContactController(ContactService service) {
        this.service = service;
    }

    @PostMapping
    public Contact addContact(@RequestBody Contact contact) {
        return service.addContact(contact);
    }

    @GetMapping
    public List<Contact> getAllContacts() {
        return service.getAllContacts();
    }
}
