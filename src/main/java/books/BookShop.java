package books;

public class BookShop {

    private final String name;

    /**
     * Constructor of the class Book shop
     * @param name name of the book shop
     */
    public BookShop(String name){
        this.name = name;
    }

    /**
     * method to compute the cost of a basket
     * @param books array corresponding to the number of each harry potter book the client desire to buy (books.length should return 5)
     * @return the cost in euro with the discount
     */
    public double cost(int[] books){
        //TODO complete
    	int totalBooks = 0;
    	int differentBooksCount=0;
    	double price = 0;
    	
    	for( int i : books) {
    		if(i > 0) {
    			totalBooks += i;
    			differentBooksCount+=1;
    		}
    	}
    	if(differentBooksCount==1) {
    		price = totalBooks*8;
    	}
    	if(differentBooksCount==2) {
    		totalBooks -= differentBooksCount;
    		price = differentBooksCount*8*0.93+ totalBooks*8;
    	}
    	if(differentBooksCount==3) {
    		totalBooks -= differentBooksCount;
    		price = differentBooksCount*8*0.86+ totalBooks*8;
    	}
    	if(differentBooksCount==4) {
    		totalBooks -= differentBooksCount;
    		price = differentBooksCount*8*0.72+ totalBooks*8;
    	}
    	if(differentBooksCount==5) {
    		totalBooks -= differentBooksCount;
    		price = differentBooksCount*8*0.65+ totalBooks*8;
    	}

        return price;
    }
}
