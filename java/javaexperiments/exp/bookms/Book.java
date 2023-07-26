package exp.bookms;

public class Book {

    String name;
    String author;
    String genre;
    double price;

    double calculatePriceAfterDiscount() {
        if (!genre.equals("fiction")) {
            return price;
        }
        double result = price+ (price * .25);
        return result;

    }

}
