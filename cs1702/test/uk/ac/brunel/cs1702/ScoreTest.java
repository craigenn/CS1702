package uk.ac.brunel.cs1702;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ScoreTest {
	private Score Score1;
	@BeforeEach
	public void setup() {
		Score1 = new Score();
	}

	@Test
	public void initialPointsShouldBeZero() {
		assertEquals(0,Score1.getPoints());
	}

	@Test
	public void canIncrementPoints() {
		Score1.addPoint();
		assertEquals(1,Score1.getPoints());

	}

	@Test
	public void canTranslateScoresToNaturalLanguage() {
		Score1.addPoint();
		assertEquals("Fifteen",Score1.toString());

	}

}
