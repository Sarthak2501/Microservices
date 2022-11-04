package com.contact.contact_service.Service;

import com.contact.contact_service.Entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService{


    //fake list of contacts

    List<Contact> list = List.of(
            new Contact(1L,"amit@gmail.com","Amit",1311L),
            new Contact(2L,"anil@gmail.com","Anil",1311L),
            new Contact(3L,"Rohan@gmail.com","Rohan",1312L),
            new Contact(4L,"Sameer@gmail.com","Sameer",1313L)
    );

    @Override
    public List<Contact> getContactofUser(Long userId) {
        return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
