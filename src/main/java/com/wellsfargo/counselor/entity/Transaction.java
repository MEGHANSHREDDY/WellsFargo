package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transactionId;

    @Column(nullable = false)
    private String type;  // Buy or Sell

    @Column(nullable = false)
    private String transactionDate;

    @Column(nullable = false)
    private double amount;

    // Many transactions are related to one security
    @ManyToOne
    @JoinColumn(name = "securityId", nullable = false)
    private Security security;

    // Constructor with parameters (excluding ID, since it's auto-generated)
    public Transaction(String type, String transactionDate, double amount, Security security) {
        this.type = type;
        this.transactionDate = transactionDate;
        this.amount = amount;
        this.security = security;
    }

    // Default constructor for JPA
    public Transaction() {}

    // Getters and Setters

    public Long getTransactionId() {
        return transactionId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Security getSecurity() {
        return security;
    }

    public void setSecurity(Security security) {
        this.security = security;
    }
}
