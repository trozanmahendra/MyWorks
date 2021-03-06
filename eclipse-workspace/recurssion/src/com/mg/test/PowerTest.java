package com.mg.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.mg.PowerOfANumber;

public class PowerTest {
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before class method");
	}

	@Before
	public void before() {
		System.out.println("before");
	}

	@Test
	public void tester1() {
		System.out.println("finding power");
		assertEquals(36.23, PowerOfANumber.power(6, 2), 0.5);
		assertNotEquals(3.23, PowerOfANumber.power(6, 2), 0.5);

	}

	@Test
	public void tester2() {
		System.out.println("finding power");
		assertEquals(36.23, PowerOfANumber.power(6, 2), 0.5);
		assertNotEquals(3.23, PowerOfANumber.power(6, 2), 0.5);

	}

	@After
	public  void after() {
		System.out.println("After");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("After class method");
	}

}
