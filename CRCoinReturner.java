/**
 * A CRCoinReturner is a cash register that totals up sales, 
 * accepts Coin objects for payment, computes change due, and 
 * returns Coin objects for change.
 * @author
 * @version
 */

public class CRCoinReturner
{

    private double payment; 
    private double change;
    private double purchase;

    public static final double EPSILON = 1E-21;
    public final int PRECISION = 100; 

    /**
    Constructs a cash register with no money in it.
     */
    public CRCoinReturner()
    {
        payment = 0; 
        purchase = 0;
        change = 0; 
    }

    /**
    Records the sale of an item.
    @param amount the price of the item
     */
    public void recordPurchase(double amount)
    {

        purchase += amount; 
    }

    /**
     * Enters the payment received from the customer; 
     * it should be called once for each coin type.
     * @param coinCount the number of coins
     * @param coinType the type of the coins in the payment
     */
    public void enterPayment(int coinCount, Coin coinType)
    {
        payment += coinCount * coinType.getValue(); // adding to payment everytime 
    }

    /**
    Returns the number of coins of a particular type to return.
    @param coinType the type of coin in which change will be returned
    @return the change due to the customer in the specified coinType
     */
    public int giveChange(Coin coinType)
    {
        double changeToReturn = Math.round((payment - purchase - change)* PRECISION) / (PRECISION * 1.0); // how much will be returned 
        int changeAmount = ((int) (changeToReturn *PRECISION) / (int)(coinType.getValue() * PRECISION)); // conversion 
        double returned = changeAmount * coinType.getValue(); //getting the actual change 
        change += returned; 

        if (Math.abs(payment - purchase - change - 0) <= EPSILON)
        {
            purchase = 0; 
            payment = 0; 
            change = 0; 
        }
        return changeAmount; 
    }    

    public double getPayment()
    {
        return payment; 
    }
}