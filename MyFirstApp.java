import java.util.Date;

/** MyFirstApp is a sample program from p. 8-9 of Head First Java, 2nd edition.
    @author Kathy Sierra adn Bert Bates
    @author Ziliang Zeng
    @version 01/07/2016
*/

public class MyFirstApp {    
    public static void main (String[] args){
	System.out.println("I Rule!");
	System.out.println("The World");

	// Instantiate a Date object
	Date date = new Date();

	// display time and date using toString()
	System.out.println(date.toString());
    }
}
