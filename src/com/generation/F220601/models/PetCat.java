package com.generation.F220601.models;

//'extends' + the name of the main class is used to create inheritance
public class PetCat extends Pet{
	private Boolean petRetractClaws;
	private Boolean petNightVision;
	private String petSound;
	/**
	 CONSTRUCTOR* 
	 */
	public PetCat() {
		super();
	}
	/**FILLED CONSTRUCTOR
	 * @param petRetractClaws
	 * @param petNightVision
	 * @param petSound
	 */
	public PetCat(Boolean petRetractClaws, Boolean petNightVision, String petSound) {
		super();
		this.petRetractClaws = petRetractClaws;
		this.petNightVision = petNightVision;
		this.petSound = petSound;
	}
	//GETTERS N SETTERS
	public Boolean getPetRetractClaws() {
		return petRetractClaws;
	}
	public void setPetRetractClaws(Boolean petRetractClaws) {
		this.petRetractClaws = petRetractClaws;
	}
	public Boolean getPetNightVision() {
		return petNightVision;
	}
	public void setPetNightVision(Boolean petNightVision) {
		this.petNightVision = petNightVision;
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
		return "PetCat [petRetractClaws=" + petRetractClaws + ", petNightVision=" + petNightVision + ", petSound="
				+ petSound + "]";
	}
	//CREATE FUNCTION
	@Override
	public void makeSound() {
		System.out.println("miau!");
	}
}
