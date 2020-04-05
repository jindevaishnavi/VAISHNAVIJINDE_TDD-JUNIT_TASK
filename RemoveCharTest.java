package ToolsQA.TDD_TASK;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoveCharTest {
	/*
	 * TO - DO LIST
	 * 1. Empty String "" => "" --- success
	 * 2. String with 1 A : ABCD => "BCD" --- success
	 * 3. String with 2 A in beginning : AACD => "CD" --- success
	   4. String with 1 A in second position : BACD => BCD --- success
	   5. String with 2 A in the end : BBAA =>BBAA --- success
	   6. String with n chars containing AA  in first two position: AABAA => BAA --- success
	   7. String with n char with 1 A not in first position : BCADS => BCADS --- success
	
	 * */
	RemoveChars removechar;
	@BeforeEach
	void setUp()
	{
		removechar	 = new RemoveChars();
	}
	
	@Test
	void testEmptyString()
	{
		assertEquals(removechar.remove(""),"");
	}
	
	@Test
	void test1CharA()
	{
		assertEquals(removechar.remove("ABCD"),"BCD");
	}
	
	@Test
	void test2CharAA()
	{
		
		assertEquals( removechar.remove("AACD"),"CD");
	}
	@Test
	void test1CharNotA()
	{

		assertEquals(removechar.remove("B"),"B");
	}
	
	@Test
	void test2CharsNotA()
	{
		assertEquals(removechar.remove("BC"),"BC");
	}
	
	@Test
	void testNCharsA()
	{

		assertEquals(removechar.remove("BACD"),"BCD");
	}
	
	@Test
	void testNCharsAA()
	{
		assertEquals( removechar.remove("AABAA"),"BAA");
	}
	
	@Test
	void testNCharsAAEnd()
	{	
		assertEquals(removechar.remove("BBAA"),"BBAA");
	}
	
	@Test
	void testNCharsAEnd()
	{

		assertEquals(removechar.remove("BCADS"),"BCADS");
	}


}
