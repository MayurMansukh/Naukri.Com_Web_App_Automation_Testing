/**
 * Description : FileUpload using autoit script
 * Author      : Mayur Mansukh
 * Date        : 4/6/21
 */
package com.bridgelabz.utils;

import java.io.IOException;

public class FileUploadWithAutoItScript {

    public void fileUpload(){
        try {
            Runtime.getRuntime().exec("C:\\Users\\admin\\IdeaProjects\\Naukri.com_Web_Application\\FileUploadAutoItScript.exe");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
