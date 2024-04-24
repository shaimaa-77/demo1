package com.example.service;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import com.example.model.Person;

@Service
public class PersonService {
	ArrayList<Person> persons = new ArrayList<Person>();
	public PersonService() {
		Person p = new Person();
		p.setId("1");
		p.setAge(36);
		p.setFirstName("muhammad");
		p.setLastName("Ali");
		persons.add(p);

		p = new Person();
		p.setId("2");
		p.setAge(25);
		p.setFirstName("Suzane");
		p.setLastName("Smith");
		persons.add(p);
		
		p = new Person();
		p.setId("3");
		p.setAge(25);
		p.setFirstName("Schneider");
		p.setLastName("Elline");
		persons.add(p);
		
		p = new Person();
		p.setId("4");
		p.setAge(25);
		p.setFirstName("Sarah");
		p.setLastName("Navy");
		persons.add(p);

		
		p = new Person();
		p.setId("5");
		p.setAge(36);
		p.setFirstName("Stephanie");
		p.setLastName("Steph");
		persons.add(p);

		
		p = new Person();
		p.setId("6");
		p.setAge(36);
		p.setFirstName("Nelly");
		p.setLastName("Nelly");
		persons.add(p);
		
	}
	public Person getPerson(String id) {
		for(Person person:persons) {
			if(person.getId().equalsIgnoreCase(id)) return person;
		}
	    return null;
	}
	public ArrayList<Person> getAll() {
		return persons;
	}
}

