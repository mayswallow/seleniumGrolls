Feature: buyTshirts
In order to avoid silly mistakes As a math idiot I want to be told the sum of two numbers

Background: 
Given I have entered https://www.grolls.se/helags-t-shirt--svart1100099.html

Scenario: Buy two t-shirts

Given Select size small

And Select 2 shirts

When Press buy

Then Result 2 shirts bought