package Exlutlise;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class utlise {
	public static String getcellvalue(String x1,String sheet,int r,int c)
	{
		try
		{
			FileInputStream fi= new FileInputStream(x1);
			XSSFWorkbook wb= new XSSFWorkbook(fi);
			XSSFCell cell=wb.getSheet(sheet).getRow(r).getCell(c);
			if(cell.getCellType()==CellType.STRING)
			{
				return cell.getStringCellValue();
			}
			else 
			{
				return cell.getRawValue();
			}
		}
			catch(Exception e)
			{
				return "";
				
			}
		}
			public static int getrawcount(String x1,String sheet)
			{
				
				{
					return 0;
			
			}
			
		}
			public static int getrowcount(String x1, String sheet) {
				try
				{
					FileInputStream fi = new FileInputStream(x1);
					XSSFWorkbook wb= new XSSFWorkbook(fi);
					return wb.getSheet(sheet).getLastRowNum();
					
				
			}
				catch(Exception e)
				{
				
				// TODO Auto-generated method stub
				return 0;
			}
			}
}

	


