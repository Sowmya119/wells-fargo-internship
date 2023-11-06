package com.wellsfargo.counselor.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;


@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;

    @OneToMany(targetEntity = Security.class)
    private List portfolioSecurity;

    public List getPortfolioSecurity() {
        return portfolioSecurity;
    }
    public void setPortfolioSecurity() {
        this.portfolioSecurity = portfolioSecurity;
    }


    public Portfolio() {

    }

    public Long getPortfolioId() {
        return portfolioId;
    }
}
