package com.example.bootcamp.repository;

import com.example.bootcamp.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ContactRepository extends JpaRepository<Contact, Long> {
    Contact findByEmail(String email);
}
