package BaseLayer;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass {

	protected static Properties prop;
	protected static WebDriver driver;

	public BaseClass() {
		File f = new File(System.getProperty("user.dir") + "\\src\\main\\java\\ConfigurationLayer\\config.properties");
		try {
			FileInputStream fis = new FileInputStream(f);
			prop = new Properties();
			prop.load(fis);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void initialization(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			// System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")
			// + "\\AllDriver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else if (browser.equalsIgnoreCase("incognito")) {
			ChromeOptions opt = new ChromeOptions();
			opt.addArguments("--incognito");
			driver = new ChromeDriver(opt);
		}
		  else if(browser.equalsIgnoreCase("headless")) 
		  { 
		  ChromeOptions opt = new ChromeOptions(); 
		  opt.addArguments("--headless"); 
		  driver = new ChromeDriver(opt); 
		  }
		  else
		  {
			  System.err.println("please enter valid browser name");
		  }

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().deleteAllCookies();
	
	}

}
