package br.com.mastertech.contact.repository;

import br.com.mastertech.contact.model.Contact;
import org.springframework.data.repository.CrudRepository;

public interface ContactRepository extends CrudRepository<Contact, Long> {
    Iterable<Contact> findAllByUserId(Integer userId);
}
