package org.example.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.Givun;
import org.example.pages.P03_homepage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class D04_searchStepDe {
    P03_homepage homepage= new P03_homepage();
    SoftAssert Soft=new SoftAssert();
@Given("user is on the home page")
    public void navigatetohomepage(){
    homepage.Navigatetohomepage();
    }
@When("User can search with productname")
public void iSearchForProduct(String productName) {
    homepage.searchProductByName(productName);

}
@Then("url must contain url of product")
public void urlContains(String expectedUrl) {
    String currentUrl = homepage.getCurrentUrl();

    Soft.assertTrue(currentUrl.contains(expectedUrl),
            "URL doesn't contain expected query: " + expectedUrl);
}
@And("Relevant search results are displayed")
public void relevantSearchResultsAreDisplayed() {
    List<WebElement> searchResults = homepage.getSearchResults();

    Soft.assertTrue(searchResults.size() > 0, "No search results found");
}
@And("each result contains the search word \"<ProductName>")
public void eachResultContainsTheSearchWord(String searchWord) {
    List<WebElement> searchResults = homepage.getSearchResults();
    for (WebElement result : searchResults) {
        String resultText = result.getText().toLowerCase();

        Soft.assertTrue(resultText.contains(searchWord.toLowerCase()),
                "Search word not found in result: " + resultText);
    }

}
    @When("I search for with SKU")
    public void iSearchForSKU(String sku) {
        homepage.searchProductBySKU(sku);
    }
    @And("I click on the first product in search results")
    public void iClickOnTheFirstProductInSearchResults() {
        homepage.clickFirstProduct();
    }
    @Given("the SKU shown on the product page contains the searched SKU")
            public void theSKUShownOnTheProductPageContainsTheSearchedSKU(String expectedSKU) {
        String actualSKU = homepage.getProductSKU();
        Soft.assertTrue(actualSKU.contains(expectedSKU),
                "Searched SKU not found on product page: " + actualSKU);
    }
}


