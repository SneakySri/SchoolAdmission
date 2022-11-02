package com.SchoolAdmission.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SchoolAdmission.model.Students;

@Repository
public interface StudentRepository extends JpaRepository<Students,Long>{

}
