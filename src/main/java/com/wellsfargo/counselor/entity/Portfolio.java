package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import java.util.Set;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long portfolioId;

    @Column(nullable = false)
    private String creationDate;

    // One portfolio belongs to one client
    @OneToOne
    @JoinColumn(name = "clientId", nullable = false)
    private Client client;

    // One portfolio can contain many securities
    @OneToMany(mappedBy = "portfolio", cascade = CascadeType.ALL)
    private Set<Security> securities;

    // Constructor
    public Portfolio(String creationDate, Client client) {
        this.creationDate = creationDate;
        this.client = client;
    }

    // Default constructor for JPA
    public Portfolio() {}

    // Getters and Setters
    public Long getPortfolioId() {
        return portfolioId;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Set<Security> getSecurities() {
        return securities;
    }

    public void setSecurities(Set<Security> securities) {
        this.securities = securities;
    }
}
