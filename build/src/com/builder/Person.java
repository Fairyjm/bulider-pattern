package com.builder;

public class Person {
	
	 
	
	 
		public String head;
		public String body;
		public String arms;
		public String legs;
		public String getHead() {
			return head;
		}
		public void setHead(String head) {
			this.head = head;
		}
		public String getBody() {
			return body;
		}
		public void setBody(String body) {
			this.body = body;
		}
		public String getArms() {
			return arms;
		}
		public void setArms(String arms) {
			this.arms = arms;
		}
		public String getLegs() {
			return legs;
		}
		public void setLegs(String legs) {
			this.legs = legs;
		}
		
		@Override
		public String toString() {
			return this.getHead()+this.getBody()+this.getArms()+this.getLegs();
		}
		
	}

