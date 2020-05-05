import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Sachin and Lakshmi files\\sachin\\chromedriverwin32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("http://www.Algaecal.com/");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//*[@id=\'menu-item-80216\']/a")).click();
	    Thread.sleep(500);
	    JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("javascript:window.scrollBy(250,350)");
	    driver.findElement(By.xpath("/html/body/div[6]/main/article/div/div/div/ul/li[1]/div/div[2]/h2/a")).click();
	    Thread.sleep(1000);
	    JavascriptExecutor js1 = (JavascriptExecutor) driver;
	    js1.executeScript("javascript:window.scrollBy(250,350)");
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//*[@id=\"section-main-description\"]/div[2]/div/div/div/div/div[1]/div/div/div[3]/button")).click();
	    System.out.println("Pass");
	}

}
