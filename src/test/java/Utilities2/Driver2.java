package Utilities2;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver2 {
	
public static WebDriver driver;
	
	// getDriver method
	
	public static WebDriver getDriver() {

        if (driver == null) {

            switch (ConfigurationReader2.getProperty("browser")) {

            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;

            case "chrome-headless":
                WebDriverManager.chromedriver().setup();
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--headless");       
                driver = new ChromeDriver(chromeOptions);
                break;

                
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case "firefox-headless":
                WebDriverManager.firefoxdriver().setup();
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                firefoxOptions.addArguments("--headless");
                driver = new FirefoxDriver(firefoxOptions);
                break;
                
                
            case "edge":
                if (!System.getProperty("os.name").toLowerCase().contains("windows")) {
                    throw new WebDriverException("Your OS doesn't support EDGE");
                }
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;
                
                
            case "safari":
                if (!System.getProperty("os.name").toLowerCase().contains("mac")) {
                    throw new WebDriverException("Your OS doesn't support Safari");
                }
                WebDriverManager.getInstance(SafariDriver.class).setup();
                driver = new SafariDriver();
                break;

            }

            driver.get(ConfigurationReader2.getProperty("url"));
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Constants2.implicitWait_time));
            PageInitializer2.initializer();
  

        }

        return driver;
    }

    // closeDriver method
    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

}
