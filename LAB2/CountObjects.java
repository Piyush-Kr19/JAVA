/*
Program to find no. of objects created out of a class using ‘static’ modifier.
*/
public class CountObjects
{
   //variable to keep track of objects
   private static int count;  

   //constructor
   public CountObjects()   
   {        
     count++;   // increase the count variable by 1 
   }  

   public static void main(String[] args)
   {
     //creating objects  
     CountObjects ob1 = new CountObjects();  
     CountObjects ob2 = new CountObjects();  
     CountObjects ob3 = new CountObjects();  
     CountObjects ob4 = new CountObjects();  
     CountObjects ob5 = new CountObjects(); 
 
     //prints number of objects  
     System.out.print("Total Number of Objects: " + CountObjects.count);
     // One can also write with  ob5.count or ob1.count and the output would be same since 
     // a static member is shared by all objects of the class.  
   }
}
