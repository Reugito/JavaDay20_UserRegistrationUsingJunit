package com.bridgelabz.Junit4Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.buisnesslogic.programs.UserValidation;

class ValidationTest {

	@Test
	void firstNameTestValidator() {
		assertEquals(true,  UserValidation.firstNameValidator());
	}
	
	@Test
	void lastNameTestValidator() {
		assertEquals(true,  UserValidation.lastNameValidator());
	}
	
	@Test
	void contactNUmberTestValidator() {
		assertEquals(true,  UserValidation.contactNumber());
	}
	
	@Test
	void EmailTestValidator() {
		assertEquals(true,  UserValidation.EmailValidator());
	}
	
	@Test
	void passwordTestValidator() {
		assertEquals(true,  UserValidation.paswwordValidator());
	}
	
}
