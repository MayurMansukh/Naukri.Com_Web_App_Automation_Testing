/**
 * Description : add Naukri.com web Login page locators and methods
 * Author      : Mayur Mansukh
 * Date        : 1/6/21
 */
package com.bridgelabz.pages;

import com.bridgelabz.base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Base {

    public WebDriver driver;

    @FindBy(xpath = "//*[@id=\"login_Layer\"]/div")
    WebElement Login_Btn;

    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[2]/div/form/div[2]/input")
    WebElement email_txt;

    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[2]/div/form/div[3]/input")
    WebElement password_txt;

    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[2]/div/form/div[6]/button")
    WebElement Sign_in_Btn;


    //constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void click_login_btn() {
        Login_Btn.click();
    }

    public boolean enter_username(String id) {
        email_txt.sendKeys(id);
        return true;
    }

    public boolean enter_password(String pass)  {
        password_txt.sendKeys(pass);
        return true;
    }

    public void click_signIn_btn() {
        Sign_in_Btn.click();
    }


}
