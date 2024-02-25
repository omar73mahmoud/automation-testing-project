package org.example.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_Login;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class D02_Login {
    P02_Login Login = new P02_Login();
    @Given("click on Login page")
    public void LoginPage(){
        Login.LoginPage().click();

    }
    @When("user enter your valid data in username and password")
    public void validLogin(){
        Login.Email().sendKeys("eomar73mahmoud@gamail.com");
        Login.Password().sendKeys("123456");
    }
    @And("click on Login button")
    public void LoginButton(){
        Login.LoginButton().click();
    }
    @Then("verify that user logined succssufully")
    public void AssertValidLogin(){
        SoftAssert Soft=new SoftAssert();
       Soft.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/");
       Soft.assertTrue(Hooks.driver.findElement(By.cssSelector("a[class=\"ico-account\"]")).isDisplayed());
       Soft.assertAll();
    }
    @When("user enter your invalid data in username and password")
    public void InvalidLogin(){
        Login.Email().sendKeys("eomar#55e5");
        Login.Password().sendKeys("0e*");
    }
    @Then("verify that user cant logined")
    public void AssertInvalidLogin(){
        SoftAssert Soft=new SoftAssert();
        Soft.assertTrue(Hooks.driver.findElement(By.cssSelector("div[class=\"message-error validation-summary-errors\"]")).isDisplayed());
        Soft.assertEquals(Hooks.driver.findElement(By.cssSelector("div[class=\"message-error validation-summary-errors\"]")).getCssValue("color"),"#e4434b");
        Soft.assertAll();
    }


}
