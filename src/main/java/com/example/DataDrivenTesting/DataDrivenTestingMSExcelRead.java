package com.example.DataDrivenTesting;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class DataDrivenTestingMSExcelRead {
    public static void main(String[] args) throws IOException {
        FileInputStream file=new FileInputStream("C:\\Users\\harsh\\IdeaProjects\\SeleniumPractice\\testdata\\ReadData.xlsx");

        XSSFWorkbook workbook= new XSSFWorkbook(file);

        XSSFSheet sheet= workbook.getSheet("Name");

        //total rows in sheet
        int totalRows= sheet.getLastRowNum();
        System.out.println("Total number of rows:" + totalRows);

        int totalCell= sheet.getRow(1).getLastCellNum();
        System.out.println("Total number of cells:" + totalCell);

        //get cell data
        XSSFCell cell1 = sheet.getRow(1).getCell(0);
        System.out.println(cell1);

        for (int r=0; r<=totalRows; r++)
        {
            XSSFRow row=sheet.getRow(r);
            for (int c=0; c<totalCell; c++){
               XSSFCell cell=  row.getCell(c);
               System.out.print(cell.toString()+ "\t");
            }
            System.out.println();
        }

        workbook.close();
        file.close();
    }
}
