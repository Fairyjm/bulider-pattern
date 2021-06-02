package com.builder;

public class ThinPersonBuilder {



 
	private Person person = null;
	
	public ThinPersonBuilder() {
		if(person == null){
			person = new Person();
		}
	}
	
	public void createHead() {
		person.setHead("��");
	}
 
	public void createBody() {
		person.setBody("��");
	}
 
	public void createArms() {
		person.setArms("��");
	}
 
	public void createLegs() {
		person.setLegs("��");
	}
 
	public Person buildPerson() {
		return person;
	}
 
}