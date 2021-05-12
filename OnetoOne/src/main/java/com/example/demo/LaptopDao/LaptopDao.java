package com.example.demo.LaptopDao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Laptop.Laptop;

@Repository
public interface LaptopDao extends JpaRepository<Laptop, Integer> {

}
