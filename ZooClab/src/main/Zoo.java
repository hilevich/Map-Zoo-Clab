package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;




public class Zoo {

	public static ArrayList<Person> zooOfPerson = new ArrayList<>();
	
	public void addZoo() {
		
		Map<String, Pet> zoo1 = new HashMap<>();
		zoo1.put("kat", new Pet("vaska", "black", "male"));
		zoo1.put("dog", new Pet("Rich", "grey", "male"));
		zooOfPerson.add(new Person("Ivan", "Ivanovich", 21, zoo1));
		
		Map<String, Pet> zoo2 = new HashMap<>();
		zoo2.put("kat", new Pet("maska", "white", "female"));
		zoo2.put("dog", new Pet("Rich", "grey", "male"));
		zooOfPerson.add(new Person("Vaska", "Vasilovich", 23, zoo2));
		
		Map<String, Pet> zoo3 = new HashMap<>();
		zoo3.put("kat", new Pet("Kis", "black", "female"));
		zoo3.put("dog", new Pet("Ardry", "grey", "female"));
		zooOfPerson.add(new Person("Andriy", "Petrovich", 25, zoo3));
		
		Map<String, Pet> zoo4 = new HashMap<>();
		zoo4.put("kat", new Pet("vaska", "black", "male"));
		zoo4.put("dog", new Pet("Rich", "grey", "female"));
		zooOfPerson.add(new Person("kapya", "Korol", 21, zoo4));
		
	}
	@SuppressWarnings("resource")
	public String enterLine() {
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}
	
	public void deletePerson() {
		System.out.println("Enter Surname");
		String surName = enterLine();
		System.out.println("Enter Name");
		String name = enterLine();
		Person deletePerson = null;
		for (Person person : zooOfPerson) {
			if(person.getName().equalsIgnoreCase(name)&&person.getSurName().equalsIgnoreCase(surName)){
				deletePerson = person;
			}
		}
		if(deletePerson!=null){
		zooOfPerson.remove(deletePerson);
		System.out.println("Person of zoo is remove");
		}
		else{
		System.out.println("Person not found");	
		}
	}
	
	
	public void addNewPersonInZoo() {
		boolean isPerson = false;
		Map<String, Pet> zoo = new HashMap<>();
		System.out.println("Enter Surname Person");
		String surnameOfPerson = enterLine();
		System.out.println("Enter Name Person");
		String nameOfPerson = enterLine();
		System.out.println("Enter age Person");
		int ageOfPerson = 0;
		
		try {
			ageOfPerson = Integer.valueOf(enterLine());
	          
	    }catch (NumberFormatException e) {  
	        System.err.println("Неверный формат строки!");  
	    } 
		
		for (Person person : zooOfPerson) {
			if(person.getName().equalsIgnoreCase(nameOfPerson)&&person.getSurName().equalsIgnoreCase(surnameOfPerson)){
				isPerson = true;
			}
		}
		
		if(!isPerson){
			System.out.println("If person has pets enter - Y");
			
			while(enterLine().equalsIgnoreCase("y")){
				System.out.println("enter who is this?");
				String key = enterLine();
				System.out.println("Enter name Pet");
				String nameOfPet = enterLine();
				System.out.println("Enter color Pet");
				String colorOfPet = enterLine();
				System.out.println("Enter  Pet sex");
				String sexOfPet = enterLine();
				zoo.put(key, new Pet(nameOfPet, colorOfPet, sexOfPet));
				System.out.println("Pets is create");
				System.out.println();
				System.out.println("If person has pets enter - Y");
			}
			zooOfPerson.add(new Person(nameOfPerson, surnameOfPerson, ageOfPerson, zoo));
			
		}else{
			
			System.out.println("This Person is present into zoo");
		}
		
		
	}
	
	public void viewZoo() {
		
		for (Person person : zooOfPerson) {
			System.out.println(person);
		}
		
	}
	
	public void removeAllPepsOftype(){
	
		System.out.println("Enter kind of animal ");
		String kindOfAnimal = enterLine();
		System.out.println("Enter name Pet");
		String nameOfPet = enterLine();
		System.out.println("Enter color Pet");
		String colorOfPet = enterLine();
		System.out.println("Enter  Pet sex");
		String sexOfPet = enterLine();
	
		for (Person person : zooOfPerson) {
	
		for(Iterator<Map.Entry<String, Pet>> it = person.getPets().entrySet().iterator(); it.hasNext(); ) {
			Map.Entry<String,Pet> entry = it.next();
			if(entry.getKey().equalsIgnoreCase(kindOfAnimal)&&entry.getValue().getName().equalsIgnoreCase(nameOfPet)&&entry.getValue().getColor().equalsIgnoreCase(colorOfPet)&&entry.getValue().getSpecies().equalsIgnoreCase(sexOfPet)) {
				it.remove();
			}
		}
		}
		
	}
	
	
	public void removePepOfPerson(){
		
		System.out.println("Enter Surname Person");
		String surnameOfPerson = enterLine();
		System.out.println("Enter Name Person");
		String nameOfPerson = enterLine();
		
		
		System.out.println("Enter kind of animal ");
		String kindOfAnimal = enterLine();
		System.out.println("Enter name Pet");
		String nameOfPet = enterLine();
		System.out.println("Enter color Pet");
		String colorOfPet = enterLine();
		System.out.println("Enter  Pet sex");
		String sexOfPet = enterLine();
	
		for (Person person : zooOfPerson) {
			if(person.getName().equalsIgnoreCase(nameOfPerson)&&person.getSurName().equalsIgnoreCase(surnameOfPerson)){
				
	
		for(Iterator<Map.Entry<String, Pet>> it = person.getPets().entrySet().iterator(); it.hasNext(); ) {
			Map.Entry<String,Pet> entry = it.next();
			if(entry.getKey().equalsIgnoreCase(kindOfAnimal)&&entry.getValue().getName().equalsIgnoreCase(nameOfPet)&&entry.getValue().getColor().equalsIgnoreCase(colorOfPet)&&entry.getValue().getSpecies().equalsIgnoreCase(sexOfPet)) {
				it.remove();
			}
		}
		}
		}
	}
	
	
	public void addPetForPerson() {
		boolean isPerson =false;
		System.out.println("Enter Surname Person");
		String surnameOfPerson = enterLine();
		System.out.println("Enter Name Person");
		String nameOfPerson = enterLine();
		
		
		
		
		
		
		
		for (Person person : zooOfPerson) {
			if(person.getName().equalsIgnoreCase(nameOfPerson)&&person.getSurName().equalsIgnoreCase(surnameOfPerson)){
				isPerson =true;
				System.out.println("Enter kind of animal ");
				String kindOfAnimal = enterLine();
				System.out.println("Enter name Pet");
				String nameOfPet = enterLine();
				System.out.println("Enter color Pet");
				String colorOfPet = enterLine();
				System.out.println("Enter  Pet sex");
				String sexOfPet = enterLine();
				person.getPets().put(kindOfAnimal, new Pet(nameOfPet, colorOfPet, sexOfPet));
				System.out.println("new Pet add");
				
			}
		}
		
		if( !isPerson){
			System.out.println("Person not find");
		}
		
		
	}
	
	
}
