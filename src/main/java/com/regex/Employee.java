package com.regex;

public class Employee {
	
	@LanguageValidator
	private String name;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
