package com.practice.TestNg;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class D_DataProvider_With_Excel {
	
	@DataProvider(name="data")
	public Object userDataFromExcel() throws EncryptedDocumentException, IOException {
		
		//Reading data from the excel
//		1. get the path of the excel file
		FileInputStream fis  = new FileInputStream("./TestData/userdata.xlsx");
//		2. Create the workbook
		Workbook workBook = WorkbookFactory.create(fis);
//		3. Get the Sheet from the WorkBook
		Sheet userDataSheet = workBook.getSheet("userData");
//		4.Get the row count from the Sheet
		int row = userDataSheet.getLastRowNum();
		
//		5.Get the col count from the Sheet
		int cols = userDataSheet.getRow(0).getLastCellNum();
		
		System.out.println(cols);
		System.out.println(row);
//		1. Creating user details Object array
		Object userDetails[][] = new Object[row][cols];
		
//		2. Adding the Excel Data into the Object Array
		for(int i=1;i<=row;i++) {
			Row user = userDataSheet.getRow(i);
			for(int j = 0;j<cols;j++) {
				userDetails[i-1][j]=user.getCell(j).toString();
			}
		}

		return userDetails;
		
	}
	@Test(dataProvider="data")
	public void userDetailsFromExcel(String sNo,String userName,String password)  {
		System.out.println("==== User Details From Excel ====");
		System.out.println();
		
		System.out.println("User Name :"+userName);
		System.out.println("Password  :"+password);
		
		
		System.out.println();
		System.out.println("=================================");
		System.out.println();
	}

}
