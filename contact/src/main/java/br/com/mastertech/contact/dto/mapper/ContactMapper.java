package br.com.mastertech.contact.dto.mapper;

import br.com.mastertech.contact.dto.CreateContactRequest;
import br.com.mastertech.contact.model.Contact;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ContactMapper {

    public Contact toContact(CreateContactRequest createContactRequest, Integer userId){
        Contact contact = new Contact();

        contact.setName(createContactRequest.getName());
        contact.setTelephone(createContactRequest.getTelephone());
        contact.setUserId(userId);

        return contact;
    }

    public ContactResponse toContactResponse(Contact contact){
        ContactResponse contactResponse = new ContactResponse();

        contactResponse.setName(contact.getName());
        contactResponse.setTelephone(contact.getTelephone());

        return contactResponse;
    }

    public Iterable<ContactResponse> toGetAll(Iterable<Contact> contacts){
        List<ContactResponse> contactResponseList = new ArrayList<>();

        for(Contact c : contacts){
            contactResponseList.add(toContactResponse(c));
        }

        return contactResponseList;
    }
}
