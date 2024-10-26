package com.example.DataDrivenTesting;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataDrivenTestingMSExcelWrite {
    public static void main(String[] args) throws IOException {
        FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+ "\\testdata\\WriteData.xlsx");

        XSSFWorkbook workbook= new XSSFWorkbook();

        XSSFSheet sheet= workbook.createSheet("Name");

        XSSFRow row1= sheet.createRow(0);
        row1.createCell(0).setCellValue("Name");
        row1.createCell(1).setCellValue("City");

        XSSFRow row2= sheet.createRow(1);
        row2.createCell(0).setCellValue("Harshi");
        row2.createCell(1).setCellValue("Blr");

        XSSFRow row3= sheet.createRow(2);
        row3.createCell(0).setCellValue("Divya");
        row3.createCell(1).setCellValue("Del");

        workbook.write(file);

        System.out.println("file created");
        workbook.close();
        file.close();
    }
}
