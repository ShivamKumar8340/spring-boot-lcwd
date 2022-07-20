package com.sunglowsys;

import com.sunglowsys.domain.Student;
import com.sunglowsys.repository.StudentRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class SpringBootFirstApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(SpringBootFirstApplication.class, args);
		StudentRepository repository =context.getBean(StudentRepository.class);
		Student student = new Student("aditya",11);
		Student student1 = new Student("sumit",15);
		Student student2 = new Student("ankit",16);


		// save single object
		//Student result =	repository.save(student);
		//System.out.println("data saved successfully : "+result);


/*
		// save multiple object
		List<Student> list = List.of(student,student1,student2);
		Iterable<Student> studentIterable= 	repository.saveAll(list);

		// to check list data
		studentIterable.forEach(e-> System.out.println(e));*/


		/*// update data
		Optional<Student> optional =repository.findById(1L);
		Student student3 =optional.get();
		System.out.println(student3);
		student3.setName("shivam kashyap");
		Student updatedResult= repository.save(student3);
		System.out.println(updatedResult);*/


		/*// find all
		Iterable<Student> studentIterable =repository.findAll();
		studentIterable.forEach(s-> System.out.println(s));*/

		/*// delete
		repository.deleteById(5L);
		System.out.println("deleted");*/
	}


}

