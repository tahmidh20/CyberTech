package pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import techBase.BaseClass;

public class CyberTechHomepage extends BaseClass  {
	
	//@FindBy(xpath = "//a[contains(text(),'Select Courses')]")
	//WebElement selectCourses;
	By selectCourses = By.xpath("//a[contains(text(),'Select Courses')]");
	
	//@FindBy(id = "mega-menu-item-609")
	//WebElement marketingClass_1;
	By marketingClass_1 = By.id("mega-menu-item-609");
	
	//@FindBy(id = "mega-menu-item-610")
	//WebElement marketingClass_2;
	By marketingClass_2 = By.id("mega-menu-item-610");
	
	//@FindBy(id = "mega-menu-item-611")
	//WebElement marketingClass_3;
	By marketingClass_3 = By.id("mega-menu-item-611");
	
	//@FindBy(id = "mega-menu-item-612")
	//WebElement marketingClass_4;
	By marketingClass_4 = By.id("mega-menu-item-612");
	
	By project_manage_Class_1 = By.id("mega-menu-item-620");
	
	By businessClass_1 = By.id("mega-menu-item-618");
	
	By businessClass_2 = By.id("mega-menu-item-621");
	
	By businessClass_3 = By.id("mega-menu-item-623");
	
	By financeClass_1 = By.id("mega-menu-item-619");
	
	By mathClass_1 = By.id("mega-menu-item-617");
	
	By salesClass_1 = By.id("mega-menu-item-622");
	
	//@FindBy(name = "name")
	//WebElement FirstName;
	By FirstName = By.name("name");
	
	//@FindBy(name = "email")
	//WebElement Email;
	By Email = By.name("email");
	
	//@FindBy(name = "mobile")
	//WebElement PhoneNumber;
	By PhoneNumber = By.name("mobile");
	
    //@FindBy(xpath = "//button[contains(text(),'Join Demo Class')]")
	//WebElement submitBtn;
	By submitBtn = By.xpath("//button[contains(text(),'Join Demo Class')]");
	
	
	public CyberTechHomepage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickSelectCourses() {
		driver.findElement(selectCourses).click();
		
	}
	
	public void NutritionClass_1() {
		driver.findElement(marketingClass_1).click();
	}
		
	public void nameTxtField(String name) {
		driver.findElement(FirstName).sendKeys(name);
	}
		
    public void emailTxtField(String EmailAddress) {
    	driver.findElement(Email).sendKeys(EmailAddress);
    }
		
    public void phoneTxtField(String Phone) {
    	driver.findElement(PhoneNumber).sendKeys(Phone);
		
	}
	
	public void NutritionClass_2() {
		driver.findElement(marketingClass_2).click();
		
		
		
	}
	
	public void PHPclass() {
		driver.findElement(marketingClass_3).click();
		
		
	}
	
	public void WordPress() {
		driver.findElement(marketingClass_4).click();
			
	}
	
	public void Learn3DModelling() {
		driver.findElement(project_manage_Class_1).click();
	}
	
	public void PhotoshopTraining() {
		driver.findElement(businessClass_1).click();
	}
	
	public void PracticalSales() { 
		driver.findElement(businessClass_2).click();
	}
	
	public void FinancialAnalyst() {
		driver.findElement(businessClass_3).click();
		
	}
	
	public void UserExperienceDesign() {
		driver.findElement(financeClass_1).click();
	}
	
	public void JavaScript() {
		driver.findElement(mathClass_1).click();
	}
	
	public void TrelloFundamentals() {
		driver.findElement(salesClass_1).click();
	}
	
	public void JoinDemo() {
		driver.findElement(submitBtn).click();
	}
	
	
	
	

}
