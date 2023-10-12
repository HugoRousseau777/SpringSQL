package com.Springpro.Springrpo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Springpro.Springrpo.Entity.Student;
public interface StudentRepo extends JpaRepository<Student, Integer> {
}
