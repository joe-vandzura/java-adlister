import beans.Album;
import beans.Author;
import beans.Quote;

import java.time.Year;
import java.util.ArrayList;

public class BeanTest {
    public static void main(String[] args) {

        Album albumOne = new Album(1, "Skillet", "Awake", Year.of(2009), 2.3, "Rock");
        Album albumTwo = new Album(2, "Golden Earring", "Cut", Year.of(1982), 1.5, "Rock");

        System.out.println(albumOne);
        System.out.println(albumTwo);

        Author authorOne = new Author(1, "Albert", "Einstein");
        Author authorTwo = new Author(2, "Elbert", "Hubbard");

        System.out.println(authorOne);
        System.out.println(authorTwo);

        Quote quoteOne = new Quote(1, "\"Two things are infinite: the universe and human stupidity; and I'm not sure about the universe.\"", authorOne);
        Quote quoteTwo = new Quote(1, "\"A friend is someone who knows all about you and still loves you.\"", authorTwo);

        System.out.println(quoteOne);
        System.out.println(quoteTwo);

        ArrayList<Quote> quotes = new ArrayList<>();

        quotes.add(quoteOne);
        quotes.add(quoteTwo);

        for (Quote quote : quotes) {
            System.out.println("Here is quote " + (quotes.indexOf(quote) + 1 ) + ": " + quote.getContent() + " from the author, " + quote.getAuthor().getFirstName() + " " + quote.getAuthor().getLastName() + ".");
        }
    }
}
