package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver(); 
	    driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
	    driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
	    driver.findElement(By.linkText("Create Lead")).click();
	    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
	    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sujitha");
	    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Balaguru");
	    WebElement Source= driver.findElement(By.name("dataSourceId"));
		Select sce=new Select(Source);
		sce.selectByVisibleText("Employee");
		WebElement MarketingCampaign= driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select mc =new Select(MarketingCampaign);
		mc.selectByValue("9001");
		WebElement Ownership= driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select ow =new Select(Ownership);
		ow.selectByIndex(5);
		WebElement Country= driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select co =new Select(Country);
		co.selectByVisibleText("India");
		driver.findElement(By.name("submitButton")).click();
		driver.getTitle();
		String Title= driver.getTitle();
		System.out.println("Leaftaps");

		
	    
	}

}
/* Assignment 1:Create Lead
1. Launch URL "http://leaftaps.com/opentaps/control/login"
2. Enter UserName and Password Using Id Locator
3. Click on Login Button using Class Locator
4. Click on CRM/SFA Link
5. Click on Leads Button
6. Click on create Lead Button
7. Enter CompanyName using id Locator
8. Enter FirstName using id Locator
9. Enter LastName using id Locator
10. Select value as Employee in Source Using SelectbyVisible text
11. Select value as Pay Per Click Advertising in MarketingCampaignId Using SelectbyValue
13. Select value as Corporation in OwnerShip field Using SelectbyIndex
14. Select value as India in Country Field Using SelectbyVisibletext
15. Click on create Lead Button Using name Locator
16. Get the Title of the resulting Page*/