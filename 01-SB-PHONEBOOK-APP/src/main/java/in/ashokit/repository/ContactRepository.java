package in.ashokit.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ashokit.entity.Contact;

//@Repository                   // it is optional
public interface ContactRepository extends JpaRepository<Contact, Serializable> {

}
