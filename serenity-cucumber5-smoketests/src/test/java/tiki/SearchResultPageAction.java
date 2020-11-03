package tiki;

import org.openqa.selenium.By;

import net.thucydides.core.pages.PageObject;

public class SearchResultPageAction extends PageObject{
	
	public String oldProductName;
	public String oldProducePrice;
	
	
	public void clickOnTikiNowCheckbox() {
		$(By.xpath("//span[contains(@class,'tikicon icon-tikinow-19')]")).click();
	}
	
	public void clickOnThe5thItem() {
		oldProductName = $(By.xpath("//a[@class='search-a-product-item'][@data-id='20272019']")).getTextContent();
		$(By.xpath("(//p[@class='title'])[5]")).click();
	}
	

}
