/**
 * Description : automate the Date Test
 * Author      : Mayur Mansukh
 * Date        : 2/6/21
 */
package com.bridgelabz.test;

import com.bridgelabz.base.Base;
import com.bridgelabz.utils.DateAutomate;
import org.testng.Assert;

import java.awt.*;

public class DateAutomateTest extends Base {

    @org.testng.annotations.Test
    public void Test() throws  AWTException {
        DateAutomate dateAutomate = new DateAutomate();
        dateAutomate.SelectLocation();
        dateAutomate.selctDepartDate();
        dateAutomate.selectPassanger();
        dateAutomate.selectPassanger();
        dateAutomate.selectNIR();
        dateAutomate.searchFlight();
        Assert.assertEquals(driver.getCurrentUrl(),"https://book.spicejet.com/Select.aspx");
    }

}
