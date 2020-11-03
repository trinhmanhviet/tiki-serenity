package tiki;

import org.openqa.selenium.By;

import net.thucydides.core.pages.PageObject;

public class HomepageTikiAction extends PageObject{
	
	
	public void typeAndroidOnSearchbox() {
		$(By.xpath("//input[contains(@type,'text')]")).type("Android");
	}
	
	public void clickSearchButton() {
		$(By.xpath("//button[@class='FormSearch__Button-sc-1fwg3wo-3 ieXBRV']")).click();
	}
	

}
