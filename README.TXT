The CRCoinReturner class is a CashRegister object that works as before: it is 
able to

* record purchases 
* accept Coin objects for payment
* give change at the end of the transaction.

Previous version of this CashRegister had a .giveChange() method that simply 
reported how much money was due to the buyer. In this version, the .giveChange() 
method accepts a Coin parameter and returns the number of coins of that value 
that should be rendered to the buyer in change.

Note that the Runner/Tester class will need to call the .giveChange() method
with decreasing values of Coin objects in order to work correctly. A tester has 
been provided for your convenience, and it demonstrates that process.

Examine the classes provided as a starting point for implementing CRCoinReturner 
class, and examine the Tester for examples of how .giveChange() is called with
various Coin objects.



