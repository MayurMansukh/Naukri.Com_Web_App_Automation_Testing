/**
 * Description : automate the file upload using StringSelection method
 * Author      : Mayur Mansukh
 * Date        : 3/6/21
 */
package com.bridgelabz.test;

import com.bridgelabz.base.Base;
import com.bridgelabz.pages.Cvupload_register_page;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.awt.*;

public class FileUploadTest extends Base {

    @Test
    public void uploadFile() throws AWTException {
        Cvupload_register_page cvUpload = new Cvupload_register_page(driver);
        cvUpload.uploadFile();
        cvUpload.register();
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.naukri.com/mnjuser/profile");

    }
}
