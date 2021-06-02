/**
 * Description : add Naukri.com web Login page test With object repository Xml file
 * Author      : Mayur Mansukh
 * Date        : 2/6/21
 */
package com.bridgelabz.test;

import com.bridgelabz.base.Base;
import com.bridgelabz.pages.LoginPage;
import com.bridgelabz.pages.SignOutPage;
import com.bridgelabz.utils.ObjectRepositoryPropertyFile;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginWithObjectRepoXmlFileTest extends Base {

    @Test(priority = 0)
    public void loginPagetest() throws InterruptedException {
        ObjectRepositoryPropertyFile objRepo = new ObjectRepositoryPropertyFile();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.click_login_btn();
        loginPage.enter_username(objRepo.get_Username());
        loginPage.enter_password(objRepo.get_Password());
        loginPage.click_signIn_btn();
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.naukri.com/");
        Thread.sleep(5000);
    }

    @Test(priority = 1)
    public void logoutPageTest(){
        SignOutPage signOutPage = new SignOutPage(driver);
        signOutPage.Signout_btn();
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.naukri.com/");

    }
}
