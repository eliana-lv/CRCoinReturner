/**
 * A coin with a monetary value, identified by name and value 
 * (in any arbitrary, unnamed, but consistent, unit).
 * @author Richard White
 * @version 2014-01-09
*/

public class Coin
{   
   private double value;
   private String name;
   
   /**
      Constructs a coin.
      @param aValue the monetary value of the coin.
      @param aName the name of the coin
   */
   public Coin(String aName, double aValue) 
   { 
      value = aValue; 
      name = aName;
   }

   /**
      Gets the coin value.
      @return the value
   */
   public double getValue() 
   {
      return value;
   }

   /**
      Gets the coin name.
      @return the name
   */
   public String getName() 
   {
      return name;
   }
}