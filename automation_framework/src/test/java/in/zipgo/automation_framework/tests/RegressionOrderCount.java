/*package in.zipgo.automation_framework.tests;

import java.io.IOException;
import java.net.MalformedURLException;
import java.text.ParseException;

import org.testng.annotations.Test;

import in.zipgo.automation_framework.base.DriverFactory;
import in.zipgo.automation_framework.pages.web.CreateOrder;
import in.zipgo.automation_framework.pages.web.CreateTrip_helper;
import in.zipgo.automation_framework.pages.web.Googlelogin;
import in.zipgo.automation_framework.pages.web.HomePageDashboard;
import in.zipgo.automation_framework.pages.web.SignInPage;
import in.zipgo.automation_framework.workflow.Dashboardlevelone;
import in.zipgo.automation_framework.workflow.DashboardleveloneImplementation;
import in.zipgo.automation_framework.workflow.ZipGoWorkFlowImplementations;
import in.zipgo.automation_framework.workflow.ZipGoWorkflows;
import jxl.read.biff.BiffException;

public class RegressionOrderCount {
	 @Test(priority=1)
     public void opendashboard() throws MalformedURLException {
	       
			DriverFactory.createWebDriverInstance();	               
	        ZipGoWorkflows zgw = new ZipGoWorkFlowImplementations();
	        SignInPage signInPage = zgw.openSignInPage();
           zgw.navigateToLoginPage(signInPage);       
	  }
	  
	 @Test(priority=2)
     public void logintodashboard(){
          Dashboardlevelone dash=new DashboardleveloneImplementation();
          Googlelogin goglog=new Googlelogin();      
          dash.logintogmail(goglog);       
     }
	 
	 @Test(priority=3)
	  public void createRacTrip() throws BiffException, IOException, InterruptedException, ParseException {		  
          Dashboardlevelone dash=new DashboardleveloneImplementation();
          HomePageDashboard home=new HomePageDashboard();
	       dash.homepage(home);
	       CreateTrip_helper createtrip1 =new CreateTrip_helper();		       
	     
	       dash.createractrip(createtrip1);
	       
	  }
	 @Test(priority=11)
	  public void createnewOrder() throws BiffException, IOException {			  
         Dashboardlevelone dash=new DashboardleveloneImplementation();
		  CreateOrder neworder=new CreateOrder();
		  dash.createracorder(neworder);
		 
	  }
}
*/