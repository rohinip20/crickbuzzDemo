package simple;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Crickbuzz {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "E:\\cjc softwares\\Seleniumdata\\chromedriver_win32 (8)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.cricbuzz.com/");
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/20301/aus-vs-ind-1st-test-india-tour-of-australia-2018-19");
		driver.manage().window().maximize();
		/*driver.findElement(By.id("live-scores-link")).click();
		driver.findElement(By.xpath("//a[@title='Australia vs India']")).click();
		driver.findElement(By.xpath("//a[text()='Scorecard']")).click();
		*/
		List<WebElement> wb=driver.findElements(By.xpath("//div[@id='innings_1']//div[@class='cb-col cb-col-100 cb-scrd-itms']//div[@class='cb-col cb-col-8 text-right text-bold']"));
		//String wb1=driver.findElement(By.xpath("//div[@id='innings_1']/div[1]/div[@class='cb-col cb-col-100 cb-scrd-itms']/div[@class='cb-col cb-col-8 text-bold cb-text-black text-right']")).getText();
		int extra=Integer.parseInt(driver.findElement(By.xpath("//div[@id='innings_1']/div[1]/div[@class='cb-col cb-col-100 cb-scrd-itms']/div[@class='cb-col cb-col-8 text-bold cb-text-black text-right']")).getText());
		//int extras=Integer.parseInt(wb1);
		int last_value=0;
		for(WebElement run:wb)
		{
			//System.out.println(run.getText());
			String run1=run.getText();
			int all_run=Integer.parseInt(run1);
			 last_value=all_run+last_value;
        }
		int value=extra+last_value;
        System.out.println("total run is="+value);	
		
	  //  String total_score=driver.findElement(By.xpath("//div[@id='innings_1']/div[1]/div[@class='cb-col cb-col-100 cb-scrd-itms']/div[@class='cb-col cb-col-8 text-bold text-black text-right')).getText();
	    int actual_score=Integer.parseInt(driver.findElement(By.xpath("//div[@id='innings_1']/div[1]/div[@class='cb-col cb-col-100 cb-scrd-itms']/div[@class='cb-col cb-col-8 text-bold text-black text-right']")).getText());
	    System.out.println("total score is"+actual_score);
		
	    if(value==actual_score)
	    {
	    	System.out.println("total score is matched");
	    }
	
	}

}
