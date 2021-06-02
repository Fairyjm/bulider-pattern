package com.builder;

public interface IBuilder {
	
	 
	 
	/**
	 *	�����˾���ʵ����ĳ���ӿ�
	 *	1.���첻ͬ����(���Ӻ�����)
	 *	2.������ģʽ���ഴ���͵�ģʽ
	 */
	
		
		public abstract void createHead();
		public abstract void createBody();
		public abstract void createArms();
		public abstract void createLegs();
		public abstract Person buildPerson();
	}
