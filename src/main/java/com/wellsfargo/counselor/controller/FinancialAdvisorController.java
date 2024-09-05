package com.wellsfargo.counselor.controller;

import com.wellsfargo.counselor.entity.FinancialAdvisor;
import com.wellsfargo.counselor.repository.FinancialAdvisorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/advisors")
public class FinancialAdvisorController {

    @Autowired
    private FinancialAdvisorRepository financialAdvisorRepository;

    // Endpoint to create a new advisor
    @PostMapping
    public FinancialAdvisor createAdvisor(@RequestBody FinancialAdvisor financialAdvisor) {
        return financialAdvisorRepository.save(financialAdvisor);
    }

    // Endpoint to retrieve all advisors
    @GetMapping
    public List<FinancialAdvisor> getAllAdvisors() {
        return financialAdvisorRepository.findAll();
    }

    // Endpoint to retrieve an advisor by ID
    @GetMapping("/{id}")
    public FinancialAdvisor getAdvisorById(@PathVariable Long id) {
        Optional<FinancialAdvisor> advisor = financialAdvisorRepository.findById(id);
        return advisor.orElseThrow(() -> new RuntimeException("Financial Advisor not found with id: " + id));
    }
    // Endpoint to delete an advisor by ID
    @DeleteMapping("/{id}")
    public void deleteAdvisor(@PathVariable Long id) {
        financialAdvisorRepository.deleteById(id);
    }
}
