package in.zipgo.automation_framework.pages.web;

import java.io.File;
import java.io.IOException;
import java.util.Locale;

import org.openqa.selenium.By;

import com.gargoylesoftware.htmlunit.javascript.host.intl.NumberFormat;

import junit.framework.Assert;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Moneymemberbalcheck extends BasePage {

	
	final By clipchevoronright         = By.xpath("//i[@class='clip-chevron-right']");
	final By customer                  = By.xpath("//span[text()='Customers']");
	final By customerlist              = By.xpath("//span[text()='Customer List']");
	final By search                    = By.xpath("//input[@type='search']");
	final By clickcustomerid		   = By.xpath("//a[@class='edit-cab']");
	final By clickwallets              = By.xpath("//a[@href='#all_wallets']");
	final By virtualwalletaudit        = By.xpath("(//a[text()='Virtual Wallet Audits'])[1]");
	final By auditvirtual              = By.xpath("//div[@id='audits']/descendant::*[1]/descendant::*[4]");
	final By moneywallet               = By.xpath("//a[@href='#money']");
	
	final By realmoney                 = By.xpath("//div[@id='money_sub']/descendant::*[5]");
	
	
	public Moneymemberbalcheck virtualcheck() throws BiffException, IOException, InterruptedException {
		
		
	    
		File datafile=new File("C:\\Users\\Lenovo\\Automation_Zipgo\\autoscripts_master\\src\\test\\resources\\testData\\MoneyCustomersList.xls");
 	    Workbook rwb=Workbook.getWorkbook(datafile);
 	    
 	      int nous=rwb.getNumberOfSheets();   	     
	 	  Sheet rsh=rwb.getSheet(0);
		  int nour=rsh.getRows();
	      int nouc=rsh.getColumns(); 
 	      String Discountbasedvirtualcustomer         =rsh.getCell(0, 2).getContents();
          String DiscrealID                           =rsh.getCell(2, 2).getContents();
		
		handledSleep(3);	       
	    implictwait(30);	      
	    clickButton(waitForElement(clipchevoronright));
	    handledSleep(1);	       
	    implictwait(30);	      
	    clickButton(waitForElement(customer));
	    handledSleep(1);	       
	    implictwait(30);	      
	    clickButton(waitForElement(customerlist));
	    handledSleep(3);	       
	    implictwait(30);	
		sendValuesToWebElement(waitForElement(search),Discountbasedvirtualcustomer);
	    handledSleep(3);	       
	    implictwait(30);	
		String customerID =waitForElement(clickcustomerid).getText();
		if(DiscrealID.contains(customerID)) {		
	    Assert.assertTrue(true);
		}
	    handledSleep(3);	       
		implictwait(30);	
		clickButton(waitForElement(clickcustomerid));
		handledSleep(1);	       
		implictwait(30);	      
	    clickButton(waitForElement(clickwallets));
	    handledSleep(1);	       
		implictwait(30);	      
	    clickButton(waitForElement(virtualwalletaudit));
	    handledSleep(1);	       
		implictwait(30);	 
		String stringvirtualbal =waitForElement(auditvirtual).getText();
		String[]  stringvirtualbal1 =stringvirtualbal.split(" ");
		String stringvirtualbal2=stringvirtualbal1[1];
		System.out.println(stringvirtualbal2);
		Thread.sleep(2000);
		
		double d = Double.parseDouble(stringvirtualbal2.replace(",", ""));


		String[]  stringvirtualbal3 =stringvirtualbal2.split("");
		String stringvirtualbal4=stringvirtualbal3[1];
		System.out.println(stringvirtualbal2);
		
		
		
		
		//int virtualbal =Integer.parseInt(stringvirtualbal4);
		
	    
		return this;
		
		
	}
	
	
	
	
	

}
