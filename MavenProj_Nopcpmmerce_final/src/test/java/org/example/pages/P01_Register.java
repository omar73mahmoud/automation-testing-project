package org.example.pages;

import org.example.StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P01_Register {
    public WebElement RegisterPage(){
        return Hooks.driver.findElement(By.cssSelector("a[class=\"ico-register\"]"));
    }
    public WebElement Gender(){
        return Hooks.driver.findElement(By.cssSelector("input[id=\"gender-male\"]"));
    }
    public WebElement FirstName(){
        return Hooks.driver.findElement(By.cssSelector("input[id=\"FirstName\"]"));
    }
    public WebElement LastName(){
        return Hooks.driver.findElement(By.cssSelector("input[id=\"LastName\"]"));
    }
    public WebElement SelectDay(){
        return Hooks.driver.findElement(By.cssSelector("select[class=\"valid\"]"));
    }
    public WebElement SelectMonth(){
        return Hooks.driver.findElement(By.cssSelector("select[name=\"DateOfBirthMonth\"]"));
    }
    public WebElement SelectYear(){
        return Hooks.driver.findElement(By.cssSelector("select[name=\"DateOfBirthYear\"]"));
    }
    public WebElement Email(){
        return Hooks.driver.findElement(By.cssSelector("input[id=\"Email\"]"));
    }
    public WebElement Password(){
        return Hooks.driver.findElement(By.cssSelector("input[id=\"Password\"]"));
    }
    public WebElement ConfirmPassword(){
        return Hooks.driver.findElement(By.cssSelector("input[id=\"ConfirmPassword\"]"));
    }
    public WebElement RegisterButton(){
        return Hooks.driver.findElement(By.cssSelector("button[id=\"register-button\"]"));
    }


}
