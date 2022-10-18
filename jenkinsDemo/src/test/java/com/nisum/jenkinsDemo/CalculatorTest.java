package com.nisum.jenkinsDemo;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest 
{
	Calculator c;
   @BeforeClass
   public void setUp() throws Exception
   {
	   c=new Calculator();
   }
   @After
   public void tearDown() throws Exception
   {
	   c=null;
   }
   @Test
   public void testSum()
   {
	   assertEquals(100,c.sum(10,20,30,40));
   }
   @Test
   public void testSquare()
   {
	   assertEquals(215,c.square(15));
   }
   @Test
   public void testPower()
   {
	   assertEquals(100,c.power(4,3));
   }
}
