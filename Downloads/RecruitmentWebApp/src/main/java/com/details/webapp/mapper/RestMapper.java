package com.details.webapp.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.details.webapp.entity.ApplicationForm;
import com.details.webapp.entity.ReleventWorkExp;
import com.details.webapp.pojo.Qualification;
import com.details.webapp.pojo.Technologies;
import com.details.webapp.repository.ApplicationFormRepo;
import com.details.webapp.repository.QualifRepo;
import com.details.webapp.repository.ReleventWorkRepo;
import com.details.webapp.repository.TechnologyRepo;
import com.details.webapp.repository.TrainingRepo;
import com.google.gson.Gson;

@Component
public class RestMapper {

	@Autowired
	ApplicationFormRepo applicationFormRepo;

	@Autowired
	QualifRepo qualifRepo;
	@Autowired
	ReleventWorkRepo releventWorkRepo;
	@Autowired
	TechnologyRepo technologyRepo;
	@Autowired
	TrainingRepo trainingRepo;

	public ApplicationForm mapForSave(com.details.webapp.pojo.ApplicationForm input) {
		ApplicationForm applicationForm = new ApplicationForm();
		applicationForm.setAchievements(input.getAchievements());
		applicationForm.setAwards(input.getAwards());
		applicationForm.setDob(input.getDob());
		applicationForm.setEmaialID(input.getEmaialID());
		applicationForm.setFatherName(input.getFatherName());
		applicationForm.setGender(input.getGender());
		applicationForm.setLongGoal(input.getLongGoal());
		applicationForm.setMobileNo(input.getLongGoal());
		applicationForm.setName(input.getName());
		applicationForm.setPanNo(input.getPanNo());
		applicationForm.setPassportNo(input.getPassportNo());
		applicationForm.setPermanentAddres(input.getPermanentAddres());

		List<com.details.webapp.entity.Qualification> qualifList = new ArrayList<>();
		for (Qualification qualification : input.getQualificationList()) {
			com.details.webapp.entity.Qualification qualif = new com.details.webapp.entity.Qualification();
			qualif.setCourse(qualification.getCourse());
			qualif.setDegree(qualification.getDegree());
			qualif.setIntitution(qualification.getIntitution());
			qualif.setPassedWith(qualification.getPassedWith());
			qualif.setPercentage(qualification.getPercentage());
			qualif.setPeriod(qualification.getPeriod());
			qualif.setsNo(qualification.getsNo());
			qualifRepo.save(qualif);
			qualifList.add(qualif);
		}
		applicationForm.setQualificationList(qualifList);

		applicationForm.setReason(input.getReason());
		applicationForm.setResidencePhoneNo(input.getResidencePhoneNo());
		applicationForm.setShortGoal(input.getShortGoal());
		applicationForm.setStrengths(input.getStrengths());
		applicationForm.setValidity(input.getValidity());
		applicationForm.setWillingToTravel(input.isWillingToTravel());
		applicationForm.setStrengths(input.getStrengths());
		List<com.details.webapp.entity.Technologies> techList = new ArrayList<>();

		for (Technologies technologies : input.getTechnologiesList()) {

			com.details.webapp.entity.Technologies tech = new com.details.webapp.entity.Technologies();
			tech.setPrimarySkilDesc(technologies.getPrimarySkilDesc());
			tech.setPrimarySkill(technologies.getPrimarySkill());
			tech.setSecondarySkill(technologies.getSecondarySkill());
			tech.setSecondarySkilldesc(technologies.getSecondarySkilldesc());
			tech.setSno(technologies.getSno());
			technologyRepo.save(tech);
			techList.add(tech);
		}
		List<com.details.webapp.entity.ReleventWorkExp> workExpList = new ArrayList<>();

		for (com.details.webapp.pojo.ReleventWorkExp releventWorkExp : input.getRelewantWorkExp()) {
			com.details.webapp.entity.ReleventWorkExp releventWork = new com.details.webapp.entity.ReleventWorkExp();
			releventWork.setDesignation(releventWorkExp.getDesignation());
			releventWork.setFromDate(releventWorkExp.getFromDate());
			releventWork.setOrganisation(releventWorkExp.getOrganisation());
			releventWork.setReasonForLeaving(releventWorkExp.getReasonForLeaving());
			releventWork.setRole(releventWorkExp.getRole());
			releventWork.setsNo(releventWorkExp.getsNo());
			releventWork.setToDate(releventWorkExp.getToDate());
			releventWorkRepo.save(releventWork);
			workExpList.add(releventWork);
		}
		applicationForm.setTechnologiesList(techList);
		applicationForm.setRelewantWorkExp(workExpList);
		List<com.details.webapp.entity.Trainings> traingList = new ArrayList<>();

		for (com.details.webapp.pojo.Trainings train : input.getTrainingsList()) {
			com.details.webapp.entity.Trainings training = new com.details.webapp.entity.Trainings();
			training.setCourse(train.getCourse());
			training.setDegree(train.getDegree());
			training.setIntitution(train.getIntitution());
			training.setPassedWith(train.getPassedWith());
			training.setPercentage(train.getPercentage());
			training.setPeriod(train.getPeriod());
			training.setsNo(train.getsNo());
			trainingRepo.save(training);
			traingList.add(training);
		}
		applicationForm.setTrainingsList(traingList);
		applicationFormRepo.save(applicationForm);
		Gson g = new Gson();
		
		String s= g.toJson(applicationForm);
		System.out.println("sssssssssssssssssssssssssss"+s);
		return applicationForm;
		
		

	}

}
