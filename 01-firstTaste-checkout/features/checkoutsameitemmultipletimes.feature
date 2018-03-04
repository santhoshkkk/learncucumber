Feature: Checkout
	Scenario: Checkout multiple bananas
		Given the price of the "banana" is 40rs
		When I checkout 1 "banana"
		And I checkout 1 "banana"
		Then the total price should be 80rs

