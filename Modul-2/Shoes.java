
/**
 * Write a description of class Shoes here.
 *
 * @author Linh Phuong Tra
 * @version 18.01.2022
 */
public class Shoes
{
   private String name;
   private String colour;
   private String brand;
   private int size;
   
   public Shoes(String type, String shoesColour)
   {
       name = type;
       colour = shoesColour;
       brand = "unknow";
       size = 0;
   }
   
   public String getName()
   {
       return name;
   }
   
   public String getColour()
   {
       return colour;
   }
   
   public void setBrand(String newBrand)
   {
       brand = newBrand;
   }
   
   public int getSize()
   {
       return size;
   }
   
   public void insertSize(int yoursize)
   {
       if(yoursize >= 36){
           size = size + yoursize;
        }
       else{
        System.out.println("Unfortunately, your size: " + (size + yoursize) + " is not available now.");
        }     
   }
   
   public void printShoes()
   {
       if(size >= 36){
           System.out.println("You want to buy a pair of " + name);
           System.out.println("Colour: " + colour);
           System.out.println("Brand: " + brand);
           System.out.println("Size: " + size);
       }
       else{
           System.out.println("Your size is currently unavailable. We will let you know when it is back to our store.");
        }    
   }
}
