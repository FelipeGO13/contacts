package br.com.mastertech.contact.controller;

import br.com.mastertech.contact.dto.CreateContactRequest;
import br.com.mastertech.contact.dto.mapper.ContactMapper;
import br.com.mastertech.contact.dto.mapper.ContactResponse;
import br.com.mastertech.contact.model.Contact;
import br.com.mastertech.contact.security.User;
import br.com.mastertech.contact.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class ContactController {

    @Autowired
    private ContactService contactService;

    @Autowired
    private ContactMapper contactMapper;

    @PostMapping("/contato")
    public ContactResponse create(@Valid @RequestBody CreateContactRequest createContactRequest, @AuthenticationPrincipal User user){
        Contact contact = contactService.create(contactMapper.toContact(createContactRequest, user.getId()));

        return contactMapper.toContactResponse(contact);
    }

    @GetMapping("/contatos")
    public Iterable<ContactResponse> getAll(@AuthenticationPrincipal User user){
        return contactMapper.toGetAll(contactService.getAll(user.getId()));
    }
}
