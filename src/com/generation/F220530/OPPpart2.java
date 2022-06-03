package com.generation.F220530;

public class OPPpart2 {
	//FEATURES OR PARAMETERS
	//good practise, always create objects
	private String studentName;
	private String studentSurname;
	private Integer studentAge;
	private String studentClass;
	//CONSTRUCTORS
	//Remember to construct empty a fields ones
	//the empty one is used to add values to a new class afterwards if needed, crossed using
	/**
	 * 
	 */
	public OPPpart2() {
		super();
	}
	/**
	 * @param studentName
	 * @param studentSurname
	 * @param studentAge
	 * @param studentClass
	 */
	public OPPpart2(String studentName, String studentSurname, Integer studentAge, String studentClass) {
		super();
		this.studentName = studentName;
		this.studentSurname = studentSurname;
		this.studentAge = studentAge;
		this.studentClass = studentClass;
	}
	//GETTER AND SETTERS
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentSurname() {
		return studentSurname;
	}
	public void setStudentSurname(String studentSurname) {
		this.studentSurname = studentSurname;
	}
	public Integer getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(Integer studentAge) {
		this.studentAge = studentAge;
	}
	public String getStudentClass() {
		return studentClass;
	}
	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}
	//right click > source > generate toString, to create the basic structure which prints the current values instances
	//the content within the list strings may be modified as pleased
	@Override
	public String toString() {
		return "[Name = " + studentName + ", Surname = " + studentSurname + ", Age = "
				+ studentAge + ", Class = " + studentClass + "]";
	}
	
}
