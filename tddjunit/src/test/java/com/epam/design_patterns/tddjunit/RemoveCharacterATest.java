package com.epam.design_patterns.tddjunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoveCharacterATest {
	
	/*
	 * TODO List
	 * 1 - "ABCD" -> "BCD" - success
	 * 2 - "AACD" -> "CD" - success
	 * 3 - "BACD" -> "BCD" - success
	 * 4 - "BBAA" -> "BBAA" - success
	 * 5 - "AABAA" -> "BAA" - success
	 * 6 - "AA" -> "" - success
	 * 7 - "A" -> "" - success
	 * 8 - "" -> "" - success
	 */
	
	RemoveCharacterA removeCharacterA;
	
	@BeforeEach
	void init() {
		removeCharacterA = new RemoveCharacterA();
	}
	
	@Test
	void testAtFirstPosition() {
		assertEquals("BCD",removeCharacterA.remove("ABCD"));
	}
	
	@Test
	void testAtBothPosition() {
		assertEquals("CD",removeCharacterA.remove("AACD"));
	}
	
	@Test
	void testAtSecondPosition() {
		assertEquals("BCD",removeCharacterA.remove("BACD"));
	}
	
	@Test
	void testNoOccurance() {
		assertEquals("BBAA",removeCharacterA.remove("BBAA"));
	}
	
	@Test
	void testMoreOccurances() {
		assertEquals("BAA",removeCharacterA.remove("AABAA"));
	}
	
	@Test
	void testLength2String() {
		assertEquals("",removeCharacterA.remove("AA"));
	}
	
	@Test
	void testLength1String() {
		assertEquals("",removeCharacterA.remove("A"));
	}
	
	@Test
	void testEmptyString() {		
		assertEquals("",removeCharacterA.remove(""));
	}
}
