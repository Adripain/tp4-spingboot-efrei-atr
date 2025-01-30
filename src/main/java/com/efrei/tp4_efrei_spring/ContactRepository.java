package com.efrei.tp4_efrei_spring;
import com.example.contacts.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ContactRepository extends JpaRepository<Contact, Long> {
    List<Contact> findByNameContaining(String name);
    List<Contact> findByCategory(String category);
}
