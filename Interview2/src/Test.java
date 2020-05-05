import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static String product = "//*[@id=\\'menu-item-80216\\']/a";
	public static String product_title = "/html/body/div[6]/main/article/div/div/div/ul/li[1]/div/div[2]/h2/a";
	public static String product_addtocart = "//*[@id=\\\"section-main-description\\\"]/div[2]/div/div/div/div/div[1]/div/div/div[3]/button";
	
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//While running the code in the system, change the driver path to your file
		System.setProperty("webdriver.chrome.driver", "C:\\Sachin and Lakshmi files\\sachin\\chromedriverwin32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    //Open the Algaecal website
	    driver.get("http://www.Algaecal.com/");
	    
	    //Maximize the current window
	    driver.manage().window().maximize();
	    
	    //Redirect to the products section
	    driver.findElement(By.xpath(product)).click();
	    
	    //Sleep for the page to load
	    Thread.sleep(500);
	    
	    //Scroll to Product title
	    JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("javascript:window.scrollBy(250,350)");
        
        //Clicking the product title and redirect to add to cart page
	    driver.findElement(By.xpath(product_title)).click();
	    
	    //Sleep for the page to load
	    Thread.sleep(1000);
	    
	    //Scroll to Product title
	    JavascriptExecutor js1 = (JavascriptExecutor) driver;
	    js1.executeScript("javascript:window.scrollBy(250,350)");
	    
	    //Sleep for the page to load
	    Thread.sleep(500);
	    
	    //Clicking the product add to cart button and redirect to cart page
	    driver.findElement(By.xpath(product_addtocart)).click();
	    
	    //Printing testcase pass message
	    System.out.println("Pass");
	}

}
