package com.max.spring.mvc.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD} ) // where can i apply it
@Retention(RetentionPolicy.RUNTIME) //how long the annotation be stored . will work at runtime
public @interface CourseCode {
	
	//define default course code
	public String value() default "CRS";
	
	//define default error message
	public String message() default "must start with CRS";
	
	//define default groups
	public Class<?>[] groups() default {}; // default,no special groups
	
	//define default payloads
	public Class<? extends Payload>[] payload() default {}; // default,no special payload

}
