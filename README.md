Kata Supermarket Refactoring
====

The following TDD Kata is a variation of the classical [Supermarket Kata](http://codekata.com/kata/kata01-supermarket-pricing/).  

In this version I put together a legacy code base to be altered with new functionalities; there are a couple of tests to prove it works.  

The TDD approach want you to cover the code by tests and then refactor it before start adding features.

How to conduct the kata
===

Setup and Overview
---
* Make your attendees fork this repository to obtain the legacy code base (stored in master branch)  
* Make them create a new branch for executing the kata
* Start asking them adding a new feature in that messy code
  * they would extend the test coverage and refactor existing code before
* Continue adding feature using TDD Test First approach

Rules
---

1. People works in pairs
2. Work will be done in rounds composed of 2 time slots of 10-15 minutes each
3. First round
   1. After 1st slot, driver and navigator swap their role
   2. After the 2nd slot, driver becomes the navigator of another pair
4. At the end of any time slot, test have to be green
5. Repeat until you want or need

Facilitation
---
* Facilitator refers as a Product Owner
* It can provide some scenarios to verify the overall quality of the code

The kata
===
In Jet Supermarket we have a checkout system that only can do one kind of offers, 
based on quantities of the same item (eg. 1 apple for 50 cents, 3 apples for 1.20 dollars).  
A the moment items are priced individually in cents (e.g. 1 apple costs 50 cents), 
while some items are multipriced: buy _x_ of them, and they’ll cost you _n_ cents.   

In fact the current prices are:  

|Item       | Unit Price  | Special Price |   
|-----------|-------------|---------------|
| apple     | 50          | 3 for 130     |   
| pear      | 30          | 2 for 45      |   
| pineapple | 220         |               |   
| banana    | 60          |               |   


Our checkout accepts items in any order, so that if we scan a pear, a pineapple, 
and another pear, we’ll recognize the two pear's and price them at 45 cents 
(for a total price so far of 265 cents).   
Because the pricing changes frequently, we pass in a set of pricing rules 
each time we start handling a checkout transaction.  

Now, we think that having more items and offers will boost our earnings; so we are asking to:
* add these items:
  * mango -> 155 cents
  * coconut -> 233 cents
  * strawberry -> 120 cents
  * orange -> 45 cents
  * peach -> 40 cents

* implement a new offers system that lets us apply new pricing rules:
  * 3 x 2 offers (buy 2, get 3)
  * _n_ x _m_ offers (buy n, get m)
  * combo offers (eg. buy 3 apple and you will obtain an additional pear)
  
 ...[to be continued]...



