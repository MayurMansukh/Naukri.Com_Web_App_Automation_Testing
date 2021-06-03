/**
 * Description : automate the Date
 * Author      : Mayur Mansukh
 * Date        : 2/6/21
 */
package com.bridgelabz.utils;

import com.bridgelabz.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.*;
import java.awt.*;
import java.awt.event.InputEvent;
import java.util.List;


public class DateAutomate extends Base {
    public void SelectLocation() throws AWTException {
        Robot robot = new Robot();

        driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_originStation1_CTXT\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"dropdownGroup1\"]/div/ul[4]/li[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_destinationStation1_CTXT\"]")).click();
        robot.delay(500);
        robot.mouseMove(460,460);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(2000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

    }


    public void selctDepartDate(){
        String date = "10-June-2025";
        String day = date.split("-")[0];
        String month = date.split("-")[1];
        String year = date.split("-")[2];
        System.out.println(day+"-"+month+"-"+year);
        WebDriverWait wait = new WebDriverWait(driver,3000);
        WebElement dateBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"flightSearchContainer\"]/div[4]/button")));
        dateBtn.click();

        String cmonth = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/div/div/span[1]")).getText().trim();
        String cyear = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/div/div/span[2]")).getText().trim();
        WebElement next;

        while ((cmonth.equals(month)) && (cyear.equals(year))){
            next = driver.findElement(By.xpath("//span[text()='Next']"));
            next.click();
            cmonth = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/div/div/span[1]")).getText().trim();
            cyear = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/div/div/span[2]")).getText().trim();
        }

        List<WebElement>dates = driver.findElements(By.xpath("//a[@class='ui-state-default']"));
        for (WebElement e : dates){
            if (e.getText().trim().equals(day)){
                e.click();
                break;
            }
        }
    }

    public void selectPassanger(){
        driver.findElement(By.xpath("//*[@id=\"divpaxinfo\"]")).click();
        Select adult = new Select(driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_Adult\"]")));
        adult.selectByIndex(2);
    }

    public void selectNIR(){
        Select nri = new Select(driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_DropDownListCurrency\"]")));
        nri.selectByIndex(3);

    }

    public void searchFlight(){
        driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_btn_FindFlights\"]")).click();
        try {
            driver.wait(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
