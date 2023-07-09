package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.CalculatorPage;

import java.io.IOException;

public class CalculatorSteps {
    CalculatorPage calculatorPage;

    public CalculatorSteps() {
        this.calculatorPage = new CalculatorPage();
    }

    @Given("I am on Calculator page")
    public void iAmOnCalculatorPage() throws IOException {
        calculatorPage.iAmOnCalculatorPage();
    }

    @When("I enter number {int}")
    public void iEnterNumber(int number) {
        calculatorPage.iEnterNumber(number);
    }

    @And("I click on operator {string}")
    public void iClickOnOperator(String operator) {
        calculatorPage.iClickOnOperator(operator);
    }

    @Then("I verify the result as {int}")
    public void iVerifyTheResultAs(int expectedResult) {
        String actualResult = calculatorPage.iVerifyTheResultAs();
        Assert.assertEquals(actualResult, String.valueOf(expectedResult));
        calculatorPage.tearDown();
    }
}
