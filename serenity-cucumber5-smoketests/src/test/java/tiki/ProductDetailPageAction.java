package tiki;

import org.openqa.selenium.By;

import net.thucydides.core.pages.PageObject;

public class ProductDetailPageAction extends PageObject{
	
	SearchResultPageAction resultPage; 
	
	public String newProductName;
	
	public void verifyProduct() {
		newProductName = $(By.xpath("//h1[@class='title']")).getText();
		if(newProductName.equals(resultPage.oldProductName)) {
			clickOnAddQuantityButton();
			clickOnBuyButton();
		}
	}
	
	public void clickOnAddQuantityButton() {
		$(By.xpath("//img[contains(@src,'v2/icons-add.svg')]")).click();
	}
	
	public void clickOnBuyButton() {
		$(By.xpath("//button[@class='btn btn-add-to-cart'][contains(.,'Chọn mua')]")).click();
	}
	

}
