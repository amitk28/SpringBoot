package com.regex;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy =  LanguageValidatorConstraint.class )
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.ANNOTATION_TYPE})
public @interface LanguageValidator {
	
	public String value() default "";
	
	public String message() default "Failed...";
	
	Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
	
}
