public class Card implements Comparable
{
    private String suit;
    private int value;
    private String valueasString;
    static private int numcards;

   public int compareTo(Object x)
   {
       Card y = (Card) x;
       if (getValue() == y.getValue())
       return 0;
       else if (getValue() > y.getValue())
       return 1;
       else
       return -1;
    }
   
   static public int getNumCards()
   {
       return numcards;
    }
    
   public Card()
   {
     int suitid = (int) ((Math.random() * 4) + 1);
     numcards += 1;   
     if (suitid == 1)
        {
            suit = "Clubs";
        }
     if (suitid == 2)
        {
            suit = "Spades";
        }
     if (suitid == 3)
        {
            suit = "Hearts";
        }
     if (suitid == 4)
        {
            suit = "Diamonds";
        }
        
     value = (int) ((Math.random() * 13) + 2);
   }
   
   public Card(int valor, String tux)
   {
       suit = tux;
       numcards += 1; 
       value = valor;
    }
    
   public String getSuit()
    {
        return suit;
   }

   public int getValue()
   {
       return value;
   }

   public String getvalueasString()
   {
       if (value >= 2 && value <= 14)
        {
        
        if (value == 2)
        {
            valueasString = "Two";
        }
        
        if (value == 3)
        {
            valueasString = "Three";
        }
        
        if (value == 4)
        {
            valueasString = "Four";
        }
        
        if (value == 5)
        {
            valueasString = "Five";
        }
        
        if (value == 6)
        {
            valueasString = "Six";
        }
        
        if (value == 7)
        {
            valueasString = "Seven";
        }
        
        if (value == 8)
        {
            valueasString = "Eight";
        }
        
        if (value == 9)
        {
            valueasString = "Nine";
        }
        
        if (value == 10)
        {
            valueasString = "Ten";
        }
        
        if (value == 11)
        {
            valueasString = "Jack";
        }
        
        if (value == 12)
        {
            valueasString = "Queen";
        }
        
        if (value == 13)
        {
            valueasString = "King";
        }
        
        if (value == 14)
        {
            valueasString = "Ace";
        }
        
       }
       
       return valueasString;
   }
   
   public String toString()
   {
       String summary = getvalueasString() + " of " + getSuit();
       
       return summary;
    }
   
    // We need some getter and setter methods:
    // int getValue()
    // String getvalueasString()
    // **** maybe needs a helper method that translates the values into String (void method)
    
    
    
    
    // don't forget your public String toString() !!
}
