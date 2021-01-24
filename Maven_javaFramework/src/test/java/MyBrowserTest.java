import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class MyBrowserTest {

public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe"); 	

WebDriver driver=new ChromeDriver();  


driver.get("https://www.javatpoint.com/selenium-webdriver-browser-commands");  

try {
	Thread.sleep(30);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver.close();

}
}
