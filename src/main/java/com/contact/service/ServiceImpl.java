package com.contact.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.contact.model.Contact;
import com.contact.repository.ContactRepository;

import java.util.List;

@Service
public class ServiceImpl implements ServiceI {

	@Autowired
	private ContactRepository contactRepository;

	@Override
	public boolean savecontact(Contact contact) {

		Contact save = contactRepository.save(contact);

		if (save != null) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public List<Contact> getallcontact() {
		
		List<Contact> findAll = contactRepository.findAll();
		return findAll;
	}

	@Override
	public boolean updatecontact(Contact contact) {
		
		Contact save = contactRepository.save(contact);
		if(save==null) {
			return false;
		}else {
		return true;
	}
		}

	@Override
	public boolean deletebyid(Integer cid) {
		
		boolean existsById = contactRepository.existsById(cid);
		if(existsById) {
			
			contactRepository.deleteById(cid);
			return true;
		}else {
		return false;
		
		}
	}

	

	
	
	

}
