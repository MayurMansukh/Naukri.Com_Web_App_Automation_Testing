/**
 * Description : add otp handling method using Twilio app test
 * Author      : Mayur Mansukh
 * Date        : 5/6/21
 */
package com.bridgelabz.test;

import com.bridgelabz.base.Base;
import com.bridgelabz.pages.OtpHandlingPage;
import com.bridgelabz.utils.OtpHandelUsingTwilio;
import com.twilio.Twilio;
import org.testng.annotations.Test;

public class OtpHandelUsingTwilioTest extends Base {

    @Test
    public void otpHandling() throws InterruptedException {
        OtpHandelUsingTwilio otpTwilio = new OtpHandelUsingTwilio();
        OtpHandlingPage otpHandling = new OtpHandlingPage(driver);
        otpHandling.clicksignBtn();
        otpHandling.CreateAccountBtn();
        otpHandling.enter_UserName();
        otpHandling.select_CountryCode();
        otpHandling.enter_mobile_no();
        otpHandling.enter_email();
        otpHandling.enter_password();
        otpHandling.click_continue();
        Thread.sleep(10000);

        Twilio.init(otpTwilio.Account_SID,otpTwilio.AUTH_TOKEN);
        String smsBody = otpTwilio.getMessage();
        System.out.println(smsBody);
        String otp = smsBody.replaceAll("[^_?0-9]+","");
        System.out.println(otp);

    }
}
