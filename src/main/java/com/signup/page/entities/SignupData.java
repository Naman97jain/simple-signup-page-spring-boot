package com.signup.page.entities;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class SignupData {
	
	@NotBlank(message = "User name can not be blank")
	@Size(min = 2, max = 10, message = "Username must be between 2-10 characters.")
	private String userName;
	
	@Email(regexp = ".+@.+\\..+")
	private String email;
	
	@AssertTrue(message="Agreeing Terms and Condition is required.")
	private boolean agreed;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String name) {
		this.userName = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isAgreed() {
		return agreed;
	}

	public void setAgreed(boolean agreed) {
		this.agreed = agreed;
	}

	@Override
	public String toString() {
		return "SignupData [name=" + userName + ", email=" + email + ", agreed=" + agreed + "]";
	}

}
