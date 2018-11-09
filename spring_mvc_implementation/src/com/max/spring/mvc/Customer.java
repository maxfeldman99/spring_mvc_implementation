package com.max.spring.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.max.spring.mvc.validation.CourseCode;

public class Customer {

	private String firstName;
	
	
	@NotNull(message="is required")
	@Size(min=1,message="is required") // must be above the variable
	private String lastName;
	
	@NotNull(message="is required")
	@Min(value=0 ,message = "must be greater than or equal to zero")
	@Max(value=10,message = "must be lower than or euqal to ten")
	private Integer freePasses;
	// i have also added a custom message for typo inside src/rescources/messages.properties and modified servlet-xml
	
	@Pattern(regexp="^[a-zA-Z0-9]{5}", message="only 5 chars/digits")
	private String postalCode;
	
	@CourseCode(value="CRS",message="must start with CRS") // its possible customize the msg from here
	private String courseCode;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getfreePasses() {
		return freePasses;
	}
	public void setfreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}
	
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	
	
	
	
	
	
}


