import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Divya\\chromedriver_win32\\chromedriver.exe");
			WebDriver mydriver = new ChromeDriver();
			mydriver.get("https://https://heroku.com/login");
			mydriver.manage().window().maximize();
			// mydriver.findElement(By.xpath("//*[@id=\'at-cv-lightbox-close\']")).click();

	}

}
