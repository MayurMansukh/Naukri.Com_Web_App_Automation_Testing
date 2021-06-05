/**
 * Description : FileUpload using String selection method
 * Author      : Mayur Mansukh
 * Date        : 3/6/21
 */
package com.bridgelabz.utils;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class FileUploadPopup {
    public void fileUpload() throws AWTException {
        Robot robot = new Robot();
        StringSelection ss = new StringSelection("C:\\Users\\admin\\Downloads\\ManualTesting.pdf");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.delay(100);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }
}
