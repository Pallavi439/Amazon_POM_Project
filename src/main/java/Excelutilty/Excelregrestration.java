package Excelutilty;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.testng.annotations.Test;

public class Excelregrestration {
	
	public static String name;
	public static String mobile;
	public static String password;
	public static void getExceldata() throws InvalidFormatException, IOException
	{
		FileInputStream fs=new FileInputStream("C:\\Users\\Surendra\\Downloads\\AmazonProject\\AmazonProject\\RegistrationpageExcel.xlsx");
		Workbook ws=WorkbookFactory.create(fs);
		name=ws.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		mobile=NumberToTextConverter.toText(ws.getSheet("Sheet1").getRow(1).getCell(1).getNumericCellValue());
		password=ws.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		
		
	}

}
//class A extends Excelregrestration
//{
//	@Test
//	public static void name() throws InvalidFormatException, IOException {
//		
//		getExceldata();
//		System.out.println(name);
//
//		
//	}
//}
