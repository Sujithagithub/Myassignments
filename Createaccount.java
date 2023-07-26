package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Createaccount {

	public static void main(String[] args) 
		{
	
			ChromeDriver driver=new ChromeDriver(); 
		    driver.get("http://leaftaps.com/opentaps/control/login");
			driver.manage().window().maximize();
		    driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.linkText("CRM/SFA")).click();
			driver.findElement(By.linkText("Accounts")).click();
			driver.findElement(By.linkText("Create Account")).click();
			driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit Limited Account");
		    driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
			driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("Debit Ltd Acct");
			driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("A AND CO");
			driver.findElement(By.xpath("(//input[@class='inputBox'])[5]")).sendKeys("250000000");
			WebElement Industry= driver.findElement(By.name("industryEnumId"));
			Select st =new Select(Industry);
			st.selectByVisibleText("Computer Software");
			WebElement Ownership= driver.findElement(By.name("ownershipEnumId"));
			Select ow =new Select(Ownership);
			ow.selectByVisibleText("S-Corporation");
            WebElement Source= driver.findElement(By.id("dataSourceId"));
			Select src =new Select(Source);
			src.selectByValue("LEAD_EMPLOYEE");
			WebElement MarketingCampaign= driver.findElement(By.id("marketingCampaignId"));
			Select mc =new Select(MarketingCampaign);
			mc.selectByIndex(6);
			WebElement State= driver.findElement(By.name("generalStateProvinceGeoId"));
			Select sp =new Select(State);
			sp.selectByValue("TX");
			driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
			
			
/*verify title			String title = driver.getTitle();
        
        if(title.equalsIgnoreCase("Create Account | opentaps CRM")) {
            System.out.println("Title verified");
        }else {
            System.out.println("Title not verified");
        }
    }*/

			
			


			
		
			
		/*Assignment 3:CreateAccount 

		
		   1. Launch URL "http://leaftaps.com/opentaps/control/login"
		   
		   2. Enter UserName and Password Using Id Locator
		   
		   3. Click on Login Button using Class Locator
		   
		   4. Click on CRM/SFA Link
		   
		   5. Click on Accounts Button
		   
		   6. Click on Create Account
		    
		   7. Enter AccountName Field Using Xpath Locator value as Debit Limited Account
		   
		   8. Enter DEscriptiion as "Selenium Automation Tester"
		   
		   9. Enter LocalName Field Using Xpath Locator
		   
		   10. Enter SiteName Field Using Xpath Locator
		   
		   11. Enter value for AnnualRevenue Field using Xpath Locator but class as Attribute
		   
		   12. Select Industry as ComputerSoftware
		   
		   13. Select OwnerShip as S-Corporation using SelectByVisibletext
		   
		   14. Select Source as Employee using SelectByValue
		   
		   15. Select Marketing Campaign as eCommerce Site Internal Campaign using SelectbyIndex
		   
		   16. Select State/Province as Texas using SelectByValue 
		   
		  117. Click on Create Account using Xpath Locator*/
	}

}
