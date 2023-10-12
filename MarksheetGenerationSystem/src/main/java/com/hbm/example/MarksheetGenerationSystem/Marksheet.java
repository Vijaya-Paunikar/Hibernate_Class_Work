/*
 WAP to create Entity class and store the corresponding object in database using hibernate for assigned project.
 */

/*
 * This is the Entity class representing the Marksheet table in the database.
 * It is used to store and retrieve Marksheet records.
 */

package com.hbm.example.MarksheetGenerationSystem;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Marksheet 
{
	@Id
	private int marksheetid; // Unique identifier for the Marksheet record
	@Column
	private int studentid; // Student's ID associated with the Marksheet
	@Column
	private String studname; // Student's name
	@Column
	private int courseid; // ID of the course to which the Marksheet belongs
	@Column
	private String examname; // Name of the exam
	@Column
	private String examtype; // Type of the exam (e.g., final, midterm)
	@Column
	private int sub1score; // Score for subject 1
	@Column
	private int sub2score; // Score for subject 2
	@Column
	private int sub3score; // Score for subject 3
	@Column
	private int sub4score; // Score for subject 4
	@Column
	private int sub5score; // Score for subject 5
	@Column
	private int totalmarksobtained; // Total marks obtained by the student
	@Column
	private int totalmarks; // Total marks possible for the exam
	@Column
	private double percentage; // Percentage obtained by the student
	@Column
	private char grade; // Grade assigned to the student's performance
	
	
	 // Getters and setters for each attribute
	public int getMarksheetid() 
	{
		return marksheetid;
	}
	
	public void setMarksheetid(int marksheetid) 
	{
		this.marksheetid = marksheetid;
	}
	
	public int getStudentid() 
	{
		return studentid;
	}
	
	public void setStudentid(int studentid) 
	{
		this.studentid = studentid;
	}
	
	public String getStudname() 
	{
		return studname;
	}
	
	public void setStudname(String studname) {
		this.studname = studname;
	}
	public int getCourseid() {
		return courseid;
	}
	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}
	public String getExamname() {
		return examname;
	}
	public void setExamname(String examname) {
		this.examname = examname;
	}
	public String getExamtype() {
		return examtype;
	}
	public void setExamtype(String examtype) {
		this.examtype = examtype;
	}
	public int getSub1score() {
		return sub1score;
	}
	public void setSub1score(int sub1score) {
		this.sub1score = sub1score;
	}
	public int getSub2score() {
		return sub2score;
	}
	public void setSub2score(int sub2score) {
		this.sub2score = sub2score;
	}
	public int getSub3score() {
		return sub3score;
	}
	public void setSub3score(int sub3score) {
		this.sub3score = sub3score;
	}
	public int getSub4score() {
		return sub4score;
	}
	public void setSub4score(int sub4score) {
		this.sub4score = sub4score;
	}
	public int getSub5score() {
		return sub5score;
	}
	public void setSub5score(int sub5score) {
		this.sub5score = sub5score;
	}
	public int getTotalmarksobtained() {
		return totalmarksobtained;
	}
	public void setTotalmarksobtained(int totalmarksobtained) {
		this.totalmarksobtained = totalmarksobtained;
	}
	public int getTotalmarks() {
		return totalmarks;
	}
	public void setTotalmarks(int totalmarks) {
		this.totalmarks = totalmarks;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	
}
