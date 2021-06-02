package com.builder;

public class Test {
	public static void main(String[] args) {
		ThinPersonBuilder thinPersonBuilder = new ThinPersonBuilder();
		BuilderDirector director = new BuilderDirector(thinPersonBuilder);
		Person thinPerson = director.buildPerson();
		System.out.println(thinPerson.toString());
		
		FatPersonBuilder fatPersonBuilder = new FatPersonBuilder();
		BuilderDirector director2 = new BuilderDirector(fatPersonBuilder);
		Person fatPerson = director2.buildPerson();
		System.out.println(fatPerson.toString());
	}
}
