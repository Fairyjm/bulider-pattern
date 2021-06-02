package com.builder;

public class ThinPersonBuilder {



 
	private Person person = null;
	
	public ThinPersonBuilder() {
		if(person == null){
			person = new Person();
		}
	}
	
	public void createHead() {
		person.setHead("ÎÒ");
	}
 
	public void createBody() {
		person.setBody("ÊÇ");
	}
 
	public void createArms() {
		person.setArms("ÊÝ");
	}
 
	public void createLegs() {
		person.setLegs("×Ó");
	}
 
	public Person buildPerson() {
		return person;
	}
 
}