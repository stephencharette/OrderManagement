package com.ordermanagement.createorder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.math.BigDecimal;

@SpringBootApplication
public class CreateOrderApplication {

	private static final Logger log = LoggerFactory.getLogger(CreateOrderApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(CreateOrderApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(MenuItemRepository repository) {
    return (args) -> {
      repository.save(new MenuItem("Spring Milk Tea", new BigDecimal(6.99)));
      repository.save(new MenuItem("Coconut Milk Tea", new BigDecimal(6.99)));
      repository.save(new MenuItem("Mango Green Tea", new BigDecimal(5.99)));
      repository.save(new MenuItem("Spring Green Tea", new BigDecimal(5.99)));

      // fetch all customers
      log.info("Menu items found with findAll():");
      log.info("-------------------------------");
      repository.findAll().forEach(menuItem -> {
        log.info(menuItem.toString());
      });
      log.info("");

      MenuItem menuItem = repository.findById(1L);
      log.info("menuItem found with findById(1L):");
      log.info("--------------------------------");
      log.info(menuItem.toString());
      log.info("");
    };
  }

}
