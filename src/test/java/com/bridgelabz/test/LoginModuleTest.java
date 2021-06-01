/**
 * Description : add Naukri.com web Login page test case
 * Author      : Mayur Mansukh
 * Date        : 1/6/21
 */
package com.bridgelabz.test;

import com.bridgelabz.base.Base;
import com.bridgelabz.pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginModuleTest extends Base {

   @Test(priority = 0)
   public void loginPagetest() throws InterruptedException {
       LoginPage loginPage = new LoginPage(driver);
       loginPage.click_login_btn();
       loginPage.enter_username("mansukh99@gmail.com");
       loginPage.enter_password("Password1@2");
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
