/**
 * Description : add test excution recording method
 * Author      : Mayur Mansukh
 * Date        : 1/6/21
 */
package com.bridgelabz.utils;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestExcutionRecording {

    ATUTestRecorder recorder;
    public void startRecording() throws ATUTestRecorderException {
        DateFormat dateFormat = new SimpleDateFormat("yy-MM-dd HH-mm-ss");
        Date date = new Date();
        recorder = new ATUTestRecorder("C:\\Users\\admin\\IdeaProjects\\Naukri.com_Web_Application\\TestRecordingFile", "TestVideo-" + dateFormat.format(date), false);
        recorder.start();
    }

    public void endRecording() throws ATUTestRecorderException {
        recorder.stop();
    }

}
