package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	public static XSSFWorkbook wb;
	public static XSSFSheet sh;
	public static FileInputStream f;
	
	public static String getTestData(int i, int j, String file_path, String sheet) throws IOException {
		f = new FileInputStream(System.getProperty("user.dir")+file_path);
		wb=new XSSFWorkbook(f);
		sh=wb.getSheet(sheet);
		Row r=sh.getRow(i);
		Cell c=r.getCell(j);
		return c.getStringCellValue();
		}
	
	public static String ReadDataFromExcel(int i,int j) {
		Row row=sh.getRow(i);
		Cell cell=row.getCell(j);
		return cell.getStringCellValue();
		}
	
	public static String getNumeric(int i, int j, String file_path, String sheet) throws IOException {
		f = new FileInputStream(System.getProperty("user.dir") + file_path);
		wb = new XSSFWorkbook(f);
		sh = wb.getSheet(sheet);
		Row r = sh.getRow(i);
		Cell c = r.getCell(j);
		int value = (int) c.getNumericCellValue();
		return String.valueOf(value);
		}
	
	public static int getTestNumericData(int i, int j, String file_path, String sheet) throws IOException {
		f = new FileInputStream(System.getProperty("user.dir")+file_path);
		wb=new XSSFWorkbook(f);
		sh=wb.getSheet(sheet);
		Row r=sh.getRow(i);
		Cell c=r.getCell(j);
		return (int) c.getNumericCellValue();
		}
	}
