package jpa.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class SpringJpaExamplesApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringJpaExamplesApplication.class, args);
    }

//    @Bean
//    CommandLineRunner commandLineRunner(@Autowired BookRepository bookRepository){
//        return args -> {
//            System.out.println("Assert is running");
//            assert !bookRepository.findAll().isEmpty();
//        };
//    }

}
