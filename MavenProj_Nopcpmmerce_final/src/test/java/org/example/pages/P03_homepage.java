package org.example.pages;

import jdk.jfr.Timespan;
import org.example.StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class P03_homepage {

public void Navigatetohomepage(){
    Hooks.driver.navigate().to("https://demo.nopcommerce.com/");
}
public WebElement SelectCurrencies(){
    return Hooks.driver.findElement(By.cssSelector("select[id=\"customerCurrency\"]"));
}
    public void searchProductByName(String productName) {

    }
    public void searchProductBySKU(String sku) {

    }
    public List<WebElement> getSearchResults() {

        return Hooks.driver.findElements(By.className("search-result"));
    }
    public void clickFirstProduct() {

    }
    public String getCurrentUrl() {

        return Hooks.driver.getCurrentUrl();
    }
    public String getProductSKU() {

        return Hooks.driver.findElement(By.className("product-sku")).getText();
    }
public void Hoveroncategory() {
    Actions actions=new Actions(Hooks.driver);
    List<WebElement> category = Hooks.driver.findElements(By.cssSelector("ul[class=\"top-menu notmobile\"]"));
    System.out.println(category.get(3).getText());
    int count=category.size();
    int min=0;
    int max=count+1;
    int selectedCategory = (int)Math.floor(Math.random()*(max-min+1)+min);

    actions.moveToElement(category.get(selectedCategory)).perform();
    String selectedCategoryText = category.get(selectedCategory).getText();
    selectedCategory = selectedCategory+1;
}

public void selectsubcategory(){
    List<WebElement>Subcategory=Hooks.driver.findElements(By.cssSelector("div[class=\"sublist-toggle\"]"));
    Random rand=new Random();
    int randomcategory=rand.nextInt(Subcategory.size());
     WebElement randomselectsubcategoury=Subcategory.get(randomcategory);
    randomselectsubcategoury.click();

}
public void assertsubcategory(){

    List<WebElement> categories = Hooks.driver.findElements(By.xpath("//ul[@class=\"header-menu\"]/li"));
    Random rand = new Random();
    WebElement randomCategory = categories.get(rand.nextInt(categories.size()));

    String categoryName = randomCategory.getText().toLowerCase().trim();
    randomCategory.click();
    Hooks.driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MINUTES);
    List<WebElement> subCategories = randomCategory.findElements(By.xpath("//ul[@class=\"sublist-toggle\"]/li"));
    if (!subCategories.isEmpty()) {

        WebElement randomSubCategory = subCategories.get(rand.nextInt(subCategories.size()));
        String subCategoryName = randomSubCategory.getText().toLowerCase().trim();
        randomSubCategory.click();

        Assert.assertTrue(Hooks.driver.getPageSource().contains(subCategoryName),
                "Sub-category name not found on the opened page");
    } else {

        randomCategory.click();

        Assert.assertTrue(Hooks.driver.getPageSource().contains(categoryName),
                "Main category name not found on the opened page");
    }
}
    public void clickonFacebookLink() {
      Hooks.driver.findElement(By.cssSelector("a[href=\"http://www.facebook.com/nopCommerce\"]")).click();
    }
    public void clickonTwitterIcon() {
        Hooks.driver.findElement(By.cssSelector("a[href=\"https://twitter.com/nopCommerce\"]")).click();
    }
    public void clickonRssIcon() {
        Hooks.driver.findElement(By.cssSelector("a[href=\"/news/rss/1\"]")).click();
    }
    public void clickonYoutubeIcon() {
       Hooks.driver.findElement(By.cssSelector("a[href=\"http://www.youtube.com/user/nopCommerce\"]")).click();
    }
    public void switchToNewTab() {
        String newTab = Hooks.driver.getWindowHandles().toArray()[1].toString();
        Hooks.driver.switchTo().window(newTab);
    }
    public void switchToFirstTab() {
        String firstTab = Hooks.driver.getWindowHandles().toArray()[0].toString();
        Hooks.driver.switchTo().window(firstTab);
    }
public void addproductwishlist(){
  Hooks.driver.findElement(By.cssSelector("img[alt=\"Picture of HTC One M8 Android L 5.0 Lollipop\"]")).click();
  Hooks.driver.findElement(By.cssSelector("button[id=\"add-to-wishlist-button-18\"]")).click();

}
public void assertaddedofproduct(){
    SoftAssert Soft=new SoftAssert();
    Soft.assertTrue(Hooks.driver.findElement(By.cssSelector("div[id=\"bar-notification\"]")).isDisplayed());
    Soft.assertEquals(Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]")).getCssValue("background"),"rgb(75, 176, 122)");
    Soft.assertAll();
}
public void  disappersucessmessage(){
 WebDriverWait Wait=new WebDriverWait(Hooks.driver, Duration.ofMinutes(2000));
    Wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div[class=\"bar-notification success\"]")));




}
    public void quantiesofWishlist(){
        WebDriverWait Wait=new WebDriverWait(Hooks.driver, Duration.ofMinutes(2000));
        WebElement quntityElement = Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='wishlist-info']//span[@class='wishlist-qty']")));
        int qtyValue = Integer.parseInt(quntityElement.getText());
        if (qtyValue > 0) {
            System.out.println("Quantity value is greater than 0.");
        } else {
            System.out.println("Quantity value is less than 0.");
        }
    }
}







