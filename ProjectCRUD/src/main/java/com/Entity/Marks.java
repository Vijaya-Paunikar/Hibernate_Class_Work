//Q.2)WAP to perform CRUD operation to save your Project Entity(Marksheet).
package com.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
@Entity
@Table (name="Mark")
public class Marks 
{
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	@Id
	@Column (name="sid")
	private Integer studId;

	@Column (name="sname")
	private String studName;
	
	@Column (name="mark")
	private Integer marks;
	
	@Column (name="per")
	private double percentage;
	
	@Column (name="exam")
	private String examName;

	public Integer getStudId() {
		return studId;
	}

	public void setStudId(Integer studId) {
		this.studId = studId;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public String getExamName() {
		return examName;
	}

	public void setExamName(String examName) {
		this.examName = examName;
	}

	public Integer getMarks() {
		return marks;
	}

	public void setMarks(Integer marks) {
		this.marks = marks;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public Marks() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Marks(String studName, String examName, Integer marks, double percentage) {
		super();
		this.studName = studName;
		this.examName = examName;
		this.marks = marks;
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "Marks [studId=" + studId + ", studName=" + studName + ", examName=" + examName + ", marks=" + marks
				+ ", percentage=" + percentage + "]";
	}
	
}
