package com.wellsfargo.counselor.service;

import com.wellsfargo.counselor.entity.FinancialAdvisor;
import com.wellsfargo.counselor.repository.FinancialAdvisorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FinancialAdvisorService {

    @Autowired
    private FinancialAdvisorRepository financialAdvisorRepository;

    public List<FinancialAdvisor> getAllFinancialAdvisors() {
        return financialAdvisorRepository.findAll();
    }

    public FinancialAdvisor getFinancialAdvisorById(Long id) {
        return financialAdvisorRepository.findById(id).orElse(null);
    }

    public FinancialAdvisor saveFinancialAdvisor(FinancialAdvisor financialAdvisor) {
        return financialAdvisorRepository.save(financialAdvisor);
    }

    public void deleteFinancialAdvisor(Long id) {
        financialAdvisorRepository.deleteById(id);
    }
}
