Feature: Cash Withdrawal
    Scenario: successful withdrawal from an account in credit
        Given my account has been credit with Rs.100.00
        When I withdraw Rs.20
        Then Rs.20 should be dispensed
        And the balance of my account should be Rs.80.00
