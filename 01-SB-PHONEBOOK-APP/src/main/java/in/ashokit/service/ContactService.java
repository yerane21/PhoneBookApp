package in.ashokit.service;

import java.util.List;

import in.ashokit.entity.Contact;

public interface ContactService {
  
	public boolean saveOrUpdateContact(Contact contact);      //saveContact both are same
	
	public List<Contact> getAllContacts();
	
	public Contact getContactById(Integer contactId);
	
	public boolean deleteContactById(Integer contactId);
}
