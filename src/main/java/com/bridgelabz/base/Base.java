package com.bridgelabz.base;

import atu.testrecorder.exceptions.ATUTestRecorderException;
import com.bridgelabz.utils.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class Base {
    public WebDriver driver;
    public static Logger logger = Logger.getLogger(Base.class);
    checkInternerConnection connection = new checkInternerConnection();
    TestExcutionRecording record = new TestExcutionRecording();

    @BeforeTest
    public void setup() throws ATUTestRecorderException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        connection.check_internet_connectivity(); // check internet connection
        record.startRecording(); // test excution start recording
        driver.get("https://www.naukri.com/");

    }

    @AfterTest
    public void teardown() throws ATUTestRecorderException {
        record.endRecording(); // test excution end recording
        //driver.quit();
        driver.close();


    }
}
