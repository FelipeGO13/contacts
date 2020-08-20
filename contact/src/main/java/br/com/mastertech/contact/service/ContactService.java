package br.com.mastertech.contact.service;

import br.com.mastertech.contact.model.Contact;
import br.com.mastertech.contact.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

    @Autowired
    private ContactRepository contactRepository;

    public Contact create(Contact contact){
        return contactRepository.save(contact);
    }

    public Iterable<Contact> getAll(Integer userId){
        return contactRepository.findAllByUserId(userId);
    }
}
