package org.example.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_Register;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class D01_Register {
    P01_Register Register=new P01_Register();
@Given("click on register page")
    public void RegisterPage(){
    Register.RegisterPage().click();

}
@When("user enter your valid data in all fields")
    public void ValidData(){
    Register.Gender().click();
    Register.FirstName().sendKeys("Omar");
    Register.LastName().sendKeys("Mahmoud");
    Select ListDay=new Select(Register.SelectDay());
    ListDay.selectByIndex(12);
    Select ListMonth=new Select(Register.SelectMonth());
    ListMonth.selectByVisibleText("march");
    Select ListYear=new Select(Register.SelectYear());
    ListMonth.selectByValue("1998");
    Register.Email().sendKeys("eomar73mahmoud@gmail.com");
    Register.Password().sendKeys("123456");
    Register.Password().sendKeys("1234567");
}
@And("click on register button")
    public void RegisterButton(){
    Register.RegisterButton().click();
}
@Then("verify that sucess message is displayed")
    public void VaidRegisterAssert(){
    SoftAssert Soft=new SoftAssert();
    Soft.assertTrue(Hooks.driver.findElement(By.cssSelector("div[class=\"result\"]")).isDisplayed());
  Soft.assertEquals(Hooks.driver.findElement(By.cssSelector("div[class=\"result\"]")).getCssValue("color"),"rgba(76,177,124,1)");
  Soft.assertAll();
}
}
