Feature: Checkout
	Scenario Outline: Checkout bananas
		Given the price of the "banana" is 40rs
		And the price of a "apple" is 25rs
		When I checkout 1 "banana"
		And I checkout 1 "apple"
		Then the total price should be 65rs

