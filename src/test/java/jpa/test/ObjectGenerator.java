package jpa.test;

import jpa.test.entities.Book;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.IntStream;

public class ObjectGenerator {

    public static List<Book> generateBooks(){
        return IntStream.range(0, 20).mapToObj(i -> {
            Book book = new Book();
            book.setId((long) i);
            book.setTitle("Book Title " + i);
            book.setAuthor("Author " + i);
            book.setPublishedDate(LocalDate.now().minusMonths(i)); // Setting a different published date for each book
            return book;
        }).toList();
    }

}
