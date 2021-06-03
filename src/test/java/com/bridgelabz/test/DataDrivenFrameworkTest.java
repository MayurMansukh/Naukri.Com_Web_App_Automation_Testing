/**
 * Description : automate the logout module with multiple data set usinge data driven method
 * Author      : Mayur Mansukh
 * Date        : 2/6/21
 */
package com.bridgelabz.test;

import com.bridgelabz.base.Base;
import com.bridgelabz.pages.*;
import com.bridgelabz.utils.DataDrivenMethod;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.testng.annotations.Test;
import java.awt.*;
import java.io.IOException;

public class DataDrivenFrameworkTest extends Base {

    @Test
    public static void Naukri_Login_With_DataSet() throws IOException, AWTException {
        LoginPage loginObj = new LoginPage(driver);
        SignOutPage signOutPage = new SignOutPage();
        DataDrivenMethod dataDriven = new DataDrivenMethod();
        boolean check;

        XSSFSheet sheet = dataDriven.excel_utils_base().getSheetAt(0);
        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            System.out.println("test started with data " + i);
            loginObj.click_login_btn();
            String username1 = String.valueOf(sheet.getRow(i).getCell(0));
            String password1 = String.valueOf(sheet.getRow(i).getCell(1));

            loginObj.enter_username(username1);
            check = loginObj.enter_password(password1);
            if (check)
                loginObj.click_signIn_btn();
                if (check)
                    check = signOutPage.Signout_btn();
                    if (check)
                        System.out.println("test sucess with data " + i);
                    else
                        System.out.println("test failed with data " + i);

        }
    }
}
