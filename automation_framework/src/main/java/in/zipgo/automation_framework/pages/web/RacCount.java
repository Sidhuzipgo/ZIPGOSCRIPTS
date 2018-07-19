package in.zipgo.automation_framework.pages.web;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class RacCount extends BasePage {
	
	
	final By clipchevoronright     = By.xpath("//i[@class='clip-chevron-right']");
    final By transportation        = By.xpath("//span[text()='Transportation']");
	final By bustrips              = By.xpath("//span[text()='Bus Trips']");
	final By searchbox             = By.xpath("//input[@type='search']");
	final By glyphiconedit         = By.xpath("//span[@class='glyphicon glyphicon-edit']");
	final By regulation            = By.xpath("//a[@href='#regulations']");
	
	
	
	final By maxseats              = By.xpath("(//div[@class='col-md-9'])[2]");
	final By racseats              = By.xpath("(//div[@class='col-md-9'])[3]");
	
	final By firststoparrival      = By.xpath("(//tbody[@class='tracks-arrivals']/child::*[1])/descendant::*[14]");
	final By firststopbooked       = By.xpath("(//tbody[@class='tracks-arrivals']/child::*[1])/descendant::*[15]");
	final By firststopracavail     = By.xpath("(//tbody[@class='tracks-arrivals']/child::*[1])/descendant::*[16]");
	final By firststopracbook      = By.xpath("(//tbody[@class='tracks-arrivals']/child::*[1])/descendant::*[17]");
	
	
	
	 public RacCount validate_rac_count() throws BiffException, IOException {
		 
		 
	      File datafile=new File("C:\\Users\\Lenovo\\Automation_Zipgo\\autoscripts_master\\src\\test\\resources\\testData\\Rac.xls");
	 	  Workbook rwb=Workbook.getWorkbook(datafile);
	 	  int nous=rwb.getNumberOfSheets();  
	 	  for(int sheets=0;sheets<nous;sheets++){
	 			 Sheet rsh=rwb.getSheet(sheets);
	 	 		 int nour=rsh.getRows();
	 	 	     int nouc=rsh.getColumns();	
	 	 	     
	 	   String cabnamedata         =rsh.getCell(1, 1).getContents();

	 	 	     
	 	   refresh();
	       clickButton(waitForElement(clipchevoronright));
	       clickButton(waitForElement(transportation));
		   clickButton(waitForElement(bustrips));
		   sendValuesToWebElement(waitForElement(searchbox),cabnamedata);
		   clickButton(waitForElement(glyphiconedit));
		   
		   String maxnoseats=waitForElement(maxseats).getText();
		   int maxxseats=Integer.parseInt(maxnoseats);
		   String racnoseat=waitForElement(racseats).getText();
		   int raccseat=Integer.parseInt(racnoseat);
           
		   clickButton(waitForElement(regulation));
		   String firstavailseat1      = waitForElement(firststoparrival).getText();
		   String firstbookseat1       = waitForElement(firststopbooked).getText();
		   String firstracavailseat1   = waitForElement(firststopracavail).getText();
		   String firstracbookseat1    = waitForElement(firststopracbook).getText();

		   int firstavailseat          = Integer.parseInt(firstracavailseat1);
		   int firstbookseat           = Integer.parseInt(firstracbookseat1);
		   int firstracavailseat       = Integer.parseInt(firstracavailseat1);
		   int firstracbookseat        = Integer.parseInt(firstracbookseat1);
		   
		   

           

		   
	 		
	 		
	 		}
	 	 	     
		 
		  
		  



		 
		return this;
		 
	 }



	

}
