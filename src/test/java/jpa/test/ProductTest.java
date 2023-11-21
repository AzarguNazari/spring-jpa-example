package jpa.test;

import lombok.SneakyThrows;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static jpa.test.ObjectGenerator.generateBooks;


class ProductTest extends PostgresContainerSetupTest {

    @Autowired
    BookRepository bookRepository;

    @BeforeEach
    void setup(){
        var books = generateBooks();
        bookRepository.saveAll(books);
    }

    @AfterEach
    void cleanup(){
        bookRepository.deleteAll();
    }

    @Test
    void getBooksByAuthorAndTitle() {
        var byIdAndTitle = bookRepository.findFirstByAuthorAndTitle("Author 1", "Book Title 1");
        Assertions.assertNotNull(byIdAndTitle);
        Assertions.assertEquals("Author 1", byIdAndTitle.get().getAuthor());
        Assertions.assertEquals("Book Title 1", byIdAndTitle.get().getTitle());
    }

}