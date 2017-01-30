package com.baselib;
/***********
 *@method:  toReadExcelData()
 *
 *
 */
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GenericLib {
public static String sTestDataFile="TestData.xlsx";
	
	public static String[] toReadExcelData(String sTestCaseID)
	{
		String sData[]=null;
		try
		{
	
		FileInputStream fis = new FileInputStream(sTestDataFile);
		Workbook wb = (Workbook)WorkbookFactory.create(fis);
		Sheet sht = wb.getSheet("TestData");
		int iRowNum= sht.getLastRowNum();
		for(int i=1;i<=iRowNum;i++)
		{
			if(sht.getRow(i).getCell(0).toString().equals(sTestCaseID))
			{
				int iCellNum=sht.getRow(i).getLastCellNum();
				sData= new String[iCellNum];
				for(int j=0;j<iCellNum;j++)		
				{
					sData[j]=sht.getRow(i).getCell(j).getStringCellValue();
				}
				break;
			}
		}	
		}
		catch(Exception e)
		{	
			e.printStackTrace();
		}
		return sData;
	}	
	
}