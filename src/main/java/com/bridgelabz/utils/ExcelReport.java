package com.bridgelabz.utils;

import org.automationtesting.excelreport.Xl;

public class ExcelReport {
    public void ExcelReport() throws Exception {
        Xl.generateReport("excel-report.xlsx");
    }
}
