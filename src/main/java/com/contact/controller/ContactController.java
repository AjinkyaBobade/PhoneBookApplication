package com.contact.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.contact.model.Contact;
import com.contact.service.ServiceI;

@RestController
public class ContactController {

	@Autowired
	private ServiceI serviceI;
	
	@PostMapping(value = "/savecontact",consumes = "application/json")
	public ResponseEntity<String> savecontact(@RequestBody Contact contact){
		
		boolean savecontact = serviceI.savecontact(contact);
		
		if(savecontact ==true) {
			
			return new ResponseEntity<String>("Contact Save Sucessfully",HttpStatus.CREATED);
		}else {
		
		return new ResponseEntity<String>("Contact Not Save",HttpStatus.BAD_REQUEST);
		}
		
	}
	
	@GetMapping(value ="getallcontact",produces = "application/json")
	public ResponseEntity<List<Contact>> getallcontact(){
		
		List<Contact> allcontact = serviceI.getallcontact();
		
		return new ResponseEntity<List<Contact>>(allcontact,HttpStatus.OK);
	}
	
	@PutMapping(value ="/updatecontact", consumes ="application/json")
	public ResponseEntity<String> updatecontact(@RequestBody Contact contact){
		
		boolean updatecontact = serviceI.updatecontact(contact);
		
		if(updatecontact== true) {
			return new ResponseEntity<String>("Contact Updated Sucessfully",HttpStatus.OK);
		}else {
			
			return new ResponseEntity<String>("Contact not Updated",HttpStatus.BAD_REQUEST);
		}
		
	}
	
	@DeleteMapping(value ="/deletebyID/{cid}")
	public ResponseEntity<String> deletebyid(@PathVariable Integer cid){
		
		boolean deletebyid = serviceI.deletebyid(cid);
		if(deletebyid) {
			return new ResponseEntity<String>("Contact Deleted Sucessfully",HttpStatus.OK);
		}else {
			
			return new ResponseEntity<String>("Not Delete",HttpStatus.BAD_REQUEST);
		}
	}
	
}
