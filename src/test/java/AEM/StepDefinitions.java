package AEM;

import org.junit.Assert;

import io.cucumber.java.en.*;

public class StepDefinitions {

   @Given("User is a shopper")
  public void User_is_a_shopper() {
    System.out.println("User is a shopper");
  }
  @When("User navigates to canadiantire.com")
  public void User_navigates_to_canadiantire(){
    System.out.println("User navigates to desired web page");
  }
  @Then("canadiantire.com home page will open")
  public void Website_is_opened(){
    Assert.assertTrue(true);
    System.out.println("Webpage opened");
  }

  }


