package com.globalpayex.bank.entities;

import com.globalpayex.bank.exceptions.LowBalanceException;
import org.junit.jupiter.api.Test;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

class AccountsTest {

    @Test
    void testAccount()  {
        Accounts a1 = new Accounts(1234, AccType.Savings, 10000);
        var expected = 15000;
        double bal = a1.deposit(5000);
        assertEquals(expected, bal);


        try {
            bal = a1.withDraw(4000);
        } catch (LowBalanceException e) {
            System.out.println(e.getMessage());
        }
        assertEquals(11000, bal);

        a1
                .getDetails()
                .ifPresent(details -> System.out.println(details.toUpperCase()));
//        System.out.println(a1.getDetails());

    }

    @Test
    void testEmptyAccount() {
        var account = new Accounts();
        assertEquals(0.0, account.getBalance());

        account
                .getDetails()
                .ifPresentOrElse(details -> System.out.println(details.toUpperCase()), () -> System.out.println("Account Not Initialized"));

//        String details = account.getDetails();

//        //Null Pointer Check
//        if(details != null){
//            System.out.println(details.toUpperCase());
//        }
//        else {
//            System.out.println("Account not Initialized");
//        }
    }

    @Test
    void testNegativeAmountWithdrawal(){
        Accounts a1 = new Accounts(1234, AccType.Savings, 10000);
        assertThrows(
                IllegalArgumentException.class,
                () -> a1.withDraw(-9000)
        );
    }

    @Test
    void testLowBalance(){
        Accounts a1 = new Accounts(1234, AccType.Savings, 1000);
        assertThrows(
                LowBalanceException.class,
                () -> a1.withDraw(2000)
        );
    }

}