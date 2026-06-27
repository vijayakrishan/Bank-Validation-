
package com.wipro.bank.acc;
public class RDAccount extends Account {
	public RDAccount(int tenure,float principal) {

		this.tenure=tenure;

		this.principal=principal;

	}

public float calculateInterest() {

	

	float p=calculateAmountDeposited();

	float r=rateOfInterest/100;

	int n=12;

	int t=tenure;

	return (float)(p*(Math.pow((1+r/n),n*t)-1));

}



public float calculateAmountDeposited() {

 return principal*tenure*12;

}

}