package org.example.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homepage;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D05_hoverCategoriesStepDef {
    P03_homepage homepage= new P03_homepage();
    SoftAssert Soft=new SoftAssert();
    @Given("User is on the Home page")
    public void userinhomepage(){

        homepage.Navigatetohomepage();
    }

@When("User hover on random category")
    public void hoveronrandomcategory(){
        homepage.Hoveroncategory();
}
@And("user Click on random subcategory")
    public void clickonsubcategory(){
        homepage.selectsubcategory();
}
@Then("verify that category are the same of subcategory title")
public void assertinsubcategory(){
homepage.assertsubcategory();
}
}
