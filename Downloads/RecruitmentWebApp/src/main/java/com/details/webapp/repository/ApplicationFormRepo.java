package com.details.webapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.details.webapp.entity.ApplicationForm;

public interface ApplicationFormRepo extends CrudRepository<ApplicationForm,String> {

}
