package com.regex;

import static java.lang.annotation.ElementType.FIELD;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy =  LanguageValidatorConstraint.class )
@Retention(RetentionPolicy.RUNTIME)
@Target({ FIELD})
public @interface LanguageValidator {
	
	public String value() default "";
	
	public String message() default "Failed...";
	
	Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
	
}
