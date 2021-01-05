package datadriven.xlsfiles;



import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DatDrivenDemo {

	@SuppressWarnings({ "resource", "deprecation" })
	
	public ArrayList<String> getDataXls(String TestCaseName) throws IOException 
	{
FileInputStream file=new FileInputStream("F:\\Data-Sample.xlsx");
ArrayList<String> a=new ArrayList<String>();
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		//workbook.close();
	int	sheetCount=workbook.getNumberOfSheets();
		System.out.println("sheetcount is"+sheetCount);
		//ArrayList<String> a=new ArrayList<String>();
		
		for(int i=0;i<sheetCount;i++)
		{
			
			if(workbook.getSheetName(i).equalsIgnoreCase("Demo_Data"))
			{
		XSSFSheet sheet=workbook.getSheetAt(i);
		Iterator<Row> rowRead=sheet.iterator();
		Row firstRow=rowRead.next();
		Iterator<Cell> cellsRead=firstRow.cellIterator();
		int k=0;
		int column=0;
		
		while(cellsRead.hasNext())
		{
			
			
	Cell value=cellsRead.next();
	if(value.getStringCellValue().equalsIgnoreCase("Testcase"))
			
	{
		String stored=value.getStringCellValue();
		column=k;
		System.out.println(stored);
		
	}
	k++;	
		}
		
		System.out.println(column+"**"+"Column");
		
		
		while(rowRead.hasNext())
			{
		Row rowValue=rowRead.next();
		if(rowValue.getCell(column).getStringCellValue().equalsIgnoreCase(TestCaseName))
			
		{
			Iterator<Cell> CeV=rowValue.cellIterator();
			
			while(CeV.hasNext())
			{
			
			Cell cVlue=CeV.next();
						if(cVlue.getCellTypeEnum()==CellType.STRING)
						{
							a.add(cVlue.getStringCellValue());
						}
						else
						
						{
							a.add(NumberToTextConverter.toText(cVlue.getNumericCellValue()));
							
							
						}
		}
			
		}
			}
		//System.out.println("Method size"+a.size());
			}
		}	return a;
	
		//return a;
		
		}


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*
		 * 1.Create XSSFWorkbook class
		 * 2.for the file path create object for FileInputStream
		 * 3.to read the sheetname 
		 * 
		 * 
		 */
		
		 
		 
		
		
		}
}