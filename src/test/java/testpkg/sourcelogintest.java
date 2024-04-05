package testpkg;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Basepkg.sourcebase;

import Exlutlise.utlise;
import pagepkg.sauceLoginPage;



public class sourcelogintest extends sourcebase{
	@Test
	public void verifyloginwithvalidcred()throws Exception
	{
		sauceLoginPage p1=new sauceLoginPage (driver);
		String x1="C:\\Users\\devik\\OneDrive\\Desktop\\sourcedemo.xlsx";
		String sheet="Sheet1";
		int rowCount=utlise.getrowcount(x1, sheet);
		for(int i=1;i<=rowCount;i++)
	{
		String UserName =utlise.getcellvalue(x1, sheet, i, 0);
		System.out.println("username ----   "+UserName);
		String Pwd=utlise.getcellvalue(x1, sheet, i, 1);
		System.out.println("password ---     "+Pwd);
			p1.setvalues(UserName, Pwd);
		p1.loginclick();
	
			
		}
		
				
//	}
	
//}
	
	}
}

		
			
