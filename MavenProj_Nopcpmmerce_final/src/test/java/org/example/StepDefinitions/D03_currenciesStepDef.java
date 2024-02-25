package org.example.StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homepage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.sql.SQLOutput;
import java.util.List;

public class D03_currenciesStepDef {
    P03_homepage homepage= new P03_homepage();
    @Given("Ensure that user is in home page")
    public void userIsONtheHomePage(){
       homepage.Navigatetohomepage();
    }
    @When("select Euro currency from drobdown")
    public void SelectEuroCurrency(){
        Select listCurrencies=new Select(homepage.SelectCurrencies());
        listCurrencies.selectByValue("Euro");


    }
@Then("verify euro symbol is shown on 4 products displayed in home page")
    public void eurodispalonAllProducts() {
    List<WebElement> PRODUCTS = Hooks.driver.findElements(By.cssSelector("div[class=\"product-item\"]"));

    for (WebElement PRODUCT : PRODUCTS) {
       String Eurosymbol= PRODUCT.getText();
       Assert.assertTrue(Eurosymbol.contains("$"));
    }
}
    }

      
 








