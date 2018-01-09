package kr.oraclejava.spring.sample;

public class Person implements IPerson {
	
	private String name;
	private int age;

	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	public void setAge(int age) {
		// TODO Auto-generated method stub
		this.age = age;

	}

	public int getAge() {
		// TODO Auto-generated method stub
		return this.age;
	}

}
