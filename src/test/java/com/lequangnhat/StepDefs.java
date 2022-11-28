package com.lequangnhat;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;


public class StepDefs {
    private User user;
    private boolean isLogged;

    @Given("I enter user {string}")
    public void enterUsername(String username) {
            user = new User();
            user.setUsername(username);
    }

    @Given("I enter password {string}")
    public void enterPassword(String password) {
        user.setPassword(password);
    }

    @When("I click login button")
    public void login() {
        AuthorUser authorUser = new AuthorUser();
        authorUser.login(user);
    }

    @Then("I login success")
    public void verify(){
        Assert.assertTrue(isLogged);
    }
}
