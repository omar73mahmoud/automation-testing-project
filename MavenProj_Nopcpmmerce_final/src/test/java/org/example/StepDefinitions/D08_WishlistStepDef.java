package org.example.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homepage;
import org.openqa.selenium.By;

public class D08_WishlistStepDef {
    P03_homepage homepage= new P03_homepage();
    @Given("User is on the homepage of the website")
    public void navigatetohomepage(){
        homepage.Navigatetohomepage();
    }
    @When("User clicks on the wishlist button for the product \"HTC One M8 Android L 5.0 Lollipop\"")
    public void addproducttowishlist(){
homepage.addproductwishlist();
    }
    @Then("Success message \"The product has been added to your wishlist\" is displayed with green background color")
    public void assertproductadded(){
        homepage.assertaddedofproduct();
    }
    @And("User waits for the success message to disappear")
    public void assertddissapersucessmessage(){

    }
   @And("User clicks on Wishlist tab")
    public void clickONWishlist(){
Hooks.driver.findElement(By.cssSelector("a[class=\"ico-wishlist\"]")).click();
   }
   @Then("Quantity of products in the wishlist is greater than 0")
    public void checkquantityinwishlist(){
        homepage.quantiesofWishlist();
    }
}
