package com.bridgelabz.test;

import com.bridgelabz.base.Base;
import com.bridgelabz.pages.CV_uploadPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.awt.*;

public class CVUploadTest extends Base {

    @Test
    public void uploadFile() throws AWTException {
        CV_uploadPage cvUpload = new CV_uploadPage(driver);
        cvUpload.uploadFile();
        cvUpload.register();
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.naukri.com/mnjuser/profile");

    }
}
