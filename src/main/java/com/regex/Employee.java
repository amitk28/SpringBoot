package com.regex;

@LanguageValidator
public class Employee {
	
	private String name;
	private String description;
	private String employeeId;

	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	//@LanguageValidator
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	//@LanguageValidator
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
