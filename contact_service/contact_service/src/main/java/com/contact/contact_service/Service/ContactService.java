package com.contact.contact_service.Service;

import com.contact.contact_service.Entity.Contact;

import java.util.List;

public interface ContactService {

    public List<Contact> getContactofUser(Long userId);
}
