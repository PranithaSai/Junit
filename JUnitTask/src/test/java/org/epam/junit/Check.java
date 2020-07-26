/**
 * 
 */
package org.epam.junit;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * @author home1
 *
 */
public class Check {
	Junit c=new Junit();

	@Test
	public void testAccept() {
	assertEquals("ZCD",c.accept("AZCD"));	
	}


	@Test
	public void test() {
	assertEquals("CDA",c.accept("AACDA"));	
	}
    

	@Test
	public void test1() {
	assertEquals("",c.accept(""));	
	}
	@Test
	public void test2() {
	assertEquals("BAA",c.accept("AABAA"));	
	}

	@Test
	public void test3() {
	assertEquals("BCD",c.accept("BACD"));	
	}

	@Test
	public void test4() {
	assertEquals("BBAA",c.accept("BBAA"));	
	}
	
	@Test
	public void test5() {
	assertEquals("",c.accept("AA"));	
	}

}
