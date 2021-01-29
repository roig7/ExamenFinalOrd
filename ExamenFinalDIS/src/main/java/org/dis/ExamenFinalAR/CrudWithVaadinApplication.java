package org.dis.ExamenFinalAR;

import org.apache.catalina.util.CustomObjectInputStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

@SpringBootApplication
public class CrudWithVaadinApplication {

    private static final Logger log = LoggerFactory.getLogger(CrudWithVaadinApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(CrudWithVaadinApplication.class);
    }

    @Bean
    public CommandLineRunner loadData(CustomerRepository repository) {
        return (args) -> {
            // save customers
            ArrayList<Customer> customer=null;
            TratamientoJson tratamientoJson=new TratamientoJson();
            customer=tratamientoJson.leerFicheroJson();

            
            repository.save(new Customer(000, 0112,"23","45","madrd","madrid",3,2,"28","34"));
           // repository.save(new Customer("Juan", "Rodríguez","Majadahonda"));
           // repository.save(new Customer("Pedro", "Arranz","Pozuelo"));
            //repository.save(new Customer("David", "Losada","Aravaca"));
            //repository.save(new Customer("Miguel", "Santos","Madrid"));
            //repository.save(new Customer("Antonio", "Wells","Londres"));

            // fetch all customers
            log.info("Customers found with findAll():");
            log.info("-------------------------------");
            for (Customer customer : repository.findAll()) {
                log.info(customer.toString());
            }
            log.info("");

            // fetch an individual customer by ID
            Customer customer = repository.findById(1L).get();
            log.info("Customer found with findOne(1L):");
            log.info("--------------------------------");
            log.info(customer.toString());
            log.info("");

            // fetch customers by last name
            log.info("Customer found with findByLastNameStartsWithIgnoreCase('Wells'):");
            log.info("--------------------------------------------");
            for (Customer bauer : repository
                    .findByLastNameStartsWithIgnoreCase("Wells")) {
                log.info(bauer.toString());
            }
            log.info("");
        };
    }


}