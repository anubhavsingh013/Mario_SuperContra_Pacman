package com.in28minutes.springboot.learn_jpa_and_hibernate.course.jpa;

import org.springframework.stereotype.Repository;

import com.in28minutes.springboot.learn_jpa_and_hibernate.course.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CouseJpaRepository {
    @PersistenceContext
    private EntityManager enitiEntityManager;
    public void insert(Course course)
    {
        enitiEntityManager.merge(course);
    }
    public void findById(Long id)
    {
        enitiEntityManager.find(Course.class, id);
    }
    public void deleteById(Long id)
    {
        Course course=enitiEntityManager.find(Course.class, id) ;
        enitiEntityManager.remove(course);
    }
}
