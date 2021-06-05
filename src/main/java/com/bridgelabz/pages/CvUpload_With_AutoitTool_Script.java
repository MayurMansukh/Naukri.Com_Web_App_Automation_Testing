/**
 * Description : add Naukri.com web CvUpload locators and methods
 * Author      : Mayur Mansukh
 * Date        : 2/6/21
 */
package com.bridgelabz.pages;

import com.bridgelabz.base.Base;
import com.bridgelabz.utils.FileUploadWithAutoItScript;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.awt.event.KeyEvent;

public class CvUpload_With_AutoitTool_Script extends Base {
    public WebDriver driver;
    Robot robot;

    @FindBy(id = "wdgt-file-upload")
    WebElement uploadBtn;

    @FindBy(id = "name")
    WebElement name;

    @FindBy(id = "email")
    WebElement email;

    @FindBy(id = "mobile")
    WebElement mobile;

    @FindBy(xpath = "//*[@id=\"exp-years-droopeFor\"]")
    WebElement experience;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(id = "submitBtn")
    WebElement submit;

    @FindBy(xpath = "//*[@id=\"feedbackform\"]/button")
    WebElement skip_btn;


    public CvUpload_With_AutoitTool_Script(WebDriver driver) throws AWTException {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        robot = new Robot();
    }

    public void uploadFile() throws AWTException {
        FileUploadWithAutoItScript autoIt = new FileUploadWithAutoItScript();
        logger.info("upload file");
        robot.delay(500);
        uploadBtn.click();
        robot.delay(500);
        autoIt.fileUpload();
    }

    public void register() {
        logger.info("enter registration details");
        name.sendKeys("MayurMansukh");
        email.sendKeys("MansukhMayur99@gmai32.com");
        mobile.sendKeys("9189770098");
        experience.click();
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        password.sendKeys("Mansukh1@2");
        submit.click();
        robot.delay(7000);
    }
}
