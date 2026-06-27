package com.wipro.bank.service;



import com.wipro.bank.acc.RDAccount;

import com.wipro.bank.exception.BankValidationException;



public class BankService {



    public boolean validateData(float principal, int tenure, int age, String gender)

            throws BankValidationException {

        if (principal >= 500 &&

            (tenure == 5 || tenure == 10) &&

            (gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("female")) &&

            (age >= 1 && age <= 100)) {



            return true;

        } else {

            throw new BankValidationException();

        }

    } 

        public void calculate(float principal, int tenure,int age, String gender) {

            try {

                if (validateData(principal, tenure, age, gender)) {

                    RDAccount rda = new RDAccount(tenure, principal);

                    rda.setInterest(age, gender);

                    System.out.println("Rate of Interest : "+ rda.getRateOfInterest());

                    float interest = rda.calculateInterest();

                    System.out.println("Interest : " + interest);

                    float amountDeposited =rda.calculateAmountDeposited();

                    System.out.println("Amount Deposited : "+ amountDeposited);

                    float maturityAmount =rda.calculateMaturityAmount(amountDeposited, interest);

                    System.out.println("Maturity Amount : "+ maturityAmount);

                }

            } catch (BankValidationException e) {

                System.out.println(e.getMessage());

            }

        }

    }