package tiki;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class LocationPopupAction extends PageObject{
	
	WebElementFacade dropdown;
	
	
	public void clickOnAgree() {
		$(By.xpath("//button[@class='apply-btn'][contains(.,'ĐỒNG Ý')]")).click();
	}
	
	public void clickOnRadioButton() {
		$(By.xpath("//span[@class='tikicon icon-radio-button-on']")).click();
	}
	
	public void chooseCity() {
		//how to choose from a dropdown?
		$(By.xpath("(//select[@class='form-control'])[1]")).selectByVisibleText("Hà Nội");
		//dropdown.selectByValue("Hà Nội");
	}
	
	public void chooseDistrict() {
		$(By.xpath("(//select[@class='form-control'])[2]")).selectByVisibleText("Quận Thanh Xuân");
	}
	
	public void chooseWard() {
		$(By.xpath("(//select[@class='form-control'])[3]")).selectByVisibleText("Phường Thanh Xuân Bắc");
	}
	
	public void clickOnAcceptButton() {
		$(By.xpath("//button[@class='apply-btn'][contains(.,'GIAO ĐẾN ĐỊA CHỈ NÀY')]")).click();
	}


}
