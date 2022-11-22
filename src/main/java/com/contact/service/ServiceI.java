package com.contact.service;

import com.contact.model.Contact;

import java.util.List;

public interface ServiceI {

	boolean savecontact(Contact contact);
	
	public List<Contact> getallcontact();
	
	public boolean updatecontact(Contact contact);
	
	boolean deletebyid(Integer cid);
	
	
	
}
