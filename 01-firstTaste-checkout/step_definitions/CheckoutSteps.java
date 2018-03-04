package step_definitions;

import cucumber.api.java.en.*;
import cucumber.api.PendingException;
import implementation.Checkout;
import static org.junit.Assert.*;
import java.util.*;

public class CheckoutSteps {
	Map<String, Integer> itemPrices = new HashMap<String, Integer>();
	Checkout checkout = new Checkout();

	@Given("^the price of the \"([^\"]*)\" is (\\d+)rs$")
	public void thePriceOfTheIsRs(String itemName, int price) throws Throwable {
		itemPrices.put(itemName, price);
	}

	@When("^I checkout (\\d+) \"([^\"]*)\"$")
	public void iCheckout(int itemCount, String itemName) throws Throwable {
		checkout.add(itemCount, itemPrices.get(itemName));
	}

	@Then("^the total price should be (\\d+)rs$")
	public void theTotalPriceShouldBeRs(int total) throws Throwable {
		assertEquals(total, checkout.total());
	}


}