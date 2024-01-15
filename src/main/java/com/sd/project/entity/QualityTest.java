package com.sd.project.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="QualityTest")
public class QualityTest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idQualityTest;
    private double testResults;
    private Date testDate;
    @ManyToOne()
    @JoinColumn(name = "TesterId")
    Employee employee;

    public QualityTest(long idQualityTest, double testResults, Date testDate) {
        this.idQualityTest = idQualityTest;
        this.testResults = testResults;
        this.testDate = testDate;
    }

    public QualityTest(){

    }

    public long getIdQualityTest() {
        return idQualityTest;
    }

    public void setIdQualityTest(long idQualityTest) {
        this.idQualityTest = idQualityTest;
    }

    public double getTestResults() {
        return testResults;
    }

    public void setTestResults(double testResults) {
        this.testResults = testResults;
    }

    public Date getTestDate() {
        return testDate;
    }

    public void setTestDate(Date testDate) {
        this.testDate = testDate;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    
    
    
}
