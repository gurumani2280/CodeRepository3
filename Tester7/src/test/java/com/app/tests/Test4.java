package com.app.tests;

import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Test4 {
	
	public static void main(String[] args) {
		String excelPath = "data/data.xlsx";
		String[][] values = null;
		String data;
		int rows =0;
		int cells = 0;
		File  f = new File(excelPath);
		try{
			FileInputStream fis = new FileInputStream(f);
			Workbook wb = WorkbookFactory.create(fis);
					
			Sheet sheet = wb.getSheet("Config");
			 rows = sheet.getPhysicalNumberOfRows();

            // get number of cell from row
             cells = sheet.getRow(0).getPhysicalNumberOfCells();
            values = new String[rows][cells];
            int i = 0;
			for (Row row : sheet) {
				int j = 0;
		        for (Cell cell : row) {	
		        	data = cell.toString();
		        	System.out.println("data "+ data);
		        	values[i][j] = data;
		        	System.out.println("values[i][j] "+ i + j+ " = " +values[i][j] );
		        	j++;
		        }
		        System.out.println(Arrays.toString(values[i]));
		        i++;
		    }
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("rows "+ rows);
		System.out.println("rows "+ rows);
		for(int i = 0; i < rows;i++) {
			//System.out.println(Arrays.toString(values[i]));
			for(int j = 0; j <cells;j++) {
			System.out.println(values[i][j]);
			
			}
		}
	}

}
