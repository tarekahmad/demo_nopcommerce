package org.example.stepDefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_Register;
import org.example.pages.P02_login;
import org.openqa.selenium.By;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;
public class D02_loginStepDef {
    P02_login Login=new P02_login();

    @Given("user go to login page")
    public void user_go_to_login_page() {
        Login.loginlink.click();

    }

    @When("user login with {string} {string} and {string}")
    public void userLoginWithAnd(String arg0, String arg1, String arg2) {

    }

    @And("user press on login button")
    public void userPressOnLoginButton() {

    }

    @Then("user login to the system successfully")
    public void userLoginToTheSystemSuccessfully() {
    }


    @Then("user could not login to the system")
    public void userCouldNotLoginToTheSystem() {

    }


}
