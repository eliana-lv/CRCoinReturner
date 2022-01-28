
/**
 * The CRCoinReturner tester tests the CRCoinReturner cash register 
 * class, which is able to return specific Coin objects as change.
 * 
 * @author Richard White 
 * @version 2017-01-30
 */
public class CRCoinReturnerTester
{
    static final double EPSILON = 1E-12;
    
    public static void main(String[] args)
    {
        int testsPassed = 0;
        System.out.print("Constructing Cash register...");
        CRCoinReturner r = new CRCoinReturner();
        System.out.println("Cash register constructed successfully!");
        testsPassed++;
        System.out.println("Tests passed: " + testsPassed + "/8");
        
        System.out.print("Constructing Coin 'quarter'...");
        Coin quarter = new Coin("quarter",0.25);
        System.out.println("constructed successfully!");
        testsPassed++;
        System.out.println("Tests passed: " + testsPassed + "/8");
        
        System.out.print("Constructing Coin 'penny'...");
        System.out.println("Creating Coin 'penny'...");
        Coin penny = new Coin("penny", 0.01);
        
        System.out.println("Creating Coin 'Susan B. Anthony'...");
        Coin dollar = new Coin("Susan B. Anthony", 1.00);
        
        System.out.print("Recording purchase...");
        r.recordPurchase(7.81);
        System.out.println("7.81 purchase successfully recorded!");
        testsPassed++;
        System.out.println("Tests passed: " + testsPassed + "/8");
        
        r.recordPurchase(200.00);
        System.out.println("200.00 additional purchase recorded.");
        
        System.out.print("Getting payment in quarters...");
        r.enterPayment(22, quarter);
        System.out.println("Payment of 22 quarters successfully entered!");
        testsPassed++;
        System.out.println("Tests passed: " + testsPassed + "/8");
        
        r.enterPayment(3, penny);
        System.out.println("Payment of 3 pennies entered.");
        
        r.enterPayment(204, dollar);
        System.out.println("Payment of 204 dollars entered.");
        
        System.out.println("Total payment of 209.53 entered");
        System.out.println("Getting change for 1.72");
        System.out.print("Getting change in dollars...");
        int dollarResult = r.giveChange(dollar);
        if (dollarResult == 1) 
        { 
            System.out.println("dollar test passed");
            testsPassed++; 
        }
        else
        {
            System.out.println("dollar test failed");
        }
        System.out.println("Tests passed: " + testsPassed + "/8");
        
        System.out.println("Getting change in quarters...");
        int quarterResult = r.giveChange(quarter);
        if (quarterResult == 2) 
        { 
            System.out.println("quarter test passed");
            testsPassed++; 
        }
        else
        {
            System.out.println("quarter test failed");
        }
        System.out.println("Tests passed: " + testsPassed + "/8");
        
        System.out.println("Getting change in pennies...");
        int pennyResult = r.giveChange(penny);
        if (pennyResult == 22) 
        { 
            System.out.println("penny test passed");
            testsPassed++; 
        }
        else
        {
            System.out.println("penny test failed");
        }
        
        System.out.println("First transaction concluded.");
        System.out.print("Recording new purchase...");
        r.recordPurchase(1);
        r.enterPayment(120,penny);
        System.out.println("Getting change in pennies...");
        int transaction2Result = r.giveChange(penny);
        if (transaction2Result == 20) 
        { 
            System.out.println("Second transaction passed");
            testsPassed++; 
        }
        else
        {
            System.out.println("Second transaction test failed");
        }
         
        System.out.println("Tests passed: " + testsPassed + "/8");
        
    }
}