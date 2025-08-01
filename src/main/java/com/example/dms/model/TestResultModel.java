package com.example.dms.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "test_results")
public class TestResultModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String testResultId;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private PatientModel patient;

    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private DoctorModel doctor;

    @ManyToOne
    @JoinColumn(name = "labAssist_id")
    private LabAssistantModel labAssistant;

    private String result;
    private String report;
    private String status;

    private String createdAt;
}