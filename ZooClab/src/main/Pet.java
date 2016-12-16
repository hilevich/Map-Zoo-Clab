package main;

public class Pet {
	
	private String name;
	private String color;
	private String species;
	public Pet(String name, String color, String species) {
		super();
		this.name = name;
		this.color = color;
		this.species = species;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	@Override
	public String toString() {
		return "Pet [name=" + name + ", color=" + color + ", species=" + species + "]";
	}

	
	
}
