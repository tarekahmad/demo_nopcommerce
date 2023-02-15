package org.example.stepDefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_Register;
import org.openqa.selenium.By;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class D01_registerStepDef {
    P01_Register register=new P01_Register();

    @Given("user go to register page")
    public void user_go_to_register_page() {
        register.registerlink.click();

    }


    @When("user select ginder")
    public void userSelectGinder() {
        register.MaleGender.click();
    }

    @And("user enters name {string}& {string}")
    public void userEnters(String FirstName, String LastName) {
        register.FirstName.sendKeys(FirstName);
        register.LastName.sendKeys(LastName);

    }

    @And("user select date of birth")
    public void userSelectDateOfBirth() {
        Select selectDay=new Select(register.Day);
        selectDay.selectByValue("6");
        Select selectMonth=new Select(register.Month);
        selectMonth.selectByValue("6");
        Select selectYear=new Select(register.Year);
        selectYear.selectByValue("1991");

    }


    @And("user enters email {string}")
    public void userEntersEmail(String Email) {
        Faker fake=new Faker();
        register.Email.sendKeys(fake.internet().safeEmailAddress());

    }

    @And("user enters password {string} and confirms")
    public void userEntersPasswordAndConfirms(String Password) {
        register.Password.sendKeys(Password);
        register.ConfirmPassword.sendKeys(Password);

    }

    @And("user click register")
    public void userClickRegister() {
        register.registerbutton.click();

    }

    @Then("Account created")
    public void accountCreated() {
        SoftAssert soft=new SoftAssert();
        soft.assertTrue(register.succesmessage.getText().toLowerCase().contains("your registration completed"));
        String actualcolor=register.succesmessage.getCssValue("color");
        actualcolor=Color.fromString(actualcolor).asHex();
        soft.assertEquals(actualcolor,"#4cb17c");
        soft.assertAll();

    }
}
