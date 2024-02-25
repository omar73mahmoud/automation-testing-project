package org.example.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homepage;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D07_followUsStepDef {
    P03_homepage homepage= new P03_homepage();
    @Given("user is on the homepage of NopCommerce")
    public void userisonhomeoage(){
        homepage.Navigatetohomepage();
    }
    @When("^user opens facebook link$")
    public void user_opens_facebook_link() {
      homepage.clickonFacebookLink();
    }
    @Then("facebook url is opened in a new tab")
    public void facebookopenedinnewtap(String expectedUrl) {
        homepage.switchToNewTab();
        String actualUrl = Hooks.driver.getCurrentUrl();
        Assert.assertEquals(actualUrl.equals(expectedUrl),"https://www.facebook.com/nopCommerce ");
        Hooks.driver.close();
        homepage.switchToFirstTab();
    }
    @When("^user opens twitter link$")
    public void user_opens_twitter_link() {
        homepage.clickonTwitterIcon();
    }
@Then("twitter url is opened in a new tab")
    public void twitteropnedinnewtap(String expectedUrl) {
        homepage.switchToNewTab();
        String actualUrl = Hooks.driver.getCurrentUrl();
        Assert.assertEquals(actualUrl.equals(expectedUrl),"https://www.Twitter.com/nopCommerce ");
        Hooks.driver.close();
        homepage.switchToFirstTab();
    }
    @When("^user opens rss link$")
    public void user_opens_rss_link() {
        homepage.clickonRssIcon();
    }
    @Then("rss url is-open\" is opened in a new tab")
    public void Twitterisopnednewtap(String expectedUrl) {
        homepage.switchToNewTab();
        String actualUrl = Hooks.driver.getCurrentUrl();
        Assert.assertEquals(actualUrl.equals(expectedUrl),"https://www.rss.com/nopCommerce ");
        Hooks.driver.close();
        homepage.switchToFirstTab();
    }
    @When("^user opens youtube link$")
    public void user_opens_youtube_link() {
        homepage.clickonYoutubeIcon();
    }
  @Then("youtube url is opened in a new tab")
    public void rssopnedinnewtap(String expectedUrl) {
        homepage.switchToNewTab();
        String actualUrl = Hooks.driver.getCurrentUrl();
        Assert.assertEquals(actualUrl.equals(expectedUrl),"https://www.youtube.com/nopCommerce ");
        Hooks.driver.close();
        homepage.switchToFirstTab();
    }


}
