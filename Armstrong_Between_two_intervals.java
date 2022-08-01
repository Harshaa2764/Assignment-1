/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment.pkg1;

import java.util.Scanner;

/**
 *
 * @author Harshada
 */
public class Armstrong_Between_two_intervals {
  public static void main(String[] args) {
      int my_low, my_high, i;
      Scanner my_scanner = new Scanner(System.in);
      System.out.println("Enter the first number :");
      my_low = my_scanner.nextInt();
      System.out.println("Enter the limit :");
      my_high = my_scanner.nextInt();
      System.out.println("The Armstrong numbers are :");
      for(i = my_low + 1; i < my_high; ++i) {
         if (IsArmstrong (i))
            System.out.print(i + " ");
      }
   }
   public static boolean IsArmstrong(int i) {
      int check, my_rem, my_sum;
      my_sum = 0;
      check = i;
      while(check != 0) {
         my_rem = check % 10;
         my_sum = my_sum + (my_rem * my_rem * my_rem);
         check = check / 10;
      }
      if(my_sum == i){
         return true;
      }
      return false;
   }  
}
