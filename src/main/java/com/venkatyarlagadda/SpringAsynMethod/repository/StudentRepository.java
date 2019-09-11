package com.venkatyarlagadda.SpringAsynMethod.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.venkatyarlagadda.SpringAsynMethod.entity.Student;

/**
 * 
 * @author Venkat Yarlagadda
 * @version V1
 *
 */

public interface StudentRepository extends JpaRepository<Student, Long>{

}
