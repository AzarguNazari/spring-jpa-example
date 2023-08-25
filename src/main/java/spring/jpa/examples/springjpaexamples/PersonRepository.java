package spring.jpa.examples.springjpaexamples;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import spring.jpa.examples.springjpaexamples.entities.Person;

import java.util.List;
import java.util.stream.Stream;

public interface PersonRepository extends JpaRepository<Person, Long> {
    List<Person> findByLastName(String lastName);
    List<Person> readByFirstName(String firstName);
    Person getById(Long id);
    @Query("SELECT p FROM Person p WHERE p.firstName = :firstName AND p.lastName = :lastName")
    List<Person> queryByFirstNameAndLastName(@Param("firstName") String firstName, @Param("lastName") String lastName);
    List<Person> searchByLastName(String lastName);
    Stream<Person> streamByFirstName(String firstName);

}
