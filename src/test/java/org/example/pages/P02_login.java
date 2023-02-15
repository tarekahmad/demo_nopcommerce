package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.support.PageFactory;

public class P02_login {
    public P02_login(){
        PageFactory.initElements(Hooks.driver,this);
    }

}
