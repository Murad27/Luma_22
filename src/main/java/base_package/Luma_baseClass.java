package base_package;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Luma_baseClass {
	public static WebDriver driver;
	public static Properties prop;
	public static Logger log;
	
	
	public Luma_baseClass()  {                                //Contractor
	
	log=Logger.getLogger("QA Job Seeker Md Mahamudul Hasan Murad");
	PropertyConfigurator.configure("log4jproperties");
	
	prop=new Properties();                                //Create Properties object help of prop
	FileInputStream fl;
	try {
		fl = new FileInputStream("./src/main/java/luma_config_Package/Config.properties");
		prop.load(fl);            //Use load method and read the file
	} catch (IOException e) {
		e.printStackTrace();
	}
	   finally {                                         //Block
		   System.out.println("config file is founding");
	   }
	
	}
	
	
	
	
	public static void Start() {
		
		String browserName=prop.getProperty("browser");  //Inisilize all browser 
		
		
		if(browserName.equalsIgnoreCase("chrome")) {
			log.info("Start Automation in Chrome browser");
			WebDriverManager.chromiumdriver().setup();
		    driver=new ChromeDriver();
			}
		else if(browserName.equalsIgnoreCase("firefox")) {
			log.info("Start Automation in firefox browser");
			WebDriverManager.firefoxdriver().setup();
		    driver=new FirefoxDriver();
			}
		else if(browserName.equalsIgnoreCase("edge")) {
			log.info("Start Automation in Edge browser");
			driver=new EdgeDriver();
			}
		else if (browserName.equalsIgnoreCase("opera")) {
			log.info("Start Automation in Opera browser");
			WebDriverManager.operadriver().setup();
		    driver=new OperaDriver();
		}
		
		
		
		
		
		
		
		
		
		
		
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.get(prop.getProperty("URL"));
	

}
}