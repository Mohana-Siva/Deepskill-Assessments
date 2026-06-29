-- Scenario 1: Apply 1% Discount to Loan Interest Rate for Customers Above 60
BEGIN
    FOR c IN (
        SELECT customer_id, age
        FROM customers
    )
    LOOP
        IF c.age > 60 THEN
            UPDATE loans
            SET interest_rate = interest_rate - 1
            WHERE customer_id = c.customer_id;
        END IF;
    END LOOP;

    COMMIT;
END;
/

-- Scenario 2: Set VIP Status for Customers with Balance Above $10,000

BEGIN
    FOR c IN (
        SELECT customer_id, balance
        FROM customers
    )
    LOOP
        IF c.balance > 10000 THEN
            UPDATE customers
            SET isvip = 'TRUE'
            WHERE customer_id = c.customer_id;
        END IF;
    END LOOP;

    COMMIT;
END;
/

-- Scenario 3: Print Reminder for Loans Due Within Next 30 Days
BEGIN
    FOR l IN (
        SELECT customer_id, loan_id, due_date
        FROM loans
        WHERE due_date BETWEEN SYSDATE AND SYSDATE + 30
    )
    LOOP
        DBMS_OUTPUT.PUT_LINE(
            'Reminder: Customer ' || l.customer_id ||
            ' has Loan ' || l.loan_id ||
            ' due on ' || l.due_date
        );
    END LOOP;
END;
/