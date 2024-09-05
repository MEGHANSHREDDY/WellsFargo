package com.wellsfargo.counselor.controller;

import com.wellsfargo.counselor.entity.Portfolio;
import com.wellsfargo.counselor.service.PortfolioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/portfolios")
public class PortfolioController {

    @Autowired
    private PortfolioService portfolioService;

    @GetMapping
    public List<Portfolio> getAllPortfolios() {
        return portfolioService.getAllPortfolios();
    }

    @GetMapping("/{id}")
    public Portfolio getPortfolioById(@PathVariable Long id) {
        return portfolioService.getPortfolioById(id);
    }

    @PostMapping
    public Portfolio createPortfolio(@RequestBody Portfolio portfolio) {
        return portfolioService.savePortfolio(portfolio);
    }

    @DeleteMapping("/{id}")
    public void deletePortfolio(@PathVariable Long id) {
        portfolioService.deletePortfolio(id);
    }
}
