Feature: Cash Withdrawal
    Scenario: successful withdrawal from an account in credit
        Given I have deposited Rs.100.00 in my account
        When I withdraw Rs.20
        Then Rs.20 should be dispensed
