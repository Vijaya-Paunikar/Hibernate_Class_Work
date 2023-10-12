//Q.1)Create student and  Course Entity to show one to Many and Many to one mapping

package com.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="courses")
public class Course 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="course_id")
	private int id;
	
	@Column(name="course_name")
	private String name;
	
	@OneToMany(mappedBy="course",cascade=CascadeType.ALL)
	private List<Student> student=new ArrayList<Student>();

	public Course() 
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public Course(int id, String name, List<Student> student) 
	{
		super();
		this.id = id;
		this.name = name;
		this.student = student;
	}

	public int getId() 
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public List<Student> getStudent() 
	{
		return student;
	}

	public void setStudent(List<Student> student) 
	{
		this.student = student;
	}
	
}
