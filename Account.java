package com.wipro.bank.acc;



abstract class Account {

	int tenure;

	float principal;

	float rateOfInterest;

	  public float getRateOfInterest() {

	        return rateOfInterest;

	    }

 public void setInterest(int age,String gender)

 {

	 if(gender.equals("male") && age<60) {

		 this.rateOfInterest=(float)9.8;

	 }

	 else if(gender.equals("male") && age>=60) {

		 this.rateOfInterest=(float)10.5;

	 }

	 else if(gender.equals("female") && age<58) {

		 this.rateOfInterest=(float)10.2;

	 }

	 else if(gender.equals("female") && age>=58) {

		 this.rateOfInterest=(float)10.8;

	 }}

	 public float calculateMaturityAmount(float totalprincipleDeposited,float maturityInterest)

	 {

		 return totalprincipleDeposited+maturityInterest;

	 }

	 public abstract float calculateInterest();

	 public abstract float calculateAmountDeposited();

}







