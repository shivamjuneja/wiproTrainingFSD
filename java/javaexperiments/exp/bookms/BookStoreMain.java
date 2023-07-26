package exp.bookms;

public class BookStoreMain {
    public static void main(String args[]) {
        BookStore store = new BookStore(10);
        Book book = store.addBook("jcomplete reference", "schieldt", "programming", 2000);

        Book programmingBooks[]=store.findBooksByGenre("programming");
    }
}
