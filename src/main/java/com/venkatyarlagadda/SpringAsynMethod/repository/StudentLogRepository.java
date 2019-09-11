package com.venkatyarlagadda.SpringAsynMethod.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.venkatyarlagadda.SpringAsynMethod.entity.StudentLog;

/**
 * 
 * @author Venkat Yarlagadda
 * @version V1
 *
 */

public interface StudentLogRepository extends JpaRepository<StudentLog, Long>{

}
