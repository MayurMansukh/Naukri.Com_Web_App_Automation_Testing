/**
 * Description : add Drag & Drop method with Test
 * Author      : Mayur Mansukh
 * Date        : 3/6/21
 */
package com.bridgelabz.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Drag_Drop_Method {
    static WebDriver driver;
    static WebElement From1=driver.findElement(By.xpath("//*[@id='credit2']/a"));
    static WebElement To1=driver.findElement(By.xpath("//*[@id='bank']/li"));

    public static void DD_Base() {
        Actions act = new Actions(driver);
        act.dragAndDrop(From1, To1).build().perform();
    }

    @Test
    public static void Drag_Drop_Test(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.get("http://demo.guru99.com/test/drag_drop.html");
        DD_Base();
    }
}
