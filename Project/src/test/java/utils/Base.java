package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base {

	 public static WebDriver driver;
		public void openBrowser() throws IOException {
			ChromeOptions opt=new ChromeOptions();
			opt.addArguments("--disable-notifications");
			driver=new ChromeDriver(opt);
			driver.manage().window().maximize();
			String path=System.getProperty("user.dir")+"/config/browser.properties";
			FileInputStream file=new FileInputStream(path);
			Properties prop=new Properties();
			prop.load(file);
			String val=prop.getProperty("url");
			driver.get(val);
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		}

}
