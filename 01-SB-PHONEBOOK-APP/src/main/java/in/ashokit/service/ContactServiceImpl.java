package in.ashokit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Contact;
import in.ashokit.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {
	
	private ContactRepository repository;
	
	@Autowired    //it is optional
	public ContactServiceImpl(ContactRepository repository) {
		this.repository = repository;
	}

	@Override
	public boolean saveOrUpdateContact(Contact contact) {
		Contact savedObj = repository.save(contact);
		
		//----------fresher level code
		/*
		if(savedObj.getContactId() !=null) {
			return true;
		}else {
			return false;
		}
		*/
		
		//-----------1 or 2 yer exp level code
		//return (savedObj.getContactId() !=null)? true : false;
		
		//---------- 3 or more exp level code
		return savedObj.getContactId() !=null;
	}

	@Override
	public List<Contact> getAllContacts() {
		//-------fresher level code
		/*
		List<Contact> findAll = repository.findAll();
		return findAll;
		*/
		
		//-------Exp level code
		return repository.findAll();
		
	}

	@Override
	public Contact getContactById(Integer contactId) {
		Optional<Contact> findById = repository.findById(contactId);
		if(findById.isPresent()) {
			
			//----fresher level code
			/*
			Contact contact = findById.get();
			return contact;
			*/
			
			//------Exp level code
			return findById.get();
		}
		return null;
	}

	@Override
	public boolean deleteContactById(Integer contactId) {
		boolean isDeleted = false;
		try {
			repository.deleteById(contactId);
			isDeleted = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isDeleted;
	}

}
