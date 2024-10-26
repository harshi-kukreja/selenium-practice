package com.example.DataDrivenTesting;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class DataDrivenTestingMSExcelWriteDynamicData {
    public static void main(String[] args) throws IOException {
        FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+ "\\testdata\\WriteDynamicData.xlsx");

        XSSFWorkbook workbook= new XSSFWorkbook();

        XSSFSheet sheet= workbook.createSheet("Dynamic data");

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int totalRows= sc.nextInt();

        System.out.println("Enter number of cells:");
        int totalCells= sc.nextInt();


        for (int r=0; r<=totalRows; r++){
           XSSFRow row= sheet.createRow(r);
            for (int c=0;c<totalCells; c++){
                XSSFCell cell=row.createCell(c);
                cell.setCellValue(sc.next());
            }
        }

        workbook.write(file);

        System.out.println("file created");
        workbook.close();
        file.close();
    }
}
