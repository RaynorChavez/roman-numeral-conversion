package com.orangeandbronze.roman;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class RomanNumeralTest {
	
	@Test
	void intToRomanNumeral_1() {
		//Given the parameter is 1
		int num = 1;
		new RomanNumeral();
		//When passed into the method
		String actual = RomanNumeral.intToRomanNumeral(num);
		//Then should return "I"
		String expected = "I";
		assertEquals(expected, actual);
	}
	
	@Test
	void intToRomanNumeral_2() {
		new RomanNumeral();
		assertEquals("II", RomanNumeral.intToRomanNumeral(2));
	}
	
	@Test
	void intToRomanNumeral_3() {
		new RomanNumeral();
		assertEquals("III", RomanNumeral.intToRomanNumeral(3));
	}
	
	@Test
	void intToRomanNumeral_4() {
		new RomanNumeral();
		assertEquals("IV", RomanNumeral.intToRomanNumeral(4));
	}
	
	@Test
	void intToRomanNumeral_5() {
		new RomanNumeral();
		assertEquals("IX", RomanNumeral.intToRomanNumeral(9));
	}
	
	@Test
	void intToRomanNumeral_6() {
		new RomanNumeral();
		assertEquals("LXXX", RomanNumeral.intToRomanNumeral(80));
	}
	
	@Test
	void intToRomanNumeral_7() {
		new RomanNumeral();
		assertEquals("CM", RomanNumeral.intToRomanNumeral(900));
	}
	
	@Test
	void intToRomanNumeral_8() {
		new RomanNumeral();
		assertEquals("XXXIX", RomanNumeral.intToRomanNumeral(39));
	}
	
	@Test
	void intToRomanNumeral_9() {
		new RomanNumeral();
		assertEquals("DCCLXXXIX", RomanNumeral.intToRomanNumeral(789));
	}
	
	@Test
	void romanNumeraltoInt_1() {
		new RomanNumeral();
		assertEquals("1", RomanNumeral.romanNumeralToInt("I"));
	}
	
	@Test
	void romanNumeraltoInt_2() {
		new RomanNumeral();
		assertEquals("2", RomanNumeral.romanNumeralToInt("II"));
	}
	
	@Test
	void romanNumeraltoInt_3() {
		new RomanNumeral();
		assertEquals("999", RomanNumeral.romanNumeralToInt("CMXCIX"));
	}
	
	
	
}