package controller;

import java.util.HashMap;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Student;
import service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {

	@Autowired
	StudentService ss;

	@RequestMapping("/all")
	public HashMap<String, Student> getAll() {
		return ss.getAll();
	}

	@RequestMapping("{id}")
	public Student getStudent(@PathVariable("id") String id) {
		return ss.getStudent(id);
	}
	
	/*@RequestMapping("{course}")
	public Student getStudent(@PathVariable("course") String course) {
		return ss.getStudent(course);
	}*/
}

