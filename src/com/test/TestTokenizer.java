package com.test;

import com.rules.ProcessRule;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import java.util.Iterator;

import org.junit.Test;


public class TestTokenizer {
	
	@Test
	public void testNumbers() {
		ProcessRule e;
		Iterator<String> i;
		
		e = new ProcessRule("1");
		i = e.getExpressionTokenizer();
		assertEquals("1", i.next());
		assertFalse(i.hasNext());
		assertNull(i.next());
		
		e = new ProcessRule("-1");
		i = e.getExpressionTokenizer();
		assertEquals("-1", i.next());
		assertFalse(i.hasNext());
		assertNull(i.next());
		
		e = new ProcessRule("123");
		i = e.getExpressionTokenizer();
		assertEquals("123", i.next());
		assertFalse(i.hasNext());
		assertNull(i.next());
		
		e = new ProcessRule("-123");
		i = e.getExpressionTokenizer();
		assertEquals("-123", i.next());
		assertFalse(i.hasNext());
		assertNull(i.next());
		
		e = new ProcessRule("123.4");
		i = e.getExpressionTokenizer();
		assertEquals("123.4", i.next());
		assertFalse(i.hasNext());
		assertNull(i.next());
		
		e = new ProcessRule("-123.456");
		i = e.getExpressionTokenizer();
		assertEquals("-123.456", i.next());
		assertFalse(i.hasNext());
		assertNull(i.next());
	}

    @Test
    public void testTokenizerExtraSpaces() {
        ProcessRule e = new ProcessRule("1 ");
        Iterator<String> i = e.getExpressionTokenizer();
        assertTrue(i.hasNext());
        assertEquals("1", i.next());
        assertFalse(i.hasNext());
        assertNull(i.next());

        e = new ProcessRule("       ");
        i = e.getExpressionTokenizer();
        assertFalse(i.hasNext());
        assertNull(i.next());

        e = new ProcessRule("   1      ");
        i = e.getExpressionTokenizer();
        assertTrue(i.hasNext());
        assertEquals("1", i.next());
        assertFalse(i.hasNext());
        assertNull(i.next());

        e = new ProcessRule("  1   +   2    ");
        i = e.getExpressionTokenizer();
        assertEquals("1", i.next());
        assertEquals("+", i.next());
        assertTrue(i.hasNext());
        assertEquals("2", i.next());
        assertFalse(i.hasNext());
        assertNull(i.next());
    }

    @Test
	public void testTokenizer1() {
		ProcessRule e = new ProcessRule("1+2");
		Iterator<String> i = e.getExpressionTokenizer();
		
		assertEquals("1", i.next());
		assertEquals("+", i.next());
		assertEquals("2", i.next());
	}

	@Test
	public void testTokenizer2() {
		ProcessRule e = new ProcessRule("1 + 2");
		Iterator<String> i = e.getExpressionTokenizer();
		
		assertEquals("1", i.next());
		assertEquals("+", i.next());
		assertEquals("2", i.next());
	}
	
	@Test
	public void testTokenizer3() {
		ProcessRule e = new ProcessRule(" 1 + 2 ");
		Iterator<String> i = e.getExpressionTokenizer();
		
		assertEquals("1", i.next());
		assertEquals("+", i.next());
		assertEquals("2", i.next());
	}
	
	@Test
	public void testTokenizer4() {
		ProcessRule e = new ProcessRule("1+2-3/4*5");
		Iterator<String> i = e.getExpressionTokenizer();
		
		assertEquals("1", i.next());
		assertEquals("+", i.next());
		assertEquals("2", i.next());
		assertEquals("-", i.next());
		assertEquals("3", i.next());
		assertEquals("/", i.next());
		assertEquals("4", i.next());
		assertEquals("*", i.next());
		assertEquals("5", i.next());
	}
		
	@Test
	public void testTokenizer5() {
		ProcessRule e = new ProcessRule("1+2.1-3.45/4.982*5.0");
		Iterator<String> i = e.getExpressionTokenizer();
		
		assertEquals("1", i.next());
		assertEquals("+", i.next());
		assertEquals("2.1", i.next());
		assertEquals("-", i.next());
		assertEquals("3.45", i.next());
		assertEquals("/", i.next());
		assertEquals("4.982", i.next());
		assertEquals("*", i.next());
		assertEquals("5.0", i.next());
	}
	
	@Test
	public void testTokenizer6() {
		ProcessRule e = new ProcessRule("-3+4*-1");
		Iterator<String> i = e.getExpressionTokenizer();
		
		assertEquals("-3", i.next());
		assertEquals("+", i.next());
		assertEquals("4", i.next());
		assertEquals("*", i.next());
		assertEquals("-1", i.next());
	}
	
	@Test
	public void testTokenizer7() {
		ProcessRule e = new ProcessRule("(-3+4)*-1/(7-(5*-8))");
		Iterator<String> i = e.getExpressionTokenizer();
		
		assertEquals("(", i.next());
		assertEquals("-3", i.next());
		assertEquals("+", i.next());
		assertEquals("4", i.next());
		assertEquals(")", i.next());
		assertEquals("*", i.next());
		assertEquals("-1", i.next());
		assertEquals("/", i.next());
		assertEquals("(", i.next());
		assertEquals("7", i.next());
		assertEquals("-", i.next());
		assertEquals("(", i.next());
		assertEquals("5", i.next());
		assertEquals("*", i.next());
		assertEquals("-8", i.next());
		assertEquals(")", i.next());
		assertEquals(")", i.next());
	}
	
	public void testTokenizer8() {
		ProcessRule e = new ProcessRule("(1.9+2.8)/4.7");
		Iterator<String> i = e.getExpressionTokenizer();
		
		assertEquals("(", i.next());
		assertEquals("1.9", i.next());
		assertEquals("+", i.next());
		assertEquals("2.8", i.next());
		assertEquals(")", i.next());
		assertEquals("/", i.next());
		assertEquals("4.7", i.next());		
	}
	
	@Test
	public void testTokenizerFunction1() {
		ProcessRule e = new ProcessRule("ABS(3.5)");
		Iterator<String> i = e.getExpressionTokenizer();
		
		assertEquals("ABS", i.next());
		assertEquals("(", i.next());
		assertEquals("3.5", i.next());
		assertEquals(")", i.next());
	}
	
	@Test
	public void testTokenizerFunction2() {
		ProcessRule e = new ProcessRule("3-ABS(3.5)/9");
		Iterator<String> i = e.getExpressionTokenizer();
		
		assertEquals("3", i.next());
		assertEquals("-", i.next());
		assertEquals("ABS", i.next());
		assertEquals("(", i.next());
		assertEquals("3.5", i.next());
		assertEquals(")", i.next());
		assertEquals("/", i.next());
		assertEquals("9", i.next());
	}
	@Test
	
	public void testTokenizerFunction3() {
		ProcessRule e = new ProcessRule("MAX(3.5,5.2)");
		Iterator<String> i = e.getExpressionTokenizer();
		
		assertEquals("MAX", i.next());
		assertEquals("(", i.next());
		assertEquals("3.5", i.next());
		assertEquals(",", i.next());
		assertEquals("5.2", i.next());
		assertEquals(")", i.next());
	}
	
	@Test
	public void testTokenizerFunction4() {
		ProcessRule e = new ProcessRule("3-MAX(3.5,5.2)/9");
		Iterator<String> i = e.getExpressionTokenizer();
		
		assertEquals("3", i.next());
		assertEquals("-", i.next());
		assertEquals("MAX", i.next());
		assertEquals("(", i.next());
		assertEquals("3.5", i.next());
		assertEquals(",", i.next());
		assertEquals("5.2", i.next());
		assertEquals(")", i.next());
		assertEquals("/", i.next());
		assertEquals("9", i.next());
	}
	
	@Test
	public void testTokenizerFunction5() {
		ProcessRule e = new ProcessRule("3/MAX(-3.5,-5.2)/9");
		Iterator<String> i = e.getExpressionTokenizer();
		
		assertEquals("3", i.next());
		assertEquals("/", i.next());
		assertEquals("MAX", i.next());
		assertEquals("(", i.next());
		assertEquals("-3.5", i.next());
		assertEquals(",", i.next());
		assertEquals("-5.2", i.next());
		assertEquals(")", i.next());
		assertEquals("/", i.next());
		assertEquals("9", i.next());
	}
}
