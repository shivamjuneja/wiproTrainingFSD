package exp.bookms;

public class BookStore {
    Book books[];
    String generes[]={"adventure","fiction","religion", "programming"};

    public BookStore(int capacity){
        books=new Book[capacity];
    }

    int index;

    Book addBook(String name, String author, String genre, double price){
        Book book=new Book();
        book.name=name;
        book.genre=genre;
        book.author=author;
        book.price=price;
        books[index]=book;
        index++;
        return book;
    }

    Book[] findBooksByGenre(String genre){
        Book foundBooks[] = new Book[index];
        int i=0;
        for (Book iterated:books){
            if(iterated.genre.equalsIgnoreCase(genre)){
               foundBooks[i]=iterated;
               i++;
            }
        }
        return foundBooks;
    }


}
