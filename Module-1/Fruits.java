
/**
 * Write a description of class Fruit here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Fruits
{
    private String name; //Name of fruit: apple, orange, mango
    private int price; //Total price that customers need to pay
    private double weight; //Total kilogram customers buy    
    private String unit; //unit:kilogram
    private int balance; //The total amount of money entered by customers
    private int total; //The total amount of money collected 
    
    public Fruits(String nameoffruit, int cost, double kilogram)
    {
        name = nameoffruit;
        price = cost;
        weight = kilogram;        
        unit = "kilogram";
        balance = 0;
        total = 0;
        
    }
    
    /**
     * Return The name of fruit
     */
    public String getName()
    {
        return name;
    }    
    
    /**
     * Return the total price that the customer needs to pay
     */
    public int getPrice()
    {
        return price;
    } 
    
    /**
     * Return how many weight that customer buy in total
     */
    public double getWeight()
    {
        return weight;
    }
    
    /**
     * Return unit of weight
     */
    public String getUnit()
    {
        return unit;
    }
    
    /**
     * Return the amount of money that customer insert.
     */
    public int getBalance()
    {
        return balance;
    }
    
    /**
     * Total amount of money that selger receives from customer
     */
    public void insertMoney(int amount)
    {
        if(amount > 0){
            balance = balance + amount;
        }
        
        else{
            System.out.println("You have not paid " + price + " kr for " + weight + " " + unit + " " + name + ". Please enter the correct amount again.");
        }
    }    
    
    /**
     * Print 
     */
    public void printFruit()
    {
        if(balance >= price){
            System.out.println("We have received your payment: " + price + " kroner.");
            System.out.println("Thank you very much. See you next time. ");
            total = total + price;
            balance = balance - price;
        }
        
        else{
            System.out.println("You have not paid for " + weight + unit + name + ". Please enter the amount: " + (price - balance) + " again.");
            
        }
    }
}
