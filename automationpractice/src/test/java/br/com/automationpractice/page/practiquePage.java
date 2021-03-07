package br.com.automationpractice.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import br.com.automationpractice.Hooks;

public class practiquePage extends Hooks {
	
	public void navegar() {
		 WebElement searchBox = driver.findElement(By.name("q"));
		 searchBox.sendKeys("ChromeDriver");
		 searchBox.submit();
	}
	
	public void clicarElementoTitle(String mapeamento) {
		
		WebElement elemento = driver.findElement(By.xpath("//a[@title='Women']"));
		elemento.click();
	}
	
	public String receberElemento() {
		
		WebElement elementocategoria = driver.findElement(By.xpath("//span[@class=\"category-name\"]"));
		//elementocategoria.getText();
		return elementocategoria.getText();
	} 

	
}
