package com.taile.StepDefs;

import com.taile.BaseClass;
import com.taile.PageObjects.LoginPage;
import com.taile.Utils.PropertiesUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Properties;

public class LoginStefDefs extends BaseClass {

    Properties propertiesUser = PropertiesUtils.loadUserProperties();
    @Given("User enters valid username into the username field")
    public void userEntersValidUsernameIntoTheUsernameField() {
        String userName = propertiesUser.getProperty("username");
        LoginPage.enterUserName(userName);
    }

    @And("User enters valid password into the password field")
    public void userEntersValidPasswordIntoThePasswordField() {
        String userName = propertiesUser.getProperty("password");
        LoginPage.enterPassword(userName);
    }

    @When("User clicks on the login button")
    public void userClicksOnTheLoginButton() {
        LoginPage.clickOnLogin();
    }

    @Then("User is logged in successfully")
    public void userIsLoggedInSuccessfully() {
    }

    @Given("User enters invalid username into the username field")
    public void userEntersInvalidUsernameIntoTheUsernameField() {
    }

    @And("User enters invalid password into the password field")
    public void userEntersInvalidPasswordIntoThePasswordField() {
    }

    @Then("User is not logged in successfully")
    public void userIsNotLoggedInSuccessfully() {
    }
}
