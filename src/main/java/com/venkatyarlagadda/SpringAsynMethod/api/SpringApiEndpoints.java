package com.venkatyarlagadda.SpringAsynMethod.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.venkatyarlagadda.SpringAsynMethod.controller.StudentController;
import com.venkatyarlagadda.SpringAsynMethod.controller.StudentLogController;
import com.venkatyarlagadda.SpringAsynMethod.entity.Student;
import com.venkatyarlagadda.SpringAsynMethod.entity.StudentLog;

/**
 * 
 * @author Venkat Yarlagadda
 * @version V1
 *
 */

@RestController
@RequestMapping("/WS")
public class SpringApiEndpoints {

	@Autowired
	private StudentController studentController;
	
	@Autowired
	private StudentLogController studentLogController;

	@GetMapping("/student")
	public ResponseEntity<List<Student>> getStudents() {
		return studentController.getAllStudents();
	}
	
	@GetMapping("/student/{studentId}")
	public ResponseEntity<Student> getStudent(@PathVariable("studentId") final Long studentId) {
		return studentController.getStudent(studentId);
	}
	
	@PostMapping("/student")
	public ResponseEntity<Student> addStudent(@RequestBody final Student student) {
		return studentController.addStudent(student);
	}
	
	@DeleteMapping("/student/{studentId}")
	public ResponseEntity<Boolean> deleteStudent(@PathVariable("studentId") final Long studentId){
		return studentController.deleteStudent(studentId);
	}

	@GetMapping("/studentLog")
	public ResponseEntity<List<StudentLog>> getStudentLogs() {
		return studentLogController.getAllStudentLogs();
	}
}
