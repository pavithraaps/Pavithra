import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Recruitments {
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Utilities\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
		WebElement login=driver.findElement(By.xpath("//input[@type='submit']"));
		login.click();
		
		WebElement Requirement=driver.findElement(By.xpath("//*[@id=\"menu_recruitment_viewRecruitmentModule\"]/b"));
		Requirement.click();
		WebElement vacancy=driver.findElement(By.xpath("//*[@id='menu_recruitment_viewJobVacancy']"));
		vacancy.click();
		
		
	    WebElement Add=driver.findElement(By.xpath("//input[@id='btnAdd']"));
		Add.click();
		WebElement jobtitle=driver.findElement(By.xpath("//select[@name='addJobVacancy[jobTitle]']"));
		Select jobti=new Select(jobtitle);
		jobti.selectByVisibleText("QA Engineer");
		driver.findElement(By.xpath("//input[@name='addJobVacancy[name]']")).sendKeys("Engineer");
		driver.findElement( By.xpath("//input[@id=\"addJobVacancy_hiringManager\"]")).sendKeys("Varmaa Rajeshh");
		driver.findElement( By.xpath(" //input[@id='addJobVacancy_noOfPositions']")).sendKeys("5");
		driver.findElement( By.xpath("//*[@id=\"addJobVacancy_description\"]")).sendKeys("Need SmartWorker");
		WebElement active=driver.findElement( By.xpath("//input[@value='on']"));
		active.click();
		WebElement save=driver.findElement(By.xpath("//input[@name='btnSave']"));
		save.click();
		

	}

}
