/**
 * Description : automate the logout button using robot class
 * Author      : Mayur Mansukh
 * Date        : 1/6/21
 */
package com.bridgelabz.pages;

import com.bridgelabz.base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.awt.*;
import java.awt.event.InputEvent;


public class SignOutPage extends Base {

    public boolean Signout_btn() {
        logger.info("click logout button");
        try {
            // These coordinates are screen coordinates
            int xCoord = 1117;
            int yCoord = 150;
            int xCoord2 = 1010;
            int yCoord2 = 300;

            // Move the cursor
            Robot robot = new Robot();
            robot.delay(7000);
            robot.mouseMove(xCoord, yCoord);
            robot.delay(5000);
            robot.mouseMove(xCoord2, yCoord2);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            robot.delay(5000);
        } catch (AWTException e) {
            e.printStackTrace();
        }
        return true;
    }
}
