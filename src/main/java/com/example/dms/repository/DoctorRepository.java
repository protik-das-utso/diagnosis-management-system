package com.example.dms.repository;

import com.example.dms.model.DoctorModel;
import com.example.dms.modelDto.DoctorModelDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends JpaRepository<DoctorModel, Long> {
    DoctorModel findByDoctorId(String doctorId);
}
