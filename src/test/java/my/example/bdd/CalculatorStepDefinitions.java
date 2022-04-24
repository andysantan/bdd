package my.example.bdd;

import com.google.inject.Inject;
import io.cucumber.guice.ScenarioScoped;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import my.example.bdd.calculator.Calculator;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@ScenarioScoped
public class CalculatorStepDefinitions {

    private final Calculator calculator;

    @Inject
    public CalculatorStepDefinitions(Calculator calculator) {
        this.calculator = calculator;
    }

    private Integer total;

    @Given("I have a calculator")
    public void i_have_a_calculator() {
        assertNotNull(calculator);
    }

    @When("I add {int} and {int}")
    public void i_add_and(Integer a, Integer b) {
        total = calculator.add(a,b);
    }

    @Then("I should get {int}")
    public void i_should_get(Integer expectedResult) {
        assertEquals(expectedResult, calculator.getResult());;
    }

}
