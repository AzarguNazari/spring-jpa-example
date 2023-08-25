package spring.jpa.examples.springjpaexamples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;
import spring.jpa.examples.springjpaexamples.entities.Person;

import java.util.List;

@Service
public class PersonRepositoryImpl {

    @Autowired
    private PersonRepository personRepository;

    public List<Person> findByFirstName(String firstName) {
        ExampleMatcher matcher = ExampleMatcher.matching()
                .withMatcher("firstName", ExampleMatcher.GenericPropertyMatcher.of(ExampleMatcher.StringMatcher.DEFAULT));

        Person userExample = new Person();
        userExample.setFirstName(firstName);

        Example<Person> example = Example.of(userExample, matcher);
        return personRepository.findAll(example);
    }

    public List<Person> findByLastNameStartingWith(String lastName) {
        ExampleMatcher matcher = ExampleMatcher.matching()
                .withMatcher("lastName", ExampleMatcher.GenericPropertyMatcher.of(ExampleMatcher.StringMatcher.STARTING));

        Person userExample = new Person();
        userExample.setLastName(lastName);

        Example<Person> example = Example.of(userExample, matcher);
        return personRepository.findAll(example);
    }

    public List<Person> findByFirstNameContainingIgnoreCase(String keyword) {
        ExampleMatcher matcher = ExampleMatcher.matching()
                .withMatcher("firstName", ExampleMatcher.GenericPropertyMatcher.of(ExampleMatcher.StringMatcher.CONTAINING))
                .withIgnoreCase();

        Person userExample = new Person();
        userExample.setFirstName(keyword);

        Example<Person> example = Example.of(userExample, matcher);
        return personRepository.findAll(example);
    }

}
