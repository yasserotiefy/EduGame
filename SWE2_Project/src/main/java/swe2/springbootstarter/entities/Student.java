package swe2.springbootstarter.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
public class Student extends Users
{
	
	@ManyToMany(mappedBy = "students")
	Set<Course> courses;
	

//	public Set<Course> getCourse() {
//		return courses;
//	}

//	public Set<Course> getCourses() {
//		return courses;
//	}

	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}





	public void setCourse(Set<Course> course) {
		this.courses = course;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, String mail, String password) {
		super(name, mail, password);
		// TODO Auto-generated constructor stub
	}

	

	

}
