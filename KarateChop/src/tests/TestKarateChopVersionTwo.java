package tests;

import static org.junit.Assert.*;
import kata.KarateChopVersionTwo;

import org.junit.Test;

public class TestKarateChopVersionTwo {

	@Test
	public void testChop()
	{
		KarateChopVersionTwo karateChop = new KarateChopVersionTwo();
		assertEquals(-1, karateChop.chop(0, buildArray()));
		assertEquals(-1, karateChop.chop(1, buildArray(0)));
		assertEquals(0, karateChop.chop(1, buildArray(1,2)));
		
		assertEquals(0, karateChop.chop(1, buildArray(1,2,4,6,8,9,11,13,15)));
		assertEquals(3, karateChop.chop(6, buildArray(1,2,4,6,8,9,11,13,15)));
		assertEquals(4, karateChop.chop(8, buildArray(1,2,4,6,8,9,11,13,15)));
		assertEquals(6, karateChop.chop(11, buildArray(1,2,4,6,8,9,11,13,15)));
		assertEquals(8, karateChop.chop(15, buildArray(1,2,4,6,8,9,11,13,15)));
		
	}
	
	private int[] buildArray(int ... values) {
		return values;
	}
}
