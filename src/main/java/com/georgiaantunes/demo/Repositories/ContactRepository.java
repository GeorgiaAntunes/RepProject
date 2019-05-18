package com.georgiaantunes.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.georgiaantunes.demo.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long>{

}
