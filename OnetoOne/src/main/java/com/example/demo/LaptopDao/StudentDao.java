package com.example.demo.LaptopDao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Laptop.Student;
@Repository
public interface StudentDao extends JpaRepository<Student, Integer> {

}
