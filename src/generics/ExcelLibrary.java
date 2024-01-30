package generics;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellAddress;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelLibrary implements AutoConstant

{
	public static String getStringTypeCellData(String sheet, int row, int cell) throws IOException
	{
		FileInputStream fis=new FileInputStream(excel_path);
		Workbook wb = new XSSFWorkbook(fis);
		String cellValue=wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		return cellValue;
	}
	
	public static double getNumericTypeCellData(String sheet, int row, int cell) throws IOException
	{
		FileInputStream fis=new FileInputStream(excel_path);
		
		Workbook wb=new XSSFWorkbook(fis);
		double cellValue=wb.getSheet(sheet).getRow(row).getCell(cell).getNumericCellValue();
		return cellValue;
	}
	
	public static boolean getBooleanTypeCellData(String sheet, int row, int cell) throws IOException
	{
		FileInputStream fis=new FileInputStream(excel_path);
		Workbook wb=new XSSFWorkbook(fis);
		boolean cellValue=wb.getSheet(sheet).getRow(row).getCell(cell).getBooleanCellValue();
		return cellValue;
	}
	
	public static Date getDateTypeCellData(String sheet, int row, int cell) throws IOException
	{
		FileInputStream fis=new FileInputStream(excel_path);
		Workbook wb=new XSSFWorkbook(fis);
		Date cellValue=wb.getSheet(sheet).getRow(row).getCell(cell).getDateCellValue();
		return cellValue;
	}
	
	public static CellAddress getCellAddress(String sheet, int row, int cell) throws IOException
	{
		FileInputStream fis=new FileInputStream(excel_path);
		Workbook wb=new XSSFWorkbook(fis);
		CellAddress cellAddress=wb.getSheet(sheet).getRow(row).getCell(cell).getAddress();
		return cellAddress;
	}
	
	public static int rowCount(String sheet) throws IOException
	{
		FileInputStream fis=new FileInputStream(excel_path);
		Workbook wb=new XSSFWorkbook(fis);
		Sheet sheet1=wb.getSheet(sheet);
		int rowNum=sheet1.getLastRowNum();
		return rowNum;
	}
	
	public static int cellCount(String sheet) throws IOException
	{
		FileInputStream fis=new FileInputStream(excel_path);
		Workbook wb=new XSSFWorkbook(fis);
		Sheet sheet1=wb.getSheet(sheet);
		int rowNum=sheet1.getLastRowNum();
		int cellCount=0;
		for(int i=0;i<=rowNum;i++)
		{
			cellCount=sheet1.getRow(i).getLastCellNum(); 
		}
		return cellCount;
	}
	
	
	//2nd excel reading start
	
	public static String getStringTypeCellData1(String sheet, int row, int cell) throws IOException
	{
		FileInputStream fis=new FileInputStream(excel_path1);
		Workbook wb = new XSSFWorkbook(fis);
		String cellValue=wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		return cellValue;
	}
	
	public static double getNumericTypeCellData1(String sheet, int row, int cell) throws IOException
	{
		FileInputStream fis=new FileInputStream(excel_path1);
		
		Workbook wb=new XSSFWorkbook(fis);
		double cellValue=wb.getSheet(sheet).getRow(row).getCell(cell).getNumericCellValue();
		return cellValue;
	}
	
	public static boolean getBooleanTypeCellData1(String sheet, int row, int cell) throws IOException
	{
		FileInputStream fis=new FileInputStream(excel_path1);
		Workbook wb=new XSSFWorkbook(fis);
		boolean cellValue=wb.getSheet(sheet).getRow(row).getCell(cell).getBooleanCellValue();
		return cellValue;
	}
	
	public static Date getDateTypeCellData1(String sheet, int row, int cell) throws IOException
	{
		FileInputStream fis=new FileInputStream(excel_path1);
		Workbook wb=new XSSFWorkbook(fis);
		Date cellValue=wb.getSheet(sheet).getRow(row).getCell(cell).getDateCellValue();
		return cellValue;
	}
	
	public static CellAddress getCellAddress1(String sheet, int row, int cell) throws IOException
	{
		FileInputStream fis=new FileInputStream(excel_path1);
		Workbook wb=new XSSFWorkbook(fis);
		CellAddress cellAddress=wb.getSheet(sheet).getRow(row).getCell(cell).getAddress();
		return cellAddress;
	}
	
	public static int rowCount1(String sheet) throws IOException
	{
		FileInputStream fis=new FileInputStream(excel_path1);
		Workbook wb=new XSSFWorkbook(fis);
		Sheet sheet1=wb.getSheet(sheet);
		int rowNum=sheet1.getLastRowNum();
		return rowNum;
	}
	
	public static int cellCount1(String sheet) throws IOException
	{
		FileInputStream fis=new FileInputStream(excel_path1);
		Workbook wb=new XSSFWorkbook(fis);
		Sheet sheet1=wb.getSheet(sheet);
		int rowNum=sheet1.getLastRowNum();
		int cellCount=0;
		for(int i=0;i<=rowNum;i++)
		{
			cellCount=sheet1.getRow(i).getLastCellNum(); 
		}
		return cellCount;
	}
	
	
}
