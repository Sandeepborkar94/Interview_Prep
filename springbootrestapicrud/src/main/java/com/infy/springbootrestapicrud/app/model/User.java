package com.infy.springbootrestapicrud.app.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
	@NotNull
	@Min(1)
	@Max(100)
	private Integer uid;
	@NotNull(message = "first name is required")
	@Pattern(regexp = "^[a-z A-Z]{4,10}$", message = "first name Should be 4 to 10 , only alphabets allowed ")
	private String firstName;
	@NotNull
	@Size(min = 4, max = 10, message = "Last name characters must be between 4 to 8 words")
	private String lastName;
	@NotNull
	@Email
	private String emailId;
	@NotBlank
	private String mobileNo;
}
