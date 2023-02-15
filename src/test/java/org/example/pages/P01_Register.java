package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.openqa.selenium.By.className;

public class P01_Register {
   public P01_Register(){
       PageFactory.initElements(Hooks.driver,this);
   }

   @FindBy(className=("ico-register"))
    public WebElement registerlink;
    @FindBy(id=("gender-male"))
    public WebElement MaleGender;
    @FindBy(id=("FirstName"))
    public WebElement LastName;
    @FindBy(id=("LastName"))
    public WebElement FirstName;
    @FindBy(name=("DateOfBirthDay"))
    public WebElement Day;
    @FindBy(name=("DateOfBirthMonth"))
    public WebElement Month;
    @FindBy(name=("DateOfBirthYear"))
    public WebElement Year;
    @FindBy(id=("Email"))
    public WebElement Email;
    @FindBy(id=("Password"))
    public WebElement Password;
    @FindBy(id=("ConfirmPassword"))
    public WebElement ConfirmPassword;
    @FindBy(id=("register-button"))
    public WebElement registerbutton;
    @FindBy(className=("result"))
    public WebElement succesmessage;


}
