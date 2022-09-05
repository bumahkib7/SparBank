package org.codewarrior.sparbank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "org.codewarrior.sparbank.repo")
public class SparBankApplication {

    public static void main(String[] args) {
        SpringApplication.run(SparBankApplication.class, args);
    }

}
