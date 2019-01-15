package com.regex;

import java.util.List;
import java.util.regex.Pattern;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class LanguageValidatorConstraint implements ConstraintValidator<LanguageValidator , String>{

	private List<String> regexList = LangConstant.langList;
		
	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		System.out.println("Value "+value+" "+LangConstant.langList);
		for (String pattern : regexList) {
			Pattern p = Pattern.compile(pattern);
			boolean isMatch = p.matcher(value).matches();
			System.out.println(isMatch);
			return isMatch;
		}
		return false;
	}

	

}
