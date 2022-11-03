package com.contact.contact_service.Controller;


import com.contact.contact_service.Entity.Contact;
import com.contact.contact_service.Service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/contact")
public class ContactController {

    @Autowired
    private ContactService contactService;

    @RequestMapping("/user/{userId}")
    public List<Contact> getContacts(@PathVariable("userId") Long userId){
        return this.contactService.getContactofUser(userId);
    }
}
