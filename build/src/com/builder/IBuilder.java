package com.builder;

public interface IBuilder {
	
	 
	 
	/**
	 *	定义了具体实现类的抽象接口
	 *	1.建造不同的人(胖子和瘦子)
	 *	2.建造者模式是类创建型的模式
	 */
	
		
		public abstract void createHead();
		public abstract void createBody();
		public abstract void createArms();
		public abstract void createLegs();
		public abstract Person buildPerson();
	}
