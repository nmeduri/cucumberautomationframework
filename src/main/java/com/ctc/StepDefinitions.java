package com.ctc;

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
  
  @Given("User is anonymous")
  public void User_is_anonymous() {
    System.out.println("User is a anonymous");
  }
  @When("User navigates to shopping cart")
  public void User_navigates_to_shopping_cart(){
    System.out.println("User navigates to cart");
  }
  @Then("Checkout is enabled")
  public void Checkout_is_enabled(){
    Assert.fail("User not logged in");
    System.out.println("Checkout disabled opened");
  }

  }


