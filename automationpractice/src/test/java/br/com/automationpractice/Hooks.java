package br.com.automationpractice;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hooks {
	
	
	public static WebDriver driver = null;	
		
	@Before
	public void  setup(String url) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Webdriver\\bin\\chromedriver.exe");
		    ChromeOptions options = new ChromeOptions();
		    options.addArguments("--headless");
		    driver = new ChromeDriver(options);
		    driver.get(url);
		    driver.manage().window().maximize();
		   
		  }
		
	
    @After
	public void finalizar() {
		
		driver.quit();
		
	}
	}
	
	