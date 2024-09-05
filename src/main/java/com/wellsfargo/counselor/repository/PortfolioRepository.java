package com.wellsfargo.counselor.repository;

import com.wellsfargo.counselor.entity.Portfolio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PortfolioRepository extends JpaRepository<Portfolio, Long> {
    // Custom query methods can be added here if needed
}
