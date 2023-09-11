/* Author: Savaas Iqbal
   Date: 12/8/22
   Purpose: Create an array that will generate random numbers. The numbers will alternate in being added or subtracted. Find the total and output it. 
*/
import java.util.Random; 

public class arrayLab {
   // Random object to generate random numbers
   static Random generator = new Random(); 
   public static void main(String[] args){
      
      //declare an array to store the random numbers
      int[] numbers = new int[15]; 
      //fill the array with random numbers
      fillArray(numbers);
      
      //output the array with operations
      printArray(numbers);
      //calculate the alternating sum and difference of all the elements of the array
      System.out.println(calculate(numbers));
   }
   //this method fills array with random numbers
   public static void fillArray(int[] list){
      for (int i = 0; i < list.length; i++){
         list[i] = generator.nextInt(20)+1; 
      }
   }
   //this method outputs the array with the operations
   public static void printArray(int[] list){
      for(int i = 0; i <list.length; i++){
         System.out.print(list[i]);
         if (i % 2 == 0 && i < list.length-1)
            System.out.print(" - ");
         else if (i < list.length - 1)
            System.out.print(" + "); 
      }
      System.out.print(" = ");

   }
   //This method will calculate the alternating sum
   public static int calculate(int[] list){
      int sum = 0; 
      for(int i = 0; i < list.length; i++){
         if (i % 2 != 0)
            sum -= list[i]; 
         else 
            sum+= list[i];
      }
      return sum; 
   }

}
/*
Output:
 14 - 19 + 2 - 17 + 6 - 10 + 15 - 16 + 14 - 3 + 13 - 8 + 10 - 7 + 9 = 3
*/
