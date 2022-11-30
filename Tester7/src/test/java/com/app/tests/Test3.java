package com.app.tests;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.app.helpers.GetData;


public class Test3 {
	
	public static void main(String[] args) {
		String excelPath = "data/data.xlsx";
		String user =GetData.fromExcel("data/data.xlsx", "Login", 1, 0);
		
		String pwd =GetData.fromExcel(excelPath, "Login", 1, 1);
		System.out.println("user :- "+ user);
		System.out.println("pwd :- "+ pwd);
		
		String data;
		File  f = new File(excelPath);
		try{
			FileInputStream fis = new FileInputStream(f);
			Workbook wb = WorkbookFactory.create(fis);
					
			Sheet sheet = wb.getSheet("Login");
			for (Row row : sheet) {
		        for (Cell cell : row) {
		        	data = cell.toString();
		        	System.out.println("data "+ data);
		        }
		    }
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
