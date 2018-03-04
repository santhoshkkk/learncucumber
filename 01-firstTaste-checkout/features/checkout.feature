Feature: Checkout
	Scenario Outline: Checkout bananas
		Given the price of the "banana" is 40rs
		When I checkout <count> "banana"
		Then the total price should be <total>rs

		Examples:
		| count | total |
		|	1	| 	40	|
		|	2	|	80	|

