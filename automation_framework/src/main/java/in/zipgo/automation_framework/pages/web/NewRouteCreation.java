package in.zipgo.automation_framework.pages.web;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class NewRouteCreation extends BasePage {
	
	
	final By iconsearch              = By.xpath("//i[@class='icon-search']");
	final By uisearchmenu            = By.xpath("//input[@class='ui-autocomplete-input']");
	final By routeselement           = By.xpath("(//span[text()='Routes'])[1]");		
	final By createnewroute          = By.xpath("//a[text()='Create New']");
	final By sourceofroute           = By.xpath("//input[@name='route_group[from]']");
	final By destinationofroute      = By.xpath("//input[@name='route_group[to]']");
	final By routegroupname          = By.xpath("//input[@name='route_group[name]']");
	final By routegroupcode          = By.xpath("//input[@name='route_group[code]']");
	final By routevia                = By.xpath("//input[@name='route_group[via]']");
	final By routedisplayname        = By.xpath("//input[@name='route_group[display_category_name]']");
	final By radiobutoneta           = By.xpath("(//input[@name='route_group[eta_for_destination]'])[2]");
	final By radiobuttonupdate       = By.xpath("//input[@name='update_cab_trips']");
	final By selecttradearea         = By.xpath("//span[@title='Select a tradearea']");
	final By tradeareabox            = By.xpath("(//input[@type='search'])[2]");
	final By selectoperation         = By.xpath("//span[@title='No']");
	final By saveroute               = By.xpath("(//a[text()='Save'])[1]");
	
	final By routesTab               = By.xpath("//a[@id='route_tab']");
	final By addroute                = By.xpath("//a[@id='add_new_stop']");
	final By stoppointname           = By.xpath("//span[@title='Type a stop point name']");
	final By enterstoppoint          = By.xpath("(//input[@type='search'])[2]");
	
	final By settingstab             = By.xpath("(//a[text()='Setting'])[1]");
	
	
	public NewRouteCreation newroutes() throws BiffException, IOException {
		
		
		File datafile=new File("C:\\Users\\Lenovo\\Automation_Zipgo\\autoscripts_master\\src\\test\\resources\\testData\\NewRoutes.xls");
	 	Workbook rwb=Workbook.getWorkbook(datafile);
	 	Sheet rsh=rwb.getSheet(0);
	 	
        String source           =rsh.getCell(1, 0).getContents();
        String destination      =rsh.getCell(1, 1).getContents();
        String groupname        =rsh.getCell(1, 2).getContents();
        String groupcode        =rsh.getCell(1, 3).getContents();
        String via              =rsh.getCell(1, 4).getContents();
        String Displayname      =rsh.getCell(1, 5).getContents();
        String tradearea        =rsh.getCell(1, 6).getContents();
        
		
		
	    handledSleep(2);
	    implictwait(40);
	    moveToElement(iconsearch);
	    handledSleep(2);
	    implictwait(40);
        clickButton(waitForElement(uisearchmenu));
		sendValuesToWebElement(waitForElement(uisearchmenu),"route");
		handledSleep(2);
	    implictwait(40);
        clickButton(waitForElement(routeselement));
        handledSleep(2);
	    implictwait(40);
        clickButton(waitForElement(createnewroute));
        handledSleep(2);
	    implictwait(40);
		sendValuesToWebElement(waitForElement(sourceofroute),source);
		handledSleep(1);
	    implictwait(40);
		sendValuesToWebElement(waitForElement(destinationofroute),destination);
		handledSleep(1);
	    implictwait(40);
		//sendValuesToWebElement(waitForElement(routegroupname),groupname);
		//handledSleep(2);
	    implictwait(40);
		sendValuesToWebElement(waitForElement(routegroupcode),groupcode);
		handledSleep(1);
	    implictwait(40);
		sendValuesToWebElement(waitForElement(routevia),via);
		handledSleep(1);
	    implictwait(40);
		sendValuesToWebElement(waitForElement(routedisplayname),Displayname);
		handledSleep(1);
	    implictwait(40);
		selectradiobutton(waitForElement(radiobutoneta));
		handledSleep(1);
		implictwait(40);
	    clickButton(waitForElement(selecttradearea));
	    handledSleep(1);
		implictwait(40);
		sendValuesToWebElement(waitForElement(tradeareabox),tradearea);
		implictwait(40);
        actionenter();
        handledSleep(1);
		implictwait(40);
	    //clickButton(waitForElement(saveroute));	  
	 	clickButton(waitForElement(routesTab));
	 	handledSleep(2);
		implictwait(40);
		
		
		
		
		File datafile1=new File("C:\\Users\\Lenovo\\Automation_Zipgo\\autoscripts_master\\src\\test\\resources\\testData\\Addstoppoints.xls");
	 	Workbook rwb1=Workbook.getWorkbook(datafile1);
	 	Sheet rsh1=rwb1.getSheet(0);
 		int nour1=rsh1.getRows();
 		handledSleep(1);
		implictwait(40);
		int j;
 		for( j=0;j<nour1;j++) {
 			
 			String stoppoints           =rsh1.getCell(0, j).getContents();
 			handledSleep(1);
 			implictwait(40); 
 			clickButton(waitForElement(addroute));
 			handledSleep(2);
 			implictwait(40);
 			clickButton(waitForElement(stoppointname));		
 			sendValuesToWebElement(waitForElement(enterstoppoint),stoppoints);
 			handledSleep(1);
 			actionenter();

 		}
		
 		handledSleep(1);
		implictwait(40);
		clickButton(waitForElement(settingstab));
		handledSleep(1);
		implictwait(40);
		//clickButton(waitForElement(saveroute));	
		
		
		return this;
	}

}
