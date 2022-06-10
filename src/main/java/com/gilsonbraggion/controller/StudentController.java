package com.gilsonbraggion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gilsonbraggion.model.Student;
import com.gilsonbraggion.repository.StudentRepository;

@RestController
@RequestMapping("/api/students")
public class StudentController {

	@Autowired
	private StudentRepository repo;

	@GetMapping // Get request that returns all students
	public ResponseEntity<List<Student>> getAll() {
		return new ResponseEntity<>(repo.findAll(), HttpStatus.OK);
	}

	@GetMapping("/{id}") // Get request that returns a specific student with the provided Id
	public ResponseEntity<Student> getStudentById(@PathVariable String id) {
		return new ResponseEntity<>(repo.findById(Long.valueOf(id)).orElseThrow(() -> new IllegalStateException("Student with id " + id + " not found")), HttpStatus.OK);
	}

	@PostMapping // Post request that creates a new student in the database
	public ResponseEntity<Student> createStudent(@RequestBody Student student) {
		return new ResponseEntity<>(repo.save(student), HttpStatus.CREATED);
	}

	@DeleteMapping("/{id}") // Delete request that deletes a student in the database
	public ResponseEntity<String> deleteStudent(@PathVariable String id) {
		repo.deleteById(Long.valueOf(id));
		return new ResponseEntity<>("Student deleted", HttpStatus.NO_CONTENT);
	}

}
