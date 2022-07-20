package com.sunglowsys.repository;

import com.sunglowsys.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Long> {

    // create custom methode like find By name, by roll no ,like 'keyword', by alias

    // create methode to find data by  name
    List<Student> findByName(String name);

    // to get more spring supported method visit online "spring supported keyword"

    // find by name and rollNo

    // Note : please follow syntax like findByName bcz these queries5 works on syntax
    List<Student> findByNameAndRollNo(String name,Integer rollNo);

    // find by start with
    List<Student> findByNameStartingWith(String prefix);
    // similarly we can create method like findByNameEndingWth , findByNameContainingWith

}
