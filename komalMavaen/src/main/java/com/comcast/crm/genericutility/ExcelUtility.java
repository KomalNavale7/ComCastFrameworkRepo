package com.comcast.crm.genericutility;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	  Workbook wb=null;
      public String getDataFromExcel(String sheetname,int rownum,int cellno) throws Throwable {
   	   FileInputStream fis=new FileInputStream("./resourse/TestData.xls.xlsx");
   	   wb = WorkbookFactory.create(fis);
   	  String data = wb.getSheet(sheetname).getRow(rownum).getCell(cellno).toString();
   	  return data;
	}
   
      public void getDataWriteBackToExcel(String sheetname,int rownum,int cellno,String value) throws Throwable {
   	   FileInputStream fis=new FileInputStream("./resource/TestData.xls.xlsx");
   	      wb = WorkbookFactory.create(fis);
   	 Sheet sh = wb.getSheet(sheetname);
        Row row = sh.getRow(rownum);
       Cell cel = row.getCell(cellno);
     cel.setCellType(CellType.STRING);
     cel.setCellValue(value);
       FileOutputStream fos=new FileOutputStream("./resource/TestData.xls.xlsx");
        wb.write(fos);
	}
   public void getCloseConnection() throws Throwable {
   wb.close();
   }
}
