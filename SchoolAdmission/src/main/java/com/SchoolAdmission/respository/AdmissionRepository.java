package com.SchoolAdmission.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SchoolAdmission.model.Admission;

@Repository
public interface AdmissionRepository extends JpaRepository<Admission,Long> {

}
