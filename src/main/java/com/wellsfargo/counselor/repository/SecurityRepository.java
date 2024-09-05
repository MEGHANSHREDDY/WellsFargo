package com.wellsfargo.counselor.repository;

import com.wellsfargo.counselor.entity.Security;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecurityRepository extends JpaRepository<Security, Long> {
    // Custom query methods can be added here if needed
}
