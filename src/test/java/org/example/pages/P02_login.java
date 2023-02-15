package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P02_login {
    public P02_login(){
        PageFactory.initElements(Hooks.driver,this);
    }

    @FindBy(className=("ico-login"))
    public WebElement loginlink;
    @FindBy(id=("Email"))
    public WebElement Email;
    @FindBy(id=("Password"))
    public WebElement Password;
    @FindBy(className=("button-1 login-button"))
    public WebElement loginbutton;
    @FindBy(className=("result"))
    public WebElement succesmessage;





}
