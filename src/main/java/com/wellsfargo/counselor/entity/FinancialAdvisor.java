package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class FinancialAdvisor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long advisorId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String contactInfo;

    // Constructors, getters, and setters

    public FinancialAdvisor() {}

    public FinancialAdvisor(String name, String contactInfo) {
        this.name = name;
        this.contactInfo = contactInfo;
    }

    public Long getAdvisorId() {
        return advisorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }
}
