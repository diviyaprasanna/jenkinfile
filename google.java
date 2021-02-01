import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Divya\\chromedriver_win32\\chromedriver.exe" );
        WebDriver seldriver=new ChromeDriver();
        seldriver.get("https://www.google.com");
        String x = seldriver.getTitle();
        System.out.println(x);
        seldriver.quit();
        	
	}

}
