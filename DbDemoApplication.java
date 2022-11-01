package com.alkyz04.goodbooks;

import com.alkyz04.goodbooks.entity.RatingInfo;
import com.alkyz04.goodbooks.repository.RatingInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class DbDemoApplication implements CommandLineRunner {

    @Autowired
    RatingInfoRepository ratingInfoRepository;

    public static void main(String[] args) {
        SpringApplication.run(DbDemoApplication.class,args);
    }


    @Override
    public void run(String... args) {
        RatingInfo ratingInfoA = new RatingInfo("Harry Potter", 4, new Date(5,12,20), "Cool book.");
        ratingInfoRepository.save(ratingInfoA);


    }
}
