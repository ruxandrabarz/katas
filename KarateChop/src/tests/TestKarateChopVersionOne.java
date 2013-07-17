package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import kata.KarateChopVersionOne;

public class TestKarateChopVersionOne {

	@Test
	public void testChop() {
		KarateChopVersionOne karateChop = new KarateChopVersionOne();
		assertEquals(-1, karateChop.chop(-1, buildArray()));
		assertEquals(0, karateChop.chop(1, buildArray(1)));
		assertEquals(1, karateChop.chop(2, buildArray(1, 2)));
		
		assertEquals(0, karateChop.chop(1, buildArray(1, 3, 5)));
		assertEquals(1, karateChop.chop(3, buildArray(1, 3, 5)));
		assertEquals(2, karateChop.chop(5, buildArray(1, 3, 5)));
		
	}

	private int[] buildArray(int ... values) {
		return values;
	}
}
