package com.regex;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.regex.Pattern;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class LanguageValidatorConstraint implements ConstraintValidator<LanguageValidator , Object>{

	private List<String> name = LangConstant.name;

	private String description = LangConstant.description;

	public void initialize(LanguageValidator constraintAnnotation) {

	}

	@Override
	public boolean isValid(Object value, ConstraintValidatorContext context) {
		Class c = value.getClass();
		boolean istrueName = false;
		boolean istrueDesc = false;
		for (Method method : c.getDeclaredMethods()) {
			System.out.println(method.getName());
			try {	
				if(method.getName().equals("getName")) {
					for (String oneName : name) {
						if(matchPattern(oneName,(String) method.invoke(value))) {
							istrueName  = true;
						}						
					}
				}
				else if(method.getName().equals("getDescription")) {
					istrueDesc = matchPattern(description,(String) method.invoke(value));
				}
			} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
				e.printStackTrace();
			}
		}
		return istrueName && istrueDesc;
	}

	private boolean matchPattern(String pattern, String value) {
		Pattern p = Pattern.compile(pattern);
		//any part of the string found as regex, return true.
		boolean isMatch = p.matcher(value).find();
		return isMatch;
	}
}
