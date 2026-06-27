package com.wipro.bank.acc;

public class RDAccount extends Account {
    public RDAccount(int tenure, float principal) {
        this.tenure=tenure;
        this.principal=principal;
    }
    public float calculateAmountDeposited() {
        return principal*tenure*12;
    }
    public float calculateInterest() {
        int months=tenure * 12;
        float r=rateOfInterest;
        return (principal*months*(months+1)*r)/(2*12*100);
    }
    public float calculateMaturityAmount() {
        return calculateAmountDeposited()+calculateInterest();
    }
}
