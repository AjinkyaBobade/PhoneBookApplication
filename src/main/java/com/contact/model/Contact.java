package com.contact.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name="All_Contact")
public class Contact {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="CONTACT_ID")
	private int contactid;
	
	@Column(name ="CONTACT_NAME")
	private String contactname;
	
	@Column(name ="CONTACT_NUMBER")
	private double contactnumber;
	
	@Column(name ="CONTACT_NICKNAME")
	private String contactnickname;
	
	@Column(name ="CONTACTEMAIL")
	private String contactemail;
	
	@Column(name = "CONTACT_SAVEDATE",updatable = false)
	@CreationTimestamp
	private LocalDate addedDate;
	
	@Column(name = "UPDATE_DATE",insertable = false)
	@UpdateTimestamp
	private LocalDate updatedDate;
	
	

	public LocalDate getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(LocalDate updatedDate) {
		this.updatedDate = updatedDate;
	}

	public int getContactid() {
		return contactid;
	}

	public void setContactid(int contactid) {
		this.contactid = contactid;
	}

	public String getContactname() {
		return contactname;
	}

	public void setContactname(String contactname) {
		this.contactname = contactname;
	}

	public String getContactnickname() {
		return contactnickname;
	}

	public void setContactnickname(String contactnickname) {
		this.contactnickname = contactnickname;
	}

	public String getContactemail() {
		return contactemail;
	}

	public void setContactemail(String contactemail) {
		this.contactemail = contactemail;
	}

	public double getContactnumber() {
		return contactnumber;
	}

	public void setContactnumber(double contactnumber) {
		this.contactnumber = contactnumber;
	}

	public LocalDate getAddedDate() {
		return addedDate;
	}

	public void setAddedDate(LocalDate addedDate) {
		this.addedDate = addedDate;
	}

	@Override
	public String toString() {
		return "Contact [contactid=" + contactid + ", contactname=" + contactname + ", contactnumber=" + contactnumber
				+ ", contactnickname=" + contactnickname + ", contactemail=" + contactemail + ", addedDate=" + addedDate
				+ ", updatedDate=" + updatedDate + "]";
	}

	
}
