package main;



import java.util.HashMap;
import java.util.Map;

public class Person {

	private String name;
	private String surName;
	private int age;
	private Map<String, Pet> pets = new HashMap<>();
	public Person(String name, String surName, int age, Map<String, Pet> pets) {
		super();
		this.name = name;
		this.surName = surName;
		this.age = age;
		this.pets = pets;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Map<String, Pet> getPets() {
		return pets;
	}
	public void setPets(Map<String, Pet> pets) {
		this.pets = pets;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", surName=" + surName + ", age=" + age + ", pets=" + pets + "]";
	} 
	
	
	
	
	
}
