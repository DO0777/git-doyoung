package cch212;

public class Person {

	String name;
	int age;
	
	public Person()
	{
		this("no name", 1);
		
	}
	
	public Person(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
	
	public void showPerson()
	{
		System.out.println(name + "," + age);
		
	}
	
	public Person getPserson() {
		return this;
	}
	
	public static void main(String[] args) {
		
		Person person = new Person();
		person.showPerson();
		
		System.out.println(person);
		
		Person person2 = person.getPserson();
		System.out.println(person2);
		
		
	}
}
