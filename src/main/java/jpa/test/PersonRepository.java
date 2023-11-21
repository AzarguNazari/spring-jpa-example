package jpa.test;

import jpa.test.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.stream.Stream;

public interface PersonRepository extends JpaRepository<Person, Long> {
    List<Person> findAllByLastName(String lastName);
    List<Person> readAllByFirstName(String firstName);
    @Query("SELECT p FROM Person p WHERE p.firstName = :firstName AND p.lastName = :lastName")
    List<Person> queryByFirstNameAndLastName(@Param("firstName") String firstName, @Param("lastName") String lastName);
    List<Person> searchAllByLastName(String lastName);
    Stream<Person> streamAllByFirstName(String firstName);

}
