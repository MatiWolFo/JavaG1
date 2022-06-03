package com.generation.F220601.models;

//'extends' + the name of the main class is used to create inheritance
public class PetDog extends Pet {
	private Integer petSize;
	private String petFur;
	private String petSound;
	/**
	 *CONSTRUCTOR 
	 */
	public PetDog() {
		super();
	}
	/**FILLED CONSTRUCTOR
	 * @param petSize
	 * @param petFur
	 * @param petSound
	 */
	public PetDog(Integer petSize, String petFur, String petSound) {
		super();
		this.petSize = petSize;
		this.petFur = petFur;
		this.petSound = petSound;
	}
	//GETTERS N SETTERS
	public Integer getPetSize() {
		return petSize;
	}
	public void setPetSize(Integer petSize) {
		this.petSize = petSize;
	}
	public String getPetFur() {
		return petFur;
	}
	public void setPetFur(String petFur) {
		this.petFur = petFur;
	}
	public String getPetSound() {
		return petSound;
	}
	public void setPetSound(String petSound) {
		this.petSound = petSound;
	}
	//ADD TOSTRING METHOD
	@Override
	public String toString() {
		return "PetDog [petSize=" + petSize + ", petFur=" + petFur + ", petSound=" + petSound + "]";
	}
	//CREATE FUNCTION
	//when using 'override' we use the function used on the superclass
	@Override
	public void makeSound() {
		System.out.println("guau!");
	}

}
