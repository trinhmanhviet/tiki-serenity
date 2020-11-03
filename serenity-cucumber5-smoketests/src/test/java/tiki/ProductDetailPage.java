package tiki;

import net.thucydides.core.annotations.Step;

public class ProductDetailPage {
	
	ProductDetailPageAction productDetaiAction;
	
	
	@Step
	public void verifyProduct() {
		productDetaiAction.verifyProduct();
	}
	
	

}
