package dataProvider;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataprovider {
	
	XSSFWorkbook wb;
	public ExcelDataprovider(){
		
		File src=new File("./Application Test Data/AppData.xlsx");
		
		try {
			FileInputStream fis=new FileInputStream(src);
			 wb=new XSSFWorkbook(fis);
			
			
		} catch (Exception e) {
		
			System.out.println("Exception is "+e.getMessage());
		}
		
	}
	
	public String getexceldata(int SheetIndex,int row, int column){
		
	String data=wb.getSheetAt(SheetIndex).getRow(row).getCell(column).getStringCellValue();
	
	return data;
	}
	
	public String getexceldata(String SheetName,int row, int column){
		
	String data=wb.getSheet(SheetName).getRow(row).getCell(column).getStringCellValue();
	
	return data;

}
	
	public int getexceldata2(int SheetIndex,int row, int column){
		
		int data=wb.getSheetAt(SheetIndex).getRow(row).getCell(column).getRowIndex();
		
		return data;
}}
