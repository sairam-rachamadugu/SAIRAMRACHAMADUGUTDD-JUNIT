package junit.tdd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class removngfirst2a {
/*
 	1.“ABCD” => “BCD”
    2.“AACD” => “CD” 
    3.“BACD” => “BCD”
    4.“BBAA” => “BBAA”       
    5.“AABAA” => “BAA”

 */
	@Test
	void test1() {
		Removefirst2 removefirst2=new Removefirst2();
		
		assertEquals("BCD",removefirst2.remove("ABCD"));
		
	}
	@Test
	void test2() {
		Removefirst2 removefirst2=new Removefirst2();
		 
		assertEquals("CD",removefirst2.remove("AACD"));
		
	}
	@Test
	void test3() {
		Removefirst2 removefirst2=new Removefirst2();
		
		assertEquals("BCD",removefirst2.remove("BACD"));
		
	}
	@Test
	void test4() {
		Removefirst2 removefirst2=new Removefirst2();
		
		assertEquals("BBAA",removefirst2.remove("BBAA"));
		
	}
	@Test
	void test5() {
		Removefirst2 removefirst2=new Removefirst2();
		
		assertEquals("BAA",removefirst2.remove("AABAA"));
		
	}

}
