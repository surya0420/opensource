package com.details.webapp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Technologies {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private int sno;
	private String primarySkill;
	private String primarySkilDesc;
	private String secondarySkill;
	private String secondarySkilldesc;
	

	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getPrimarySkill() {
		return primarySkill;
	}
	public void setPrimarySkill(String primarySkill) {
		this.primarySkill = primarySkill;
	}
	public String getPrimarySkilDesc() {
		return primarySkilDesc;
	}
	public void setPrimarySkilDesc(String primarySkilDesc) {
		this.primarySkilDesc = primarySkilDesc;
	}
	public String getSecondarySkill() {
		return secondarySkill;
	}
	public void setSecondarySkill(String secondarySkill) {
		this.secondarySkill = secondarySkill;
	}
	public String getSecondarySkilldesc() {
		return secondarySkilldesc;
	}
	public void setSecondarySkilldesc(String secondarySkilldesc) {
		this.secondarySkilldesc = secondarySkilldesc;
	}
	
	
	

}
