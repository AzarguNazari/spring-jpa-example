package spring.jpa.examples.springjpaexamples;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.jpa.examples.springjpaexamples.entities.Book;

import java.time.LocalDate;
import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long>
{
    // Logical keywords: AND, OR

    // Using 'And' keyword
    List<Book> findByTitleAndAuthor(String title, String author);

    // Using 'Or' keyword
    List<Book> findByTitleOrAuthor(String title, String author);

// Keyword expressions: AFTER, BEFORE

    // Using 'IsAfter' keyword
    List<Book> findByPublishedDateIsAfter(LocalDate date);

    // Using 'IsBefore' keyword
    List<Book> findByPublishedDateIsBefore(LocalDate date);

// Keyword expressions: CONTAINING

    // Using 'Containing' keyword
    List<Book> findByTitleContaining(String keyword);

// Keyword expressions: BETWEEN

    // Using 'IsBetween' keyword
    List<Book> findByPublishedDateIsBetween(LocalDate startDate, LocalDate endDate);

// Keyword expressions: ENDING_WITH

    // Using 'EndingWith' keyword
    List<Book> findByTitleEndingWith(String suffix);

// Keyword expressions: EXISTS

    // Using 'Exists' keyword
    boolean existsByAuthor(String author);

// Keyword expressions: IN

    // Using 'IsIn' keyword
    List<Book> findByAuthorIsIn(List<String> authors);

// Keyword expressions: IS_NULL

    // Using 'IsNull' keyword
    List<Book> findByPublishedDateIsNull();

// Keyword expressions: NOT

    // Using 'Not' keyword
    List<Book> findByTitleNot(String title);

// Keyword expressions: NOT_IN

    // Using 'IsNotIn' keyword
    List<Book> findByAuthorIsNotIn(List<String> authors);

// Keyword expressions: NOT_LIKE

    // Using 'NotLike' keyword
    List<Book> findByTitleNotLike(String keyword);

// Keyword expressions: LIKE

    // Using 'IsLike' keyword
    List<Book> findByAuthorIsLike(String keyword);

// Keyword expressions: LESS_THAN_EQUAL

    // Using 'IsLessThanEqual' keyword
    List<Book> findByPublishedDateIsLessThanEqual(LocalDate date);

// Keyword expressions: IS_EMPTY

    // Using 'IsEmpty' keyword
    List<Book> findByTitleIsEmpty();

// Keyword expressions: IS_NOT_EMPTY

    // Using 'IsNotEmpty' keyword
    List<Book> findByAuthorIsNotEmpty();

// Keyword expressions: TRUE

    // Using 'IsTrue' keyword
    List<Book> findByPublishedDateIsTrue();

}
