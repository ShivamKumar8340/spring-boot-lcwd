package com.sunglowsys.repository;

import com.sunglowsys.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

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
    // similarly, we can create method like findByNameEndingWth , findByNameContainingWith




    // write custom @Query like JPQL Query , native query

    // JPQL Query
    @Query("select s from Student s")
    public List<Student> getAllStudent();

    // get by name
    @Query("select s from Student s where s.name =:n")
    List<Student> getStudentByName(@Param("n") String name);


    // get by name and roll No
    @Query("select s from Student s where s.name =:n and s.rollNo =:i")
    List<Student> getStudentByNameOrRollNo(@Param("n") String name,@Param("i") Integer i);


    // native query
    @Query(value = "select * from student",nativeQuery = true)
    List<Student> getStudents();


}
