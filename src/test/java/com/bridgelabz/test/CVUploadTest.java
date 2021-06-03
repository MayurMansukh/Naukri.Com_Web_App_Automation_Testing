package com.bridgelabz.test;

import com.bridgelabz.base.Base;
import com.bridgelabz.pages.cvUpload_register_page;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.awt.*;

public class CVUploadTest extends Base {

    @Test
    public void uploadFile() throws AWTException {
        cvUpload_register_page cvUpload = new cvUpload_register_page(driver);
        cvUpload.uploadFile();
        cvUpload.register();
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.naukri.com/mnjuser/profile");

    }
}
