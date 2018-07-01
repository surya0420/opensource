package com.details.webapp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Qualification {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String sNo;
	private String period;
	private String degree;
	private String course;
	private String intitution;
	private float percentage;
	private String passedWith;

	public String getsNo() {
		return sNo;
	}

	public void setsNo(String sNo) {
		this.sNo = sNo;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getIntitution() {
		return intitution;
	}

	public void setIntitution(String intitution) {
		this.intitution = intitution;
	}

	public float getPercentage() {
		return percentage;
	}

	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}

	public String getPassedWith() {
		return passedWith;
	}

	public void setPassedWith(String passedWith) {
		this.passedWith = passedWith;
	}

}
