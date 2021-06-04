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
