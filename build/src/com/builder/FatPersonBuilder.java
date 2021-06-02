package com.builder;

public class FatPersonBuilder {
	
	 
	private Person person = null;
		
		public FatPersonBuilder() {
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
			person.setArms("ÅÖ");
		}
	 
		public void createLegs() {
			person.setLegs("×Ó");
		}
	 
		public Person buildPerson() {
			return person;
		}
	 
	}

