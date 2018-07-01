package com.details.webapp.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class ApplicationForm {
	@Id
	private String mobileNo;
	private String name;
	private String gender;
	private Date dob;
	private String fatherName;
	private String permanentAddres;
	private String presentAddres;
	private String emaialID;
	private String residencePhoneNo;
	
	private String passportNo;
	private Date validity;
	private String panNo;
	@OneToMany
	private List<Qualification> qualificationList;
	@OneToMany
	private List<Technologies> technologiesList;
	@OneToMany
	private List<Trainings> trainingsList;
	@OneToMany
	private List<ReleventWorkExp> relewantWorkExp;
	private String awards;
	private String achievements;
	private String strengths;
	private String shortGoal;
	private String longGoal;
	private boolean willingToTravel;
	private String reason;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getPermanentAddres() {
		return permanentAddres;
	}
	public void setPermanentAddres(String permanentAddres) {
		this.permanentAddres = permanentAddres;
	}
	public String getPresentAddres() {
		return presentAddres;
	}
	public void setPresentAddres(String presentAddres) {
		this.presentAddres = presentAddres;
	}
	public String getEmaialID() {
		return emaialID;
	}
	public void setEmaialID(String emaialID) {
		this.emaialID = emaialID;
	}
	public String getResidencePhoneNo() {
		return residencePhoneNo;
	}
	public void setResidencePhoneNo(String residencePhoneNo) {
		this.residencePhoneNo = residencePhoneNo;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getPassportNo() {
		return passportNo;
	}
	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}
	public Date getValidity() {
		return validity;
	}
	public void setValidity(Date validity) {
		this.validity = validity;
	}
	public String getPanNo() {
		return panNo;
	}
	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}
	public List<Qualification> getQualificationList() {
		return qualificationList;
	}
	public void setQualificationList(List<Qualification> qualificationList) {
		this.qualificationList = qualificationList;
	}
	public List<Technologies> getTechnologiesList() {
		return technologiesList;
	}
	public void setTechnologiesList(List<Technologies> technologiesList) {
		this.technologiesList = technologiesList;
	}
	public List<Trainings> getTrainingsList() {
		return trainingsList;
	}
	public void setTrainingsList(List<Trainings> trainingsList) {
		this.trainingsList = trainingsList;
	}
	public List<ReleventWorkExp> getRelewantWorkExp() {
		return relewantWorkExp;
	}
	public void setRelewantWorkExp(List<ReleventWorkExp> relewantWorkExp) {
		this.relewantWorkExp = relewantWorkExp;
	}
	public String getAwards() {
		return awards;
	}
	public void setAwards(String awards) {
		this.awards = awards;
	}
	public String getAchievements() {
		return achievements;
	}
	public void setAchievements(String achievements) {
		this.achievements = achievements;
	}
	public String getStrengths() {
		return strengths;
	}
	public void setStrengths(String strengths) {
		this.strengths = strengths;
	}
	public String getShortGoal() {
		return shortGoal;
	}
	public void setShortGoal(String shortGoal) {
		this.shortGoal = shortGoal;
	}
	public String getLongGoal() {
		return longGoal;
	}
	public void setLongGoal(String longGoal) {
		this.longGoal = longGoal;
	}
	public boolean isWillingToTravel() {
		return willingToTravel;
	}
	public void setWillingToTravel(boolean willingToTravel) {
		this.willingToTravel = willingToTravel;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	
	
	

}
