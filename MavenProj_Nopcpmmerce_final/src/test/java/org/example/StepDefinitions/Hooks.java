package org.example.StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {
    public static WebDriver driver;
    public By currentdrobdown=By.id("currency");
    public By productelements=By.className("product");
    @Before
    public void OpenBrowser(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.MINUTES);
        driver.navigate().to("https://demo.nopcommerce.com/");
    }
    @After
    public void QuitBrowser() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}

