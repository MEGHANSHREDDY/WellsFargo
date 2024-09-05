package com.wellsfargo.counselor.service;

import com.wellsfargo.counselor.entity.Security;
import com.wellsfargo.counselor.repository.SecurityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SecurityService {

    @Autowired
    private SecurityRepository securityRepository;

    public List<Security> getAllSecurities() {
        return securityRepository.findAll();
    }

    public Security getSecurityById(Long id) {
        return securityRepository.findById(id).orElse(null);
    }

    public Security saveSecurity(Security security) {
        return securityRepository.save(security);
    }

    public void deleteSecurity(Long id) {
        securityRepository.deleteById(id);
    }
}
