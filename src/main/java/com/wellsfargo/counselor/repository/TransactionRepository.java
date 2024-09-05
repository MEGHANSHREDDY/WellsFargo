package com.wellsfargo.counselor.repository;

import com.wellsfargo.counselor.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    // You can define custom query methods here if needed
}
