package com.util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.pagefactory.ElementLocator;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.objectproperty.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseMethods extends CommenUtil {

	public static WebDriver driver;
//	final static String LAUNCH_URL = "https://www.hashtag-ca.com/careers/apply?jobCode=QAE001";

	public static void loadurl() {

		try {
			loadproperties();
			launchBrowser();

		} catch (NullPointerException e) {
			e.printStackTrace();

		}

	}

	public static void launchBrowser() {
		switch (Constent.Browser) {
		case "chrome":
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.get(URL);
			break;

		default:
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.get(URL);
			break;
		}

	}
		
	public static void btnClick(WebElement m) {
		m.click();
	}

	
}
