package com.generation.F220601.models;

public class Pet {
		//attributes
		private String petColour;
		private String petBreed;
		private String petName;
		private String petSex;
		private Float petWeight;		
		//Getters n Setters
		public String getPetColour() {
			return petColour;
		}
		public void setPetColour(String petColour) {
			this.petColour = petColour;
		}
		public String getPetBreed() {
			return petBreed;
		}
		public void setPetBreed(String petBreed) {
			this.petBreed = petBreed;
		}
		public String getPetName() {
			return petName;
		}
		public void setPetName(String petName) {
			this.petName = petName;
		}
		public String getPetSex() {
			return petSex;
		}
		public void setPetSex(String petSex) {
			this.petSex = petSex;
		}
		public Float getPetWeight() {
			return petWeight;
		}
		public void setPetWeight(Float petWeight) {
			this.petWeight = petWeight;
		}
		//Constructors	
		/**
		 * 
		 */
		public Pet() {
			super();
		}
		/**
		 * @param petColour
		 * @param petBreed
		 * @param petName
		 * @param petSex
		 * @param petWeight
		 */
		public Pet(String petColour, String petBreed, String petName, String petSex, Float petWeight) {
			super();
			this.petColour = petColour;
			this.petBreed = petBreed;
			this.petName = petName;
			this.petSex = petSex;
			this.petWeight = petWeight;
		}
		//ADD TOSTRING METHOD
		@Override
		public String toString() {
			return "Pet [petColour=" + petColour + ", petBreed=" + petBreed + ", petName=" + petName + ", petSex="
					+ petSex + ", petWeight=" + petWeight + "]";
		}
		//CREATE FUNCTION
		public void makeSound() {
			System.out.println("BANG!");
		}
}
