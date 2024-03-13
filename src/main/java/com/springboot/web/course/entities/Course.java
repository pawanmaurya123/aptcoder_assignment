package com.springboot.web.course.entities;

public class Course {

	
	private int courseId;
	private String courseName;
	private String subject;
	private int noofchapters;
	private String types;
	private String learnmode;
	
	
	public Course(int courseId, String courseName, String subject, int noofchapters, String types, String learnmode) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.subject = subject;
		this.noofchapters = noofchapters;
		this.types = types;
		this.learnmode = learnmode;
	}
	public Course() {
		super();
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getNoofchapters() {
		return noofchapters;
	}
	public void setNoofchapters(int noofchapters) {
		this.noofchapters = noofchapters;
	}
	public String getTypes() {
		return types;
	}
	public void setTypes(String types) {
		this.types = types;
	}
	public String getLearnmode() {
		return learnmode;
	}
	public void setLearnmode(String learnmode) {
		this.learnmode = learnmode;
	}


	
	
}
