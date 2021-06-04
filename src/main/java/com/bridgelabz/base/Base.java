package com.bridgelabz.base;

import atu.testrecorder.exceptions.ATUTestRecorderException;
import com.bridgelabz.utils.ExcelReport;
import com.bridgelabz.utils.ExtentReport;
import com.bridgelabz.utils.TestExcutionRecording;
import com.bridgelabz.utils.checkInternerConnection;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class Base {

    public static WebDriver driver;
    public static Logger logger = Logger.getLogger(Base.class);
    checkInternerConnection connection = new checkInternerConnection();
    TestExcutionRecording record = new TestExcutionRecording();
    ExtentReport extentReport = new ExtentReport();
    ExcelReport report = new ExcelReport();

    @BeforeTest
    public void setup() throws ATUTestRecorderException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.get("https://www.naukri.com/");
        //driver.get("https://www.spicejet.com/");

        connection.check_internet_connectivity(); // check internet connection
        record.startRecording(); // test excution start recording
        extentReport.startTest();
        PropertyConfigurator.configure("log4j.properties");
    }

    @AfterTest
    public void teardown() throws Exception {
        record.endRecording(); // test excution end recording
        extentReport.endTest(); // create extent report
        report.ExcelReport(); // create excel report
        //driver.close();
    }
}
