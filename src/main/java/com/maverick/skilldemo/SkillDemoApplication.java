package com.maverick.skilldemo;

import com.maverick.skilldemo.service.interfaces.IMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SkillDemoApplication extends CommandLineRunner {

    @Autowired
    private IMovieService movieService;

    public static void main(String[] args) {
        SpringApplication.run(SkillDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        movieService.getData();
    }

}