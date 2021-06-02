/**
 * Description : add object repository Xml file method with jaxen ,dom4j dependancy
 * Author      : Mayur Mansukh
 * Date        : 2/6/21
 */
package com.bridgelabz.utils;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;

import java.io.File;

public class ObjectRepositoryXmlFile {
    Document document;

    public  Document readXmlPropertiesFile() throws DocumentException {
        File inputFile = new File(System.getProperty("C:\\Users\\admin\\IdeaProjects\\Naukri.com_Web_Application\\config.xml"));
        SAXReader saxReader = new SAXReader();
        document = saxReader.read(inputFile);
        return document;
    }

    public  String get_Username(){

        String login_username = document.selectSingleNode("//login/login_username").getText();
        return login_username;
    }

    public String get_Password(){

        String login_password = document.selectSingleNode("//login/login_password").getText();
        return login_password ;
    }

}
