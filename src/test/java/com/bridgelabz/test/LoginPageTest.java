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

public class LoginPageTest extends Base {

   @Test
   public void loginPagetest(){
       LoginPage loginPage = new LoginPage(driver);
       loginPage.click_login_btn();
       loginPage.enter_username("mansukh99@gmail.com");
       loginPage.enter_password("Password1@2");
       loginPage.click_signIn_btn();
       Assert.assertEquals(driver.getCurrentUrl(),"https://www.naukri.com/");
   }
}
