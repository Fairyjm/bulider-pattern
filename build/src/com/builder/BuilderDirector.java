package com.builder;
 

 
public class BuilderDirector {
 
	private IBuilder ibuilder = null;
	
	public BuilderDirector(IBuilder ib){
		if(ibuilder == null){
			ibuilder = ib;
		}
	}
	
	public Person buildPerson(){
		ibuilder.createHead();
		ibuilder.createBody();
		ibuilder.createArms();
		ibuilder.createLegs();
		return ibuilder.buildPerson();
	}
	
}