package com.details.webapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.details.webapp.entity.Trainings;

public interface TrainingRepo extends CrudRepository<Trainings, Long> {

}
