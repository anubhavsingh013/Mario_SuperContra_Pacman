package com.in28minutes.springboot.learn_jpa_and_hibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.springboot.learn_jpa_and_hibernate.course.jdbc.CourseJdbcRepository;
import com.in28minutes.springboot.learn_jpa_and_hibernate.course.jpa.CouseJpaRepository;
import com.in28minutes.springboot.learn_jpa_and_hibernate.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner{
    // @Autowired
    // private CourseJdbcRepository repository;

    // @Autowired
    // private CouseJpaRepository repository;

    @Autowired
    private CourseSpringDataJpaRepository  repository;
    @Override
    public void run(String... args) throws Exception {
       repository.save(new Course(1L,"MS","In28Minutes"));
       repository.save(new Course(2L,"Spring","In28Minutes"));
       repository.save(new Course(3L,"Spring cloud","In28Minutes"));
    //    repository.deleteById(1L);
       System.out.println(repository.findById(2L));
       System.out.println(repository.findById(3L));
       
    }
    
}
