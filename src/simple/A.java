package simple;

import java.util.List;

import org.apache.xerces.util.SynchronizedSymbolTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A 
{
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "E:\\cjc softwares\\Seleniumdata\\chromedriver_win32 (8)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/cjc%20softwares/webtable.html");
		driver.manage().window().maximize();
		
		List<WebElement> rows=driver.findElements(By.tagName("tr"));
		System.out.println("rows are="+rows.size());
		for(WebElement row:rows)
		{
			List<WebElement> columns=row.findElements(By.tagName("td"));
			System.out.println("columns are="+columns.size());
			for(WebElement column:columns)
			{
				System.out.println("content of tables are="+column);
			}
		}
	}

}
