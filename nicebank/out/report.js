$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/withdraw.feature");
formatter.feature({
  "line": 1,
  "name": "Cash Withdrawal",
  "description": "",
  "id": "cash-withdrawal",
  "keyword": "Feature"
});
formatter.before({
  "duration": 405707849,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "successful withdrawal from an account in credit",
  "description": "",
  "id": "cash-withdrawal;successful-withdrawal-from-an-account-in-credit",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "my account has been credit with Rs.100.00",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I withdraw Rs.20",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "Rs.20 should be dispensed",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "the balance of my account should be Rs.80.00",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Rs.100.00",
      "offset": 32
    }
  ],
  "location": "AccountSteps.myAccountHasBeenCreditWithRs(Money)"
});
formatter.result({
  "duration": 140442015,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "20",
      "offset": 14
    }
  ],
  "location": "TellerSteps.iWithdrawRs(int)"
});
formatter.result({
  "duration": 1905385152,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "20",
      "offset": 3
    }
  ],
  "location": "CashSlotSteps.rsShouldBeDispensed(int)"
});
formatter.result({
  "duration": 1861496,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Rs.80.00",
      "offset": 36
    }
  ],
  "location": "AccountSteps.theBalanceOfMyAccountShouldBeRs(Money)"
});
formatter.result({
  "duration": 153527,
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 109451198,
  "status": "passed"
});
formatter.after({
  "duration": 11210355,
  "status": "passed"
});
});