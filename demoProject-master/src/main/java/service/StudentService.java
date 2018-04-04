package service;

import java.util.*;

import org.springframework.stereotype.Service;

import model.Student;

@Service
public class StudentService {
	HashMap<String, Student> students = new HashMap<String, Student>();
	public StudentService() {
		Student s = new Student();
		s.setId("1");
		s.setAge(24);
		s.setFirstName("Gopal");
		s.setLastName("Nanduri");
		s.setCourse("Computer");
		students.put("1", s);

		s = new Student();
		s.setId("2");
		s.setAge(26);
		s.setFirstName("akka");
		s.setLastName("");
		s.setCourse("Computer");
		students.put("2", s);
	}
	public Student getStudent(String id) {
		if (students.containsKey(id))
			return students.get(id);
		else
			return null;
	}
	public HashMap<String, Student> getAll() {
		return students;
	}
	
	/*public Student getStudent(String course)
	{
		if(students.containsKey(course))
			return students.get(course);
		else
			return null;
	}*/
	
}

