package com.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {//poi, poi-ooxml, :read/write
	public static String readexcel(String sheetname, int rownum, int cellnum) {
		String data = null;
		try {
			Workbook w = WorkbookFactory.create(new FileInputStream("./TestData/userdata.xlsx"));
		 data = w.getSheet(sheetname).getRow(rownum).getCell(cellnum).toString();
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
		
	}
	
	public static void writeexcel(String sheetname, int rownum, int cellnum, 	String valuedata) {
		
		Workbook w;
		try {
			w = WorkbookFactory.create(new FileInputStream("./TestData/userdata.xlsx"));
			w.getSheet(sheetname).getRow(rownum).createCell(cellnum, CellType.STRING).setCellValue(valuedata);
			FileOutputStream fos= new FileOutputStream("./TestData/userdata.xlsx");
			
				w.write(fos);
		} catch (InvalidFormatException | IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		 
	}
	
	

}
