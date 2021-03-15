package books;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * TODO : Add your import here
 */

public class BookShopTest {

	/**
	 * TODO : Put your test here
	 */

	BookShop bookShop = new BookShop("MyBookShop");

	@Test
	public void noBooks() {
		assertEquals(8 * 0, bookShop.cost(new int[] { 0, 0, 0, 0, 0 }));
	}

	@Test
	public void oneBook() {
		assertEquals(8 * 1, bookShop.cost(new int[] { 1, 0, 0, 0, 0 }));
	}

	@Test
	public void oneBookWithRepetition() {
		assertEquals(8 * 4, bookShop.cost(new int[] { 0, 4, 0, 0, 0 }));
	}

	@Test
	public void twoBooks() {
		assertEquals(8 * 2, bookShop.cost(new int[] { 0, 0, 0, 2, 0 }));
	}

	@Test
	public void twoBooksDiscount() {
		assertEquals(8 * 2 * 0.93, bookShop.cost(new int[] { 1, 1, 0, 0, 0 }));
	}

	@Test
	public void twoBooksDiscountWithRepetition() {
		assertEquals(8 * 2 * 0.93 + 8 * 5, bookShop.cost(new int[] { 3, 4, 0, 0, 0 }));
	}

	@Test
	public void threeBooks() {
		assertEquals(8 * 3, bookShop.cost(new int[] { 0, 3, 0, 0, 0 }));
	}

	@Test
	public void threeBooksDiscount() {
		assertEquals(8 * 3 * 0.86, bookShop.cost(new int[] { 1, 1, 1, 0, 0 }));
	}

	@Test
	public void threeBooksDiscountWithRepition() {
		assertEquals(8 * 3 * 0.86 + 8 * 4, bookShop.cost(new int[] { 2, 0, 0, 1, 4 }));
	}

	@Test
	public void fourBooks() {
		assertEquals(8 * 4, bookShop.cost(new int[] { 4, 0, 0, 0, 0 }));
	}

	@Test
	public void fourBooksDiscount() {
		assertEquals(8 * 4 * 0.72, bookShop.cost(new int[] { 1, 1, 1, 1, 0 }));
	}

	@Test
	public void fourBooksDiscountWithRepition() {
		assertEquals(8 * 3 * 0.86 + 8, bookShop.cost(new int[] { 2, 1, 1, 0, 0 }));
	}

	@Test
	public void fourBooksDiscountWithRepition2() {
		assertEquals(8 * 2 * 0.93 + 8 * 2, bookShop.cost(new int[] { 3, 1, 0, 0, 0 }));
	}

	@Test
	public void fourBooksDiscountWithRepition3() {
		assertEquals(8 * 4 * 0.72 + 8 * 10, bookShop.cost(new int[] { 3, 2, 4, 5, 0 }));
	}

	@Test
	public void fiveBooks() {
		assertEquals(8 * 5, bookShop.cost(new int[] { 0, 0, 5, 0, 0 }));
	}

	@Test
	public void fiveBooksDiscount() {
		assertEquals(8 * 5 * 0.65, bookShop.cost(new int[] { 1, 1, 1, 1, 1 }));
	}

	@Test
	public void fiveBooksDiscountWithRepition() {
		assertEquals(8 * 5 * 0.65 + 8 * 3, bookShop.cost(new int[] { 3, 2, 1, 1, 1 }));
	}

	@Test
	public void fiveBooksDiscountWithRepition2() {
		assertEquals(8 * 5 * 0.65 + 8 * 8, bookShop.cost(new int[] { 2, 3, 2, 4, 2 }));
	}

	@Test
	public void fiveBooksDiscountWithRepition3() {
		assertEquals(8 * 5 * 0.65 + 8 * 10, bookShop.cost(new int[] { 5, 1, 2, 6, 1 }));
	}

	/*
	 * @Test public void myFirstTest(){ assertTrue(false); }
	 */
}