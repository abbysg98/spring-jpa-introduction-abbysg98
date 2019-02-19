package main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstApplication implements CommandLineRunner {


    @Autowired
    PersonRepository personRepository;

    @Autowired
    ManagerRepository managerRepository;

    public static void main(String[] args) {
        SpringApplication.run(FirstApplication.class,args);
    }

    @Override
    public void run(String... args) throws Exception {
        Person person = new Person();
        person.setName("John");
        personRepository.save(person);

        Person personFromDb = personRepository.findFirstByName("John");
        System.out.println(personFromDb);


        Manager manager = new Manager();
        manager.setLastName("Ogunwomoju");
        manager.setFirst(" Abby");
        managerRepository.save(manager);

        Manager managerFromDb = managerRepository.findByLastName("Ogunwomoju");
        System.out.println(managerFromDb);
    }
}
