package readFile;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
//import java.util.Map;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadParticularData {
	public static void main(String[] args) throws IOException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name of employee: ");
		String str=sc.nextLine();
		cellData(str);
	}
		
		public static void cellData(String str) throws IOException {
			
		String Excelpath="./ExcelFile/Book.xlsx";
		XSSFWorkbook workbook=new XSSFWorkbook(Excelpath);
		XSSFSheet sheet=workbook.getSheet("sheet1");

	    int rows=sheet.getLastRowNum();
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		
		
		for(int r=0;r<rows;r++)
		{
			String key=sheet.getRow(r+1).getCell(0).getStringCellValue();
			Integer value=(int)sheet.getRow(r+1).getCell(1).getNumericCellValue();
			map.put(key, value);

		}
		
		
		HashMap<String,String> map1=new HashMap<String,String>();
		for(int r=0;r<rows;r++)
		{
			String key=sheet.getRow(r+1).getCell(0).getStringCellValue();
			String value=sheet.getRow(r+1).getCell(2).getStringCellValue();
			map1.put(key, value);

		}

				//System.out.print("The ID and Designation of employee "+str);

				System.out.println("The Id is "+map.get(str)+" ");
		        System.out.println("The Designation is " +map1.get(str));

      }
	

}
