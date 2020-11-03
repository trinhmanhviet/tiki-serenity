package tiki;

import net.thucydides.core.annotations.Step;

public class HomepageTiki {
	
	HomepageTikiAction homepageAction;

	
	@Step
	public void searchForAndroid() {
		homepageAction.typeAndroidOnSearchbox();
	}
	
	@Step
	public void clickOnSearchButton() {
		homepageAction.clickSearchButton();
	}
	
	
}
