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

    @When("the account is credited with {double}")
    public void creditAccount(Double credit) {
        acctBalance += 10.0;
    }

    @Then("account should have a balance of {double}")
    public void checkAccount(Double expectedBalance) {
        Assertions.assertEquals(acctBalance ,expectedBalance);
    }



}