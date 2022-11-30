package com.app.tests;

import java.util.Arrays;

import com.app.helpers.GetData;

public class Test6 {

	public static void main(String[] args) {
		String excelPath = "data/data.xlsx";
		String[][] values = GetData.allExcelData(excelPath, "Config");

		for (int i = 0; i < values.length; i++) {
			System.out.println(Arrays.toString(values[i]));

		}
	}

}
