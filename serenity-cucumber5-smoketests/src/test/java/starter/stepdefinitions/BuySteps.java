package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import tiki.CartPage;
import tiki.HomepageTiki;
import tiki.LocationPopup;
import tiki.ProductDetailPage;
import tiki.SearchResultPage;

public class BuySteps {
	
	@Steps
	HomepageTiki tikiHome;
	
	@Steps
	SearchResultPage resultPage;
	
	@Steps
	LocationPopup location;
	
	@Steps
	ProductDetailPage productDetail;
	
	@Steps
	CartPage cart;

	
	@Given("user is on tiki home page")
	public void user_is_on_tiki_home_page() {
		
	}

	@Then("he tick on tiki now")
	public void he_tick_on_tiki_now() {
		
	}

	@And("he choose the fifth item")
	public void he_choose_the_fifth_item() {
		
	}

	@And("he verify the product")
	public void he_verify_the_product() {
		
	}

	@And("he add {int} product to cart")
	public void he_add_product_to_cart(Integer int1) {
		
	}

	@Then("he check the cart for the item and price")
	public void he_check_the_cart_for_the_item_and_price() {
		
	}

	
	
}
