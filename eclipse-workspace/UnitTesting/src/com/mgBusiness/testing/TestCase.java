package com.mgBusiness.testing;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.mgBusiness.Calculation;

public class TestCase {

	@Test
	public void testing() {
		Calculation t = new Calculation();
		assertEquals(8, t.findMax(new int[] {1,2,3,4,5,6,8}));
		assertEquals(-1,t.findMax(new int[]{-12,-1,-3,-4,-2}));  

	}

}
