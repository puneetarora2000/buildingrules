package com.test;

import com.rules.ProcessRule;
import static org.junit.Assert.assertEquals;

import java.util.Iterator;

import org.junit.Test;


public class TestBooleans {

	@Test
	public void testAndTokenizer() {
		ProcessRule e = new ProcessRule("1&&0");
		Iterator<String> i = e.getExpressionTokenizer();
		
		assertEquals("1", i.next());
		assertEquals("&&", i.next());
		assertEquals("0", i.next());
	}

	@Test
	public void testAndRPN() {
		assertEquals("1 0 &&", new ProcessRule("1&&0").toRPN());
	}
	
	@Test
	public void testAndEval() {
		assertEquals("0", new ProcessRule("1&&0").eval().toString());
		assertEquals("1", new ProcessRule("1&&1").eval().toString());
		assertEquals("0", new ProcessRule("0&&0").eval().toString());
		assertEquals("0", new ProcessRule("0&&1").eval().toString());
	}
	
	@Test
	public void testOrEval() {
		assertEquals("1", new ProcessRule("1||0").eval().toString());
		assertEquals("1", new ProcessRule("1||1").eval().toString());
		assertEquals("0", new ProcessRule("0||0").eval().toString());
		assertEquals("1", new ProcessRule("0||1").eval().toString());
	}
	
	@Test
	public void testCompare() {
		assertEquals("1", new ProcessRule("2>1").eval().toString());
		assertEquals("0", new ProcessRule("2<1").eval().toString());
		assertEquals("0", new ProcessRule("1>2").eval().toString());
		assertEquals("1", new ProcessRule("1<2").eval().toString());
		assertEquals("0", new ProcessRule("1=2").eval().toString());
		assertEquals("1", new ProcessRule("1=1").eval().toString());
		assertEquals("1", new ProcessRule("1>=1").eval().toString());
		assertEquals("1", new ProcessRule("1.1>=1").eval().toString());
		assertEquals("0", new ProcessRule("1>=2").eval().toString());
		assertEquals("1", new ProcessRule("1<=1").eval().toString());
		assertEquals("0", new ProcessRule("1.1<=1").eval().toString());
		assertEquals("1", new ProcessRule("1<=2").eval().toString());
		assertEquals("0", new ProcessRule("1=2").eval().toString());
		assertEquals("1", new ProcessRule("1=1").eval().toString());
		assertEquals("1", new ProcessRule("1!=2").eval().toString());
		assertEquals("0", new ProcessRule("1!=1").eval().toString());
	}
	
	@Test
	public void testCompareCombined() {
		assertEquals("1", new ProcessRule("(2>1)||(1=0)").eval().toString());
		assertEquals("0", new ProcessRule("(2>3)||(1=0)").eval().toString());
		assertEquals("1", new ProcessRule("(2>3)||(1=0)||(1&&1)").eval().toString());
	}
	
	@Test
	public void testMixed() {
		assertEquals("0", new ProcessRule("1.5 * 7 = 3").eval().toString());
		assertEquals("1", new ProcessRule("1.5 * 7 = 10.5").eval().toString());
	}
	
	@Test
	public void testNot() {
		assertEquals("0", new ProcessRule("not(1)").eval().toString());
		assertEquals("1", new ProcessRule("not(0)").eval().toString());
		assertEquals("1", new ProcessRule("not(1.5 * 7 = 3)").eval().toString());
		assertEquals("0", new ProcessRule("not(1.5 * 7 = 10.5)").eval().toString());
	}

	@Test
	public void testConstants() {
		assertEquals("1", new ProcessRule("TRUE!=FALSE").eval().toString());
		assertEquals("0", new ProcessRule("TRUE==2").eval().toString());
		assertEquals("1", new ProcessRule("NOT(TRUE)==FALSE").eval().toString());
		assertEquals("1", new ProcessRule("NOT(FALSE)==TRUE").eval().toString());
		assertEquals("0", new ProcessRule("TRUE && FALSE").eval().toString());
		assertEquals("1", new ProcessRule("TRUE || FALSE").eval().toString());
	}

	@Test
	public void testIf() {
		assertEquals("5", new ProcessRule("if(TRUE, 5, 3)").eval().toString());
		assertEquals("3", new ProcessRule("IF(FALSE, 5, 3)").eval().toString());
		assertEquals("5.35", new ProcessRule("If(2, 5.35, 3)").eval().toString());
	}
}
