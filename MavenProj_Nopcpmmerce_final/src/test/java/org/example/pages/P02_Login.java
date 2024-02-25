package org.example.pages;

import org.example.StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02_Login {
public WebElement LoginPage(){
    return Hooks.driver.findElement(By.cssSelector("a[class=\"ico-login\"]"));
}
    public WebElement Email(){
        return Hooks.driver.findElement(By.cssSelector("input[id=\"Email\"]"));
    }
    public WebElement Password(){
        return Hooks.driver.findElement(By.cssSelector("input[id=\"Password\"]"));
    }
    public WebElement LoginButton(){
        return Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 login-button\"]"));
    }
}
