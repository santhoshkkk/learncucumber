Feature: Checkout
	Scenario: Checkout bananas and apples
		Given the price of the "banana" is 40rs
		And the price of the "apple" is 25rs
		When I checkout 1 "banana"
		And I checkout 1 "apple"
		Then the total price should be 65rs

