package ru.qa.java;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Homework {

    private WebDriver driver;
    //private WebDriverWait wait;

    /*@Before
    public void start() {
        driver = new ChromeDriver();
        //wait = new WebDriverWait(driver, 10);
    }*/

    @Test
    public void test() {
        /*System.setProperty("webdriver.chrome.driver","H:\\Tools\\chromedriver.exe");
        driver = new ChromeDriver();*/
        /*System.setProperty("webdriver.gecko.driver","H:\\Tools\\geckodriver.exe");
        driver = new FirefoxDriver();*/
        System.setProperty("webdriver.ie.driver","H:\\Tools\\IEDriverServer.exe");
        driver = new InternetExplorerDriver();
        //driver.get("https://music.yandex.ru/");
        driver.get("https://music.yandex.ru/home");
        //WebElement element = driver.findElement(By.xpath("//*[contains(text(),'a')]"));
        List<WebElement> webElements = driver.findElements(By.xpath("//*[contains(text(),'a')]"));
        //elements.sendKeys("Cheese!");
        System.out.println("Count of substring is: " + webElements.size());


        /*(new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getTitle().toLowerCase().startsWith("cheese!");
            }
        });*/

        System.out.println("Count of substring is: " + webElements.size());

        //Assert.assertEquals(1, webElements.size());
        Assert.assertTrue("Бла", webElements.size() >= 10);

        driver.quit();

    }
}