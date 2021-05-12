package com.example.demo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.Laptop.Laptop;
import com.example.demo.Laptop.Student;
import com.example.demo.LaptopDao.LaptopDao;
import com.example.demo.LaptopDao.StudentDao;

@SpringBootApplication
public class OnetoOneApplication implements CommandLineRunner {

	@Autowired
	private LaptopDao laptopDao;
	@Autowired
	private StudentDao studentDao;
	 
	
	public static void main(String[] args) {
		SpringApplication.run(OnetoOneApplication.class, args);
		System.out.println("Welcome");
	}
	@Override
	public void run(String... args) throws Exception {
		saveData();
		//showData ();
	}
	
	@Transactional
	private void saveData() {
	Laptop laptop1=new Laptop(1,"Dell");
		laptopDao.save(laptop1);
		System.out.println("inserted");
		Student student=new Student(12, "Rasheeda", 100, laptop1);
		studentDao.save(student);
		
	}
	
	@Transactional
	private void showData() {
		List<Laptop> laptop=laptopDao.findAll();
		List<Student> student=studentDao.findAll();
		System.out.println("******Student**********");
		student.forEach(System.out::println);
		System.out.println("********Laptop*******");
		laptop.forEach(System.out::println);
	}

}
