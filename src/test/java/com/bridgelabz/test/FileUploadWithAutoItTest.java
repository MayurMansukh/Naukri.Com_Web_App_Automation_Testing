package com.bridgelabz.test;

import com.bridgelabz.base.Base;
import com.bridgelabz.pages.CvUpload_With_AutoitTool_Script;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

public class FileUploadWithAutoItTest extends Base {

    @Test
    public void fileUpload() throws AWTException {
        CvUpload_With_AutoitTool_Script fileAutoit = new CvUpload_With_AutoitTool_Script(driver);
        fileAutoit.uploadFile();
        fileAutoit.register();
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.naukri.com/mnjuser/profile");
    }


}


