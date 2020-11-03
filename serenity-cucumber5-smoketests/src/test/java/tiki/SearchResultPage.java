package tiki;

import net.thucydides.core.annotations.Step;

public class SearchResultPage {
	
	SearchResultPageAction resultPageAction;
	

	
	@Step
	public void chooseTikiNow() {
		resultPageAction.clickOnTikiNowCheckbox();
	}
	
	@Step
	public void chooseTheFifthItem() {
		resultPageAction.clickOnThe5thItem();
	}
	

}
