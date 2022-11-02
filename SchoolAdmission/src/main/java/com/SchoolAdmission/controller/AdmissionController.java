package com.SchoolAdmission.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.SchoolAdmission.controller.AdmissionForm.AdmissionForm;
import com.SchoolAdmission.model.Admission;
import com.SchoolAdmission.respository.AdmissionRepository;
import com.SchoolAdmission.service.AdmissionService;



@RestController
public class AdmissionController {
	
	@Autowired
	private AdmissionService Adservice;
	

	@Autowired
	private AdmissionRepository adRepo;
	
	
	
	@GetMapping("/test")
	public String test() {
		return "working......";
	}
	
	@PostMapping("/add")
	public String Admissions(@RequestBody AdmissionForm adForm) {
		return Adservice.admission(adForm);
		
	}
	
		
	@GetMapping("/view")
	public ModelAndView getAdmissions() {
		List<Admission> admissions = adRepo.findAll();
		HashMap<String, List<Admission>> model = new HashMap<>();
		model.put("list", admissions);
		return new ModelAndView("admissionLst",model);
	}
//	
//	@PostMapping("/ad")
//	public String submit(@ModelAttribute("stud") Admission admission) {
//		System.out.println(admission);
//		return "Registered......";
//		
//	}
	
	@GetMapping("/elite")
	public ModelAndView home() {
		return new ModelAndView("home");
		
	}
	
	
	@RequestMapping("/save")
	public ModelAndView save(@ModelAttribute("stud") AdmissionForm admission) {
		System.out.println(admission);
		Adservice.admission(admission);
//		adRepo.save(admission);
		
		return new ModelAndView("home");
	}
	
	@RequestMapping("/register")
	public ModelAndView showForm(Model model) {
		Admission admission=new Admission();
		model.addAttribute("stud", admission);
		return new ModelAndView("temp");
	}
	
	@PutMapping("/update/{id}")
	public ModelAndView update(@PathVariable Long id,Model model) {
		Admission admission=Adservice.getAdmissionById(id);
		model.addAttribute("update",admission);
		return new ModelAndView("update");
		
	}
	
	@GetMapping("/delete/{id}")
	public ResponseEntity<Admission> delete(@PathVariable String id) {
		Long i=Long.parseLong(id);
		Admission admission=Adservice.getAdmissionById(i);
		System.out.println(admission);
		adRepo.findById(i).ifPresent(adRepo::delete);
		return ResponseEntity.ok().build();
		
	}

}	
//	
//@DeleteMapping("/delete/{id}")
//public ResponseEntity<Patient> delete(@PathVariable Long id){
//	
//	patRepo.findById(id).ifPresent(patRepo::delete);
//	return ResponseEntity.ok().build();	
//}


