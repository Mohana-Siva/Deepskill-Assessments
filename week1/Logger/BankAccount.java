package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BankAccount {

    private static final Logger logger = LoggerFactory.getLogger(BankAccount.class);

    private int balance = 1000;

    public void withdraw(int amount) {

        if (amount > balance) {
            logger.error("Insufficient balance. Need {} more for valid transaction", (amount-balance));
            return;
        }

        if (amount > 500) {
            logger.warn("Large withdrawal of Rs.{}", amount);
        }

        balance -= amount;

        logger.info("Withdrawal successful. Remaining balance: {}", balance);
    }
}