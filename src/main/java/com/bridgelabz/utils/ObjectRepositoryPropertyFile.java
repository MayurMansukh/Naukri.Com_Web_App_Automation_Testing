/**
 * Description : object repository properties file method
 * Author      : Mayur Mansukh
 * Date        : 2/6/21
 */
package com.bridgelabz.utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ObjectRepositoryPropertyFile {

    Properties pro;
    public ObjectRepositoryPropertyFile(){

        File src = new File("./config.properties");
        try {
            FileInputStream fis = new FileInputStream(src);
            pro = new Properties();
            pro.load(fis);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String get_Username(){
        String login_username = pro.getProperty("login_username");
        return login_username;
    }

    public String get_Password(){

        String login_password = pro.getProperty("login_password");
        return login_password ;
    }

}
