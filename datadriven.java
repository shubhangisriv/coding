package SeleniumPack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class datadriven {
	public static void main(String args[]) throws IOException
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe" );
			FileInputStream fi=new FileInputStream("C:\\test\\test.xlsx");
		
			XSSFWorkbook wb=new XSSFWorkbook(fi);
			XSSFSheet sh=wb.getSheetAt(0);
			Row r=sh.getRow(0);
			Cell c=r.getCell(0);
			System.out.println(c);
			/*int rowCount=0;
			Row newRow=sh.createRow(rowCount+1);
			//create a loop over the cell of newly created row
			for(int j=0;j<r.getLastCellNum();j++)
			{
				//fill data in row
				Cell cell=newRow createCell(j);
				cell.setCellValue("new data");
			}
			fi.close();*/
			
			WebDriver driver=new ChromeDriver();
			
			
			driver.get(c.toString());
			FileOutputStream webdata=new FileOutputStream("C:\\test\\test1.xlsx");
			wb.write(webdata);
			webdata.close();
		}catch(FileNotFoundException e)
		{
			//TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void createCell(int j) {
		// TODO Auto-generated method stub
		
	}

}


