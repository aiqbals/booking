package hotel;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReservationsTest {
	private Reservations lstTest = new Reservations();

	// case 1
	@Test
	void testReserve1() {
		int[][] roomForDays = new int[1][365];
		String result = lstTest.reserve(-4, 2, roomForDays, 1);
		assertEquals(result, "Decline");
	}

	@Test
	void testReserve2() {
		int[][] roomForDays = new int[1][365];
		String result = lstTest.reserve(200, 400, roomForDays, 1);
		assertEquals(result, "Decline");
	}

	// case 2
	@Test
	void testReserve3() {
		int[][] roomForDays = new int[3][365];
		String result = lstTest.reserve(0, 5, roomForDays, 3);
		assertEquals(result, "Accept");
	}

	@Test
	void testReserve4() {
		int[][] roomForDays = new int[3][365];
		String result = lstTest.reserve(7, 13, roomForDays, 3);
		assertEquals(result, "Accept");
	}

	@Test
	void testReserve5() {
		int[][] roomForDays = new int[3][365];
		String result = lstTest.reserve(3, 9, roomForDays, 3);
		assertEquals(result, "Accept");
	}

	@Test
	void testReserve51() {
		int[][] roomForDays = new int[3][365];
		String result = lstTest.reserve(5, 4, roomForDays, 3);
		assertEquals(result, "Accept");
	}

	@Test
	void testReserve52() {
		int[][] roomForDays = new int[3][365];
		String result = lstTest.reserve(6, 6, roomForDays, 3);
		assertEquals(result, "Accept");
	}

	@Test
	void testReserve53() {
		int[][] roomForDays = new int[3][365];
		String result = lstTest.reserve(0, 4, roomForDays, 3);
		assertEquals(result, "Accept");
	}

	// case 3 - worked
	@Test
	void testReserve6() {
		int[][] roomForDays = new int[3][365];
		String result = lstTest.reserve(1, 3, roomForDays, 3);
		assertEquals(result, "Accept");
	}

	@Test
	void testReserve7() {
		int[][] roomForDays = new int[3][365];
		String result = lstTest.reserve(2, 5, roomForDays, 3);
		assertEquals(result, "Accept");
	}

	@Test
	void testReserve8() {
		int[][] roomForDays = new int[3][365];
		String result = lstTest.reserve(1, 9, roomForDays, 3);
		assertEquals(result, "Accept");
	}

	@Test
	void testReserve9() {
		int[][] roomForDays = new int[3][365];
		String result = lstTest.reserve(0, 15, roomForDays, 3);
		assertEquals(result, "Decline");
	}

	// case 4 - worked
	@Test
	void testReserve10() {
		int[][] roomForDays = new int[3][365];
		String result = lstTest.reserve(1, 3, roomForDays, 3);
		assertEquals(result, "Accept");
	}

	@Test
	void testReserve11() {
		int[][] roomForDays = new int[3][365];
		String result = lstTest.reserve(0, 15, roomForDays, 3);
		assertEquals(result, "Accept");
	}

	@Test
	void testReserve12() {
		int[][] roomForDays = new int[3][365];
		String result = lstTest.reserve(1, 9, roomForDays, 3);
		assertEquals(result, "Accept");
	}

	@Test
	void testReserve13() {
		int[][] roomForDays = new int[3][365];
		String result = lstTest.reserve(2, 5, roomForDays, 3);
		assertEquals(result, "Decline");
	}

	@Test
	void testReserve14() {
		int[][] roomForDays = new int[3][365];
		String result = lstTest.reserve(4, 9, roomForDays, 3);
		assertEquals(result, "Accept");
	}

	// case 5
	@Test
	void testReserve15() {
		int[][] roomForDays = new int[2][365];
		String result = lstTest.reserve(1, 3, roomForDays, 2);
		assertEquals(result, "Accept");
	}

	@Test
	void testReserve16() {
		int[][] roomForDays = new int[2][365];
		String result = lstTest.reserve(0, 4, roomForDays, 2);
		assertEquals(result, "Accept");
	}

	@Test
	void testReserve17() {
		int[][] roomForDays = new int[2][365];
		String result = lstTest.reserve(2, 3, roomForDays, 2);
		assertEquals(result, "Decline");
	}

	@Test
	void testReserve18() {
		int[][] roomForDays = new int[2][365];
		String result = lstTest.reserve(5, 5, roomForDays, 2);
		assertEquals(result, "Accept");
	}

	@Test
	void testReserve19() {
		int[][] roomForDays = new int[2][365];
		String result = lstTest.reserve(4, 10, roomForDays, 2);
		assertEquals(result, "Decline");
	}

	@Test
	void testReserve20() {
		int[][] roomForDays = new int[2][365];
		String result = lstTest.reserve(10, 10, roomForDays, 2);
		assertEquals(result, "Accept");
	}

	@Test
	void testReserve21() {
		int[][] roomForDays = new int[2][365];
		String result = lstTest.reserve(6, 7, roomForDays, 2);
		assertEquals(result, "Accept");
	}

	@Test
	void testReserve22() {
		int[][] roomForDays = new int[2][365];
		String result = lstTest.reserve(8, 10, roomForDays, 2);
		assertEquals(result, "Accept");
	}

	@Test
	void testReserve23() {
		int[][] roomForDays = new int[2][365];
		String result = lstTest.reserve(8, 9, roomForDays, 2);
		assertEquals(result, "Accept");
	}

}
