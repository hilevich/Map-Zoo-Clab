package main;

public class MenuOfProgram {

	private void infoMenu() {
		
		System.out.println("1 - add new Person in zoo club");
		System.out.println("2 - add new pet to person in zoo club ");
		System.out.println("3 - remove pet with person in zoo club");
		System.out.println("4 - remove Person in zoo club");
		System.out.println("5 - remove pet witn all person in zoo club");
		System.out.println("6 - view on display all zoo club");
		System.out.println("7 - exit");
	}
	
	public void switchManu() {
		infoMenu();
		boolean flag = true;
		Zoo z = new Zoo();
		while(flag){
		switch (z.enterLine()) {
		case "1":{
			z.addNewPersonInZoo();
			infoMenu();
			break;

		}
			
		case "2":{
			z.addPetForPerson();
			infoMenu();
			break;

		}
		case "3":{
			z.removePepOfPerson();
			infoMenu();
			break;

		}
		case "4":{
			z.deletePerson();
			infoMenu();
			break;

		}
		case "5":{
			z.removeAllPepsOftype();
			infoMenu();
			break;

		}
		case "6":{
			z.viewZoo();
			infoMenu();
			break;

		}
		case "7":{
			flag =false;
			System.out.println("Exit of Program");
			break;

		}
		}
		}
		
	}
	
	
}
