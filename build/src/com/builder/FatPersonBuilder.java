package com.builder;

public class FatPersonBuilder {
	
	 
	private Person person = null;
		
		public FatPersonBuilder() {
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

