package cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class StepDefinitions {

    double acctBalance = 0.0f;

    @Given("account balance is {double}")
    public void givenAccountBalance(Double initialBalance) {
        acctBalance = initialBalance;
    }

    @When("the account is {word} with {double}")
    public void modifyAccount(String action, Double amount) {
        if (action.equals("credited")) {
            acctBalance += amount;
        } else {
            acctBalance -= amount;
        }
    }

    @Then("account should have a balance of {double}")
    public void checkAccount(Double expectedBalance) {
        Assertions.assertEquals(acctBalance ,expectedBalance);
    }

}