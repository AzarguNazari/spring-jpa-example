package jpa.test;

import jpa.test.dtos.BookIdAndTitleDto;
import org.springframework.data.jpa.repository.JpaRepository;
import jpa.test.entities.Book;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface BookRepository extends JpaRepository<Book, Long>
{

    Optional<BookIdAndTitleDto> findFirstByAuthorAndTitle(String author, String title); // custom dto
    List<Book> findAllByTitleOrAuthor(String title, String author);
    List<Book> findAllByPublishedDateIsAfter(LocalDate date);
    List<Book> findAllByPublishedDateIsBefore(LocalDate date);
    List<Book> findAllByTitleContaining(String keyword);
    List<Book> findAllByPublishedDateIsBetween(LocalDate startDate, LocalDate endDate);
    List<Book> findAllByTitleEndingWith(String suffix);
    boolean existsByAuthor(String author);
    List<Book> findAllByAuthorIsIn(List<String> authors);
    List<Book> findAllByPublishedDateIsNull();
    List<Book> findAllByTitleNot(String title);
    List<Book> findAllByAuthorIsNotIn(List<String> authors);
    List<Book> findAllByTitleNotLike(String keyword);
    List<Book> findAllByAuthorIsLike(String keyword);
    List<Book> findAllByPublishedDateIsLessThanEqual(LocalDate date);

}
