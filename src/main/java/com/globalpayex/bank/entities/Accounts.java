package com.globalpayex.bank.entities;

import com.globalpayex.bank.exceptions.LowBalanceException;

import java.util.Optional;

public class Accounts {

    private int accNumber;
    private AccType accType;    //using an enum as a data type
    private double balance;

    public static final String ACCTYPE_SAVINGS = "Savings";
    public static final String ACCTYPE_CURRENT = "Current";


    public Accounts() {}

    public Accounts(int accNumber, AccType accType, double balance) {
        this.accNumber = accNumber;
        this.accType = accType;
        this.balance = balance;
    }

    public double withDraw(double amount) throws LowBalanceException{

        try{
            System.out.println("Transaction Starts");
            if (amount <= 0) {
                throw new IllegalArgumentException("Amount must be positive and non-zero");
            }


            if ((this.balance - amount) <= 1000) {
//            throw new IllegalStateException("Low Balance");
                throw new LowBalanceException("Account getting into low Balance");
            }

            this.balance = this.balance - amount;
            return this.balance;
        }
        finally{
            System.out.println("Transaction Ends");
        }
    }

    public double deposit(double amount){
        this.balance = this.balance + amount;
        return this.balance;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }

    public AccType getAccType() {
        return accType;
    }

    public void setAccType(AccType accType) {
//        if(accType.equals(Accounts.ACCTYPE_SAVINGS) || accType.equals(Accounts.ACCTYPE_CURRENT)){
//            this.accType = accType;
//        }
    }

    public double getBalance() {
        return balance;
    }


    public void setBalance(double balance) {
        this.balance = balance;
    }


    public Optional<String> getDetails(){
        if(accNumber == 0) {
            return Optional.empty();
        }



        return Optional.of(String.format("Account Number: %s\nAccount Type= %s\nbalance= %s",this.accNumber,this.accType,this.balance));

    }

}
