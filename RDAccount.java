package com.wipro.bank.acc;

public class RDAccount extends Account {
    public RDAccount(int tenure, float principal) {
        this.tenure = tenure;
     this.principal = principal;
    }
    public float calculateInterest() {
        int months = tenure * 12;
        double i = rateOfInterest / (12 * 100);
        double maturityAmount =
        principal * ((Math.pow(1 + i, months) - 1) / i);
        float totalDeposited = calculateAmountDeposited();
        return (float) (maturityAmount - totalDeposited);
    }
    public float calculateAmountDeposited() {
        return principal * tenure * 12;
    }
}
