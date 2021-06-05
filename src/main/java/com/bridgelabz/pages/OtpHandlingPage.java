/**
 * Description : add makeMyTrip.com web Login page locators and methods
 * Author      : Mayur Mansukh
 * Date        : 5/6/21
 */
package com.bridgelabz.pages;

import com.bridgelabz.base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OtpHandlingPage extends Base {
    public WebDriver driver;

    @FindBy(id = "nav-link-accountList")
    WebElement signIn_Btn;

    @FindBy(id = "createAccountSubmit")
    WebElement createAccountBtn;

    @FindBy(id = "ap_customer_name")
    WebElement UserName;

    @FindBy(id = "auth-country-picker-container")
    WebElement countryCode;

    @FindBy(xpath = "//ul[@role='application']//li//a[text()='United States +1']")
    WebElement selectCountry;

    @FindBy(id = "ap_phone_number")
    WebElement phone;

    @FindBy(id = "ap_email")
    WebElement email;

    @FindBy(id = "ap_password")
    WebElement password;

    @FindBy(id = "continue")
    WebElement continueBtn;

    public OtpHandlingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        logger.getLogger(LoginPage.class.getName()).warn("Test is started");
    }

    public void clicksignBtn() {
        logger.info("clicking signIn btn");
        signIn_Btn.click();
    }

    public void CreateAccountBtn() {
        logger.info("clicking signIn btn");
        createAccountBtn.click();
    }

    public void enter_UserName(){
        logger.info("enter user nasme");
        UserName.sendKeys("MayurMansukh");
    }

    public void select_CountryCode(){
        logger.info("select the country code");
        countryCode.click();
        selectCountry.click();

    }

    public void enter_mobile_no(){
        logger.info("enter mobile no");
        phone.sendKeys("(215) 278-8883");

    }

    public void enter_email(){
        logger.info("enter email address");
        email.sendKeys("mayurmansukh99@yahoo.com");
    }

    public void enter_password(){
        logger.info("enter password");
        password.sendKeys("Mansukh23@1");
    }

    public void click_continue(){
        logger.info("clicking continue btn");
        continueBtn.click();
    }

}
