package Script_1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo 
{
	public static void main(String[] args) throws IOException 
	{
		System.setProperty("Webdriver.gecko.driver", "./jars/geckodriver.exe");
		File f1 = new File("D://tanush.xlsx");
		FileWriter fr = new FileWriter(f1);
		BufferedWriter fbr = new BufferedWriter(fr);
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.nike.com/in/");
		driver.findElement(By.xpath("//a[.='MEN']")).click();
		List<WebElement> ele = driver.findElements(By.xpath("//div[@data-nav='0,1']"));
		for (int i = 0; i < ele.size(); i++) 
		{
			String str = ele.get(i).getText();
			fbr.write(str);
			fbr.flush();
		}
	}
}
