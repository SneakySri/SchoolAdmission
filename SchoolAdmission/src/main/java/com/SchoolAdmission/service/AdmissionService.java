package com.SchoolAdmission.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.SchoolAdmission.controller.AdmissionForm.AdmissionForm;
import com.SchoolAdmission.model.Admission;
import com.SchoolAdmission.model.Students;
import com.SchoolAdmission.respository.AdmissionRepository;
import com.SchoolAdmission.respository.StudentRepository;
import com.fasterxml.jackson.databind.ObjectMapper;


@Service
@Transactional
public class AdmissionService {
	
	@Autowired
	private AdmissionRepository adRepo;
	
	@Autowired
	private StudentRepository stRepo;
	
	public String admission(AdmissionForm admission) {
		
		Admission ad=new ObjectMapper().convertValue(admission, Admission.class);
		
		Long adNumber=adRepo.save(ad).getId();
		
		System.out.println("Saved Sucessfully");
		
		Students st=new Students(100L,adNumber);
		
		Long stNumber=stRepo.save(st).getRegnum();
		
		return "Admission is confirmed.. "+stNumber;
		
	}

	public Admission getAdmissionById(Long id) {
		// TODO Auto-generated method stub
		for(Long i=0L;i<=id;i++) {
			if(adRepo.findById(i).equals(id)) {
				Admission ad=adRepo.getById(id);
				return ad;
			}
		}
		return null;
	}

}
