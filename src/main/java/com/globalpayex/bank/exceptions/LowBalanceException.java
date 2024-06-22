package com.globalpayex.bank.exceptions;

public class LowBalanceException extends Exception{

    public LowBalanceException(String message) {
        super(message);
    }

}
