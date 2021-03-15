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
		assertEquals(8*0, bookShop.cost(new int[] {0,0,0,0,0}));
	}
	
	@Test
	public void oneBook() {
		assertEquals(8*1, bookShop.cost(new int[] {1,0,0,0,0}));
	}
	
	@Test
	public void twoBooksDiscount() {
		assertEquals(8*2*0.93, bookShop.cost(new int[] {1,1,0,0,0}));
	}
	@Test
	public void threeBooksDiscount() {
		assertEquals(8*3*0.86, bookShop.cost(new int[] {1,1,1,0,0}));
	}
	@Test
	public void fourBooksDiscount() {
		assertEquals(8*4*0.72, bookShop.cost(new int[] {1,1,1,1,0}));
	}
	
	@Test
	public void fourBooksWithRepition() { 
		assertEquals(8*3*0.86+8, bookShop.cost(new int[] {2,1,1,0,0}));
	}
	
	@Test
	public void fiveBooksDiscount() {
		assertEquals(8*5*0.65, bookShop.cost(new int[] {1,1,1,1,1}));
	}
	@Test
	public void fiveBooksWithRepition() { 
		assertEquals(8*5*0.65+3*8, bookShop.cost(new int[] {3,2,1,1,1}));
	}

    /*@Test
    public void myFirstTest(){
        assertTrue(false);
    }*/
}