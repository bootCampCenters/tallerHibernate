package org.springframework.samples.petclinic;

import javax.transaction.Transactional;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * PetClinic Spring Boot Application.
 * 
 * @author Dave Syer
 *
 */
@SpringBootApplication
public class HibernateApplication implements CommandLineRunner {
	
	
	

    public static void main(String[] args) throws Exception {
        SpringApplication.run(HibernateApplication.class, args);
        
    }
    
    
    
    @Override
    @Transactional
    public void run(String... arg0) {
    	
		
		
	
		}	
    }


